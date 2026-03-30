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
import java.io.FileWriter;
import java.io.IOException;

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
    }

    private void printAverage(double[] array) {
        double sum = 0;

        for (double value : array) {
            sum += value;
        }

        double average;

        if (array.length > 0) {
            average = sum / array.length;
        } else {
            average = 0;
        }

        System.out.println("Átlaghőmérséklet: " + average);
    }
    private void writeToFile(double[] array, String fileName) {
            try {
                FileWriter writer = new FileWriter(fileName);

                for (double value : array) {
                    writer.write(value + " ");
                }

                writer.close();
                System.out.println("Sikeres mentés: " + fileName);

            } catch (IOException e) {
                System.out.println("Hiba! Probléma történt a fájl írásakor!");
            }
    }



}
    