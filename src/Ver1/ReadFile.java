package Ver1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        readCSVFile("src/problems.csv");
        System.out.println("a");
    }

    public static void readCSVFile(String csvFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            String a;
            int correct = 0;
            int inCorrect = 0;
            while ((a = reader.readLine()) != null) {
                String[] parts = a.split("\\s*\\+\\s*|,\\s*");
                if (checkSumInteger(parts)) {
                    correct++;
                } else inCorrect++;
            }
            System.out.println("Số câu đúng: " + correct);
            System.out.println("Số câu sai: " + inCorrect);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static boolean checkSumInteger(String[] cells) {
        int a = Integer.parseInt(cells[0].trim());
        int b = Integer.parseInt(cells[1].trim());
        int c = Integer.parseInt(cells[2].trim());
        if ((a + b) == c) {
            return true;
        }
        return false;
    }
}
