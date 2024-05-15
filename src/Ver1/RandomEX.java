package Ver1;

import java.util.Random;

public class RandomEX {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int abc = random.nextInt(0, 99);
            System.out.printf("Duplicate [%d]: %d%n", i, abc);
        }
    }
}


