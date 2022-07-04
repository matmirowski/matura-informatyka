package org.mateusz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task4_2 {
    public static void run() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("pary.txt"));
        String line;
        String[] numAndWord;
        char[] letters;

        System.out.println("Task 4.2");
        while ((line = reader.readLine()) != null) {
            numAndWord = line.strip().split(" ");
            String word = numAndWord[1];
            letters = word.toCharArray();

            int longest_length = 1;
            char longest_char = ' ';

            int current_length = 1;

            for (int i=0; i<word.length(); i++) {
                if (i==0) {
                    longest_char = letters[0];
                    continue;
                }

                if (letters[i] == letters[i-1]) { // if it's the same char as previous one
                    current_length++;
                    if (current_length > longest_length) { // if it's the longest length
                        longest_length = current_length;
                        longest_char = letters[i];
                    }
                }
                else { // if it's different character
                    current_length = 1;
                }
            }

            for (int i=0; i<longest_length; i++) {
                System.out.print(longest_char);
            }
            System.out.print(" " + longest_length);
            System.out.println();
        }
    }
}
