package com.arafat.structural.addapter;

import com.arafat.structural.addapter.connect.Calculate;

import java.io.*;
import java.util.Scanner;

public class AdapterDriver {
    public static void main(String[] args) throws IOException {
        Calculate calculate = new Calculate();
        FileReader fr =
                new FileReader("test.txt");

        File file = new File("test.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        System.out.println("Choose a file type:\n   1. Integer\n   2.Character\n");

        Scanner scanner = new Scanner(System.in);

        String filetype = scanner.nextLine();
        if (filetype.equals("1"))
            calculate.calculateSum(fr,"integer");
        else if (filetype.equals("2")){
            calculate.calculateSum(fr,"character");

        }
        else {
            System.out.println("Invalid input type");
        }
    }
}
