package com.impatient.Practice;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.Arrays;

/**
 * Created by sjchen on 8/8/16.
 */
public class OpenCSV {
    public static void main(String[] arg) throws Exception{
        CSVReader reader = new CSVReader(new FileReader("./Data/myCSV.csv"));
        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            // nextLine[] is an array of values from the line
            System.out.println(Arrays.toString(nextLine));
        }
    }
}