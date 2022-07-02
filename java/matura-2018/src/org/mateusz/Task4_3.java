package org.mateusz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Task4_3 {
    public static void run() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("sygnaly.txt"));
        String line;
        ArrayList<String> results = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            int highest_ascii = 0;
            int lowest_ascii = 100;
            char[] chars = line.toCharArray();

            for (char letter: chars) {
                int ascii = (int) letter;
                if (ascii > highest_ascii)
                    highest_ascii = ascii;
                if (ascii < lowest_ascii)
                    lowest_ascii = ascii;
            }

            if ((highest_ascii - lowest_ascii) <= 10)
                results.add(line);
        }

        System.out.println("Task 4.3");
        for (String result : results) {
            System.out.println(result);
        }
    }
}
