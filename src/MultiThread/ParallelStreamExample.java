package MultiThread;

import java.util.List;

public class ParallelStreamExample {
    public record Student(String name, int score) {
        public int getScore() {
            return score;
        }
        @Override
        public String toString() {
            return "Student{name='" + name + "', score=" + score + '}';
        }
    }
    public record ClassModel(List<Student> students){

        public int getTotalScoreParallel() {
            return students.parallelStream()
                    .mapToInt(Student::getScore)
                    .sum();
        }

        public int getTotalScoreSequential() {
            return students.stream()
                    .mapToInt(Student::getScore)
                    .sum();
        }
    }

    public static void main(String[] args) {
        ClassModel myClass = getClassModel();

        // Đo hiệu suất của stream tuần tự
        long startTimeSequential = System.nanoTime();
        int totalScoreSequential = myClass.getTotalScoreSequential();
        long endTimeSequential = System.nanoTime();
        long durationSequential = endTimeSequential - startTimeSequential;

        System.out.println("Total Score (Sequential): " + totalScoreSequential);
        System.out.println("Time taken (Sequential): " + durationSequential + " nanoseconds");

        // Đo hiệu suất của parallel stream
        long startTimeParallel = System.nanoTime();
        int totalScoreParallel = myClass.getTotalScoreParallel();
        long endTimeParallel = System.nanoTime();
        long durationParallel = endTimeParallel - startTimeParallel;

        System.out.println("Total Score (Parallel): " + totalScoreParallel);
        System.out.println("Time taken (Parallel): " + durationParallel + " nanoseconds");
    }

    private static ClassModel getClassModel() {
        List<Student> students = List.of(
                new Student("Alice", 100),
                new Student("Bob", 92),
                new Student("Carol", 80),
                new Student("David", 95),
                new Student("Eric", 88),
                new Student("Frank", 90),
                new Student("Gary", 85),
                new Student("Helen", 75),
                new Student("Ivy", 85),
                new Student("John", 70)
        );

        ClassModel myClass = new ClassModel(students);
        return myClass;
    }

}
