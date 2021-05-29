package com.arafat.structural.addapter.connect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Calculate implements Sum {
    SumAdapter sumAdapter;

    @Override
    public void calculateSum(FileReader br, String inputType) throws IOException {

        if (inputType.equalsIgnoreCase("integer")){
            Scanner s = new Scanner(br);

           int result=0;
           while (s.hasNext()){
               result+=s.nextInt();
           }
//            System.out.println("x: "+x+" y: "+y);
            System.out.println("\nAdding integers without adapter. \nresult: "+ result );
        }
        else {
            sumAdapter = new SumAdapter();
            sumAdapter.calculateSum(br,inputType);

        }
    }


}
