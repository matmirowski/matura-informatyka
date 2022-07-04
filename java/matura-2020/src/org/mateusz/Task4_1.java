package org.mateusz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Task4_1 {
    public static void run() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("pary.txt"));
        String line;
        String[] numAndWord;
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        primeNumbers.add(2);

        for (int i=3; i<100; i++) {
            if (isPrime(i))
                primeNumbers.add(i);
        }

        while ((line = reader.readLine()) != null) {
            numAndWord = line.strip().split(" ");
            int number = Integer.parseInt(numAndWord[0]);

            if (number % 2 == 0) // if it's even, we can check it
                System.out.println(sum(primeNumbers, number));
        }


    }

    private static boolean isPrime(int number) {
        for (int i=2; i<number; i++)
            if (number % i == 0)
                return false;
        return true;
    }

    private static String sum(ArrayList<Integer> primeNumbers, int number) {
        for (int primeNum1 : primeNumbers) {
            for (int primeNum2 : primeNumbers) {
                if (primeNum1 + primeNum2 == number) {
                    return (number + " " + primeNum1 + " " + primeNum2);
                }
            }
        }
        return null;
    }

}
