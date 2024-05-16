package MultiThread;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MultiThread {
    private static final String URL = "jdbc:sqlserver://localhost:1433;database=bmb.tuan.ha;encrypt=true;trustServerCertificate=true;";
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String USERNAME = "tuan.ha";
    private static final String PASSWORD = "123";
    private static final String QUERY = "SELECT * FROM dbo.Student";
    static final JDBCConnect connect = new JDBCConnect(DRIVER, URL, USERNAME, PASSWORD, QUERY);

    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom();
        List<Student> student = getStudent();
        // Thread to add students to the classroom
        Thread addStudentsThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                classRoom.addStudent(student);
                try {
                    Thread.sleep(1000); // Giả lập thời gian thêm học sinh
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread to print the list of students in the classroom
        Thread printStudentsThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                classRoom.printStudents();
                try {
                    Thread.sleep(1500); // Giả lập thời gian in danh sách học sinh
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        addStudentsThread.start();
        printStudentsThread.start();

        // Wait for both threads to finish
        try {
            addStudentsThread.join();
            printStudentsThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public record Student(Integer id, String name, Date create_at) {

    }

    public record ClassRoom() {
        private static List<Student> students = new ArrayList<>();

        public synchronized void addStudent(List<Student> student) {
            students.addAll(student);
            int i = 1;
            for (Student st : students){
                System.out.println("Added student: {" + i + "}: " + st.id);
                i++;
            }
        }

        public synchronized void printStudents() {
            System.out.println("Current students in the classroom:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public static List<Student> getStudent() {
        List<Student> students = new ArrayList<>();
        try {
            Connection con = connect.getConnectDb();
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(QUERY);
            while (rs.next()) {
                students.add(new Student(rs.getInt("id"), rs.getString("name"), rs.getDate("create_at")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
