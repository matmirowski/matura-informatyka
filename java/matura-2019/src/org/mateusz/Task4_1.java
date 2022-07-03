package org.mateusz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task4_1 {
    public static void run() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("liczby.txt"));
        String line;
        int result = 0;

        while ((line = reader.readLine()) != null) {
            int number = Integer.parseInt(line.strip());
            if (isPowerOf3(number))
                result++;
        }

        System.out.println("Task 4.1");
        System.out.println("Result: " + result);
        System.out.println();
    }

    private static boolean isPowerOf3(int number) {
        for (int i=1; i<100001; i=i*3) {
            if (number == i)
                return true;
        }
        return false;
    }
}
