package org.mateusz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Task4_2 {
    public static void run() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("liczby.txt"));
        String line;
        ArrayList<String> results = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            char[] digits = line.strip().toCharArray();
            int sum = 0;

            for (char digit : digits) {
                int digitInt = Character.getNumericValue(digit);
                sum = sum + factorial(digitInt);
            }

            if (sum == Integer.parseInt(line.strip()))
                results.add(line);
        }

        System.out.println("Task 4.2");
        for (String result : results) {
            System.out.println(result);
        }
        System.out.println();
    }

    private static int factorial(int digit) {
        if (digit == 1 || digit == 0) {
            return 1;
        }
        else {
            return digit * factorial(digit-1);
        }
    }
}
