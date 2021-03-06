package org.mateusz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task4_3{
    public static void run() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("pary.txt"));
        String line;
        String[] numAndWord;
        boolean firstWord = true;
        String lowestWord = "";

        while ((line = reader.readLine()) != null) {
            numAndWord = line.strip().split(" ");
            int number = Integer.parseInt(numAndWord[0]);
            String word = numAndWord[1];

            if (number != word.length()) // if number isnt equal to length of world, we skip that case
                continue;

            if (firstWord) { // if it's first word, we set it to be lowestWord
                firstWord = false;
                lowestWord = word;
                continue;
            }

            if (number < lowestWord.length()) // if its number is lower than currently lowest number
                lowestWord = word;

            else if (number == lowestWord.length()) // if its number is equal to corrently lowest number
                if (word.compareTo(lowestWord) < 0) // we have to check if word is lower alphabetically
                    lowestWord = word;

        }

        System.out.println();
        System.out.println("Task 4.3");
        System.out.println(lowestWord.length() + " " + lowestWord);
    }

}
