/*
* File: Solution.java
* Author: Doktor Kristóf Márk
* Copyright: 2026, Doktor Kristóf Márk
* Group: Szoft I/N
* Date: 2026-03-30
* Github: https://github.com/Dokkristof/
* Licenc: MIT
*/



/*
* File: Solution.java
* Author: Doktor Kristóf Márk
* Copyright: 2026, Doktor Kristóf Márk
* Group: Szoft I/N
* Date: 2026-03-30
* Github: https://github.com/Dokkristof/
* Licenc: MIT
*/

package com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public void task() {
        double[] temp = readTemp();
        printAverage(temp);
        writeToFile(temp, "hovek.txt");
    }

    private double[] readTemp() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        System.out.println("Adja meg a hőmérsékletet!:");

        while (sc.hasNextDouble()) {
            list.add(sc.nextDouble());
        }

        double[] array = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    };

    private void printAverage(double[] array) {
        double sum = 0;

        for (double value : array) {
            sum += value;
        }

        double average = (array.length > 0) ? sum / array.length : 0;

        System.out.println("Átlaghőmérséklet: " + average);
    }

    private void writeToFile(double[] array, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (double t : array) {
                writer.write(t + " ");
            }
            System.out.println("Mentés sikeres: " + fileName);
        } catch (IOException e) {
            System.out.println("Hiba a fájl írásakor!");
        }
    }
}