package org.mateusz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class Task6_4 {
    public static void run() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("dane.txt"));
        String line;
        int[][] numArray = new int[320][200]; // [column][row]
        int rowNumber = 0;

        while ((line = reader.readLine()) != null) {
            String[] numbers = line.split(" ");

            for (int i=0; i<320; i++) {
                numArray[i][rowNumber] = Integer.parseInt(numbers[i]);
            }
            rowNumber++;
        }

        int longestStreak = 0;
        int longestStreakPixel = 0;
        int currentStreak = 0;
        int currentStreakPixel = 0;
        int pixel;

        for (int x=0; x<320; x++) {
            for (int y=0; y<200; y++) {
                pixel = numArray[x][y];
                if (y == 0) { // if that's first pixel in a column, we have to initialize variables:
                    currentStreak = 1;
                    currentStreakPixel = pixel;
                    continue;
                }
                else { // if that's not first pixel in a column
                    if (pixel == currentStreakPixel) { // if that's the same pixel as pixel before
                        currentStreak++;
                    }

                    else { // if that's a different pixel
                        currentStreak = 1;
                    }

                    if (currentStreak > longestStreak) { // if that's the longest streak
                        longestStreak++;
                        longestStreakPixel = pixel;
                    }
                }
                currentStreakPixel = pixel;

            }

        }

        System.out.println("Task 6.4");
        System.out.println("Longest pixel streak: " + longestStreak);
        System.out.println();

    }
}
