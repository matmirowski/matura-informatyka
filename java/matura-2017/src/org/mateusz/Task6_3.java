package org.mateusz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class Task6_3 {
    public static void run() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("dane.txt"));
        String line;
        int[][] numArray = new int[320][200]; // [column][row]
        int rowNumber = 0;
        int numberOfContrastPixels = 0;

        while ((line = reader.readLine()) != null) {
            String[] numbers = line.split(" ");

            for (int i=0; i<320; i++) {
                numArray[i][rowNumber] = Integer.parseInt(numbers[i]);
            }
            rowNumber++;
        }

        for (int x=0; x<320; x++) {
            for (int y = 0; y<200; y++) {
                if ((x==0 && y==0) || (x==319 && y==0) || (x==319 && y==199) || (x==0 && y==199)) { // we skip corners, they are not contrasting
                    continue;
                }

                else if (y==0) { // upper wall
                    if (Math.abs(numArray[x][y] - numArray[x-1][y])>128 || Math.abs(numArray[x][y] - numArray[x+1][y])>128
                            || Math.abs(numArray[x][y] - numArray[x][y+1])>128)
                        numberOfContrastPixels++;
                }

                else if (y==119) { // bottom wall
                    if (Math.abs(numArray[x][y] - numArray[x-1][y])>128 || Math.abs(numArray[x][y] - numArray[x+1][y])>128
                            || Math.abs(numArray[x][y] - numArray[x][y-1])>128)
                        numberOfContrastPixels++;
                }

                else if (x==0) { // left wall
                    if (Math.abs(numArray[x][y] - numArray[x + 1][y]) > 128 || Math.abs(numArray[x][y] - numArray[x][y - 1]) > 128
                            || Math.abs(numArray[x][y] - numArray[x][y + 1]) > 128)
                        numberOfContrastPixels++;
                }

                else if (x==319) { // right wall
                    if (Math.abs(numArray[x][y] - numArray[x - 1][y]) > 128 || Math.abs(numArray[x][y] - numArray[x][y - 1]) > 128
                            || Math.abs(numArray[x][y] - numArray[x][y + 1]) > 128)
                        numberOfContrastPixels++;
                }

                else { // center
                    if (Math.abs(numArray[x][y] - numArray[x + 1][y]) > 128 || Math.abs(numArray[x][y] - numArray[x][y - 1]) > 128
                            || Math.abs(numArray[x][y] - numArray[x][y + 1]) > 128 || Math.abs(numArray[x][y] - numArray[x - 1][y]) > 128)
                        numberOfContrastPixels++;
                }



            }
        }
        System.out.println("Task 6.3");
        System.out.println("Contrasting pixels: " + numberOfContrastPixels);
        System.out.println();
    }

    private static void checkContrast(int[][] numArray) {
        
    }

}
