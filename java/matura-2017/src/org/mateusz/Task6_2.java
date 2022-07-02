package org.mateusz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class Task6_2 {
    public static void run() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("dane.txt"));
        String line;
        int invalidLines = 0;

        while ((line = reader.readLine()) != null) {
            String[] numbers = line.split(" ");

            if (!isPalindrome(numbers)) {
                invalidLines++;
            }

        }
        System.out.println("Task 6.2");
        System.out.println("Invalid lines: " + invalidLines);
        System.out.println();
    }

    private static boolean isPalindrome(String[] numbers) {
        for (int i=0; i<320; i++) {
            if (!numbers[i].equals(numbers[319-i])) {
                return false;
            }
        }
        return true;
    }



}
