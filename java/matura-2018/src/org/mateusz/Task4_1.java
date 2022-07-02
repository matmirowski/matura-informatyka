package org.mateusz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task4_1 {
    public static void run() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("sygnaly.txt"));
        String line;
        int line_number = 1;
        String result = "";

        while ((line = reader.readLine()) != null) {
            line = line.strip();
            if (line_number % 40 == 0) { // if it can be devided by 40
                result = result + line.charAt(9);
            }
            line_number++;
        }

        System.out.println("Task 4.1");
        System.out.println("Result: " + result);
        System.out.println();

    }
}
