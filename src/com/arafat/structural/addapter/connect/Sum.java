package com.arafat.structural.addapter.connect;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public interface Sum {

    void calculateSum(FileReader br, String inputType) throws IOException;
}
