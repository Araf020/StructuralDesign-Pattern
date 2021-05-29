package com.arafat.structural.addapter.connect;

import com.arafat.structural.addapter.concrete.MoreSum;
import com.arafat.structural.addapter.concrete.SumOfAscii;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SumAdapter implements Sum {

    private MoreSum sum;

    @Override
    public void calculateSum(FileReader br, String inputType) throws IOException {

        Scanner s = new Scanner(br);



        if (inputType.equalsIgnoreCase("character")){
            sum = new SumOfAscii();
            System.out.println("\nAdding characters ascii value with adapter support..");
            sum.asciiSum(s);
        }
        else
        {
            System.out.println("\nInvalid input type");
        }



    }

}
