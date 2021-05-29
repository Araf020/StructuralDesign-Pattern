package com.arafat.structural.addapter;

import com.arafat.structural.addapter.connect.Calculate;

import java.io.*;

public class AdapterDriver {
    public static void main(String[] args) throws IOException {
        Calculate calculate = new Calculate();
        FileReader fr =
                new FileReader("E:\\Structural Design Pattern\\test.txt");

        File file = new File("E:\\Structural Design Pattern\\test.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        calculate.calculateSum(fr,"integer");
    }
}
