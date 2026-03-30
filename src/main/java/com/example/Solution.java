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

        System.out.println("Adja meg a hőmérsékletet! (kilépés - k):");

        while (sc.hasNextDouble()) {
            list.add(sc.nextDouble());
        }

        double[] array = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }
}
    