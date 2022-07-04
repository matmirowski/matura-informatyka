package org.mateusz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task4_4 {
    public static void run() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("instrukcje.txt"));
        String line;
        String result = "";

        while ((line = reader.readLine()) != null) {
            String[] order = line.strip().split(" ");

            switch (order[0]) {
                case "DOPISZ" -> result = dopisz(result, order[1]);
                case "ZMIEN" -> result = zmien(result, order[1]);
                case "USUN" -> result = usun(result);
                case "PRZESUN" -> result = przesun(result, order[1]);
            }
        }
        System.out.println("Task 4.4");
        System.out.println(result);
    }

    private static String dopisz(String result, String letter) {
        return result + letter;
    }

    private static String zmien(String result, String letter) {
        char[] chars = result.toCharArray();
        chars[chars.length-1] = letter.charAt(0);
        return String.valueOf(chars);
    }

    private static String usun(String result) {
        char[] chars = result.toCharArray();
        chars[chars.length-1] = ' ';
        return String.valueOf(chars).strip();
    }

    private static String przesun(String result, String letter) {
        int letterIndex = result.indexOf(letter);

        if (letterIndex == -1)
            return result;

        char[] chars = result.toCharArray();
        int oldAscii = chars[letterIndex];

        if (oldAscii == 90)
            chars[letterIndex] = 'A';
        else {
            int newAscii = oldAscii+1;
            chars[letterIndex] = (char) newAscii;
        }
        return String.valueOf(chars);
    }
}
