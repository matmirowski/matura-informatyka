package org.mateusz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task4_2 {
    public static void run() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("sygnaly.txt"));
        String line;
        Set<Character> letters = new HashSet<>();

        ArrayList<String> results = new ArrayList<>();
        int result_length = 0;

        while ((line = reader.readLine()) != null) {
            letters.clear();
            line = line.strip();
            
            for (int i=0; i<line.length(); i++) {
                letters.add(line.charAt(i));
            }

            if (letters.size() > result_length) {
                results.clear();
                results.add(line);
                result_length = letters.size();
            }

        }

        System.out.println("Task 4.2");
        for (String result : results) {
            System.out.println(result + " " + result_length);
        }
        System.out.println();
    }
}
