package org.mateusz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Task4_3 {
    private static int highestValue = 0;
    private static char highestLetter = ' ';
    public static void run() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("instrukcje.txt"));
        String line;
        String result = "";
        HashMap<Character, Integer> letterToCount = generateMap();

        while ((line = reader.readLine()) != null) {
            String[] order = line.strip().split(" ");

            if (order[0].equals("DOPISZ")) {
                char letter = order[1].charAt(0);
                int counter = letterToCount.get(letter);
                counter++;
                letterToCount.put(letter, counter);
            }
        }

        letterToCount.forEach((letter, value) -> {
            if (value > highestValue) {
                highestValue = value;
                highestLetter = letter;
            }
        });

        System.out.println("Task 4.3");
        System.out.println(highestLetter + " " + highestValue);
    }

    public static HashMap<Character,Integer> generateMap() {
        HashMap<Character, Integer> letterToCount = new HashMap<>();
        for (int i=65; i<=90; i++) {
            letterToCount.put((char) i, 0);
        }
        return letterToCount;
    }
}
