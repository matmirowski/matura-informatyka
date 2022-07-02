package org.mateusz;

import java.io.*;

public class Task6_1 {

    public static void run() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("dane.txt"));
        String line;
        String[] numbers;
        int brightest = 0;
        int darkest = 255;

        while ((line = reader.readLine()) != null) {
            numbers = line.split(" ");

            for(int i=0; i<320; i++) {
                int num = Integer.parseInt(numbers[i]);
                if (num > brightest) {
                    brightest = num;
                }
                if (num < darkest) {
                    darkest = num;
                }
            }
        }

        System.out.println("Task 6.1");
        System.out.println("Brightest: " + brightest);
        System.out.println("Darkest " + darkest);
        System.out.println();
        reader.close();
    }
}
