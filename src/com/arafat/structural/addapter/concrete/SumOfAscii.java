package com.arafat.structural.addapter.concrete;

import java.util.Scanner;

public class SumOfAscii implements MoreSum {
    @Override
    public void asciiSum(Scanner characters) {
        int result=0;
       while (characters.hasNext()){


           result+=(int) characters.next().charAt(0);

       }
        System.out.println("Ascii sum: " + result);
    }
}
