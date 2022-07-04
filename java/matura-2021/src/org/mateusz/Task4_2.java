package org.mateusz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task4_2 {
    public static void run() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("instrukcje.txt"));
        String line;
        String result = "";

        int longestSeriesLength = 0;
        String longestSeries = "";
        int currentSeriesLength = 0;
        String currentSeries = "";

        while ((line = reader.readLine()) != null) {
            String[] order = line.strip().split(" ");
            String word = order[0];

            if (word.equals(currentSeries)) { // if it's the same order as the previous one
                currentSeriesLength++;
                if (currentSeriesLength > longestSeriesLength) { // if it's now the longest series
                    longestSeriesLength = currentSeriesLength;
                    longestSeries = currentSeries;
                }
            }
            else { // if it's new order
                currentSeries = word;
                currentSeriesLength = 1;
            }

        }
        System.out.println("Task 4.2");
        System.out.println(longestSeries + " " + longestSeriesLength);

    }
}
