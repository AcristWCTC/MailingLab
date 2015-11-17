/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labio;

import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Adam
 */
public class LabIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        boolean append = true;
        int count = 0;
        String filePath = File.separatorChar + "temp" + File.separatorChar
                + "lab.txt";

        File data = new File(filePath);

        List<String> records = new ArrayList<>();
        
        int recordRequest = 3;
        
        
        
        
        
        
        
        

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            while (line != null) {
                records.add(line);
                line = in.readLine();
            }

        } catch (IOException ioe) {
            System.out.println();
        } finally {
            try {
                in.close();
            } catch (Exception e) {

            }

//     -------------------------------------------------

            String spiltName = (records.get(recordRequest * 4 - 4));
            String[] name = spiltName.split(" ");
            String spiltCityStateZip= (records.get(recordRequest * 4 - 2));
            String[] cityStateZip = spiltCityStateZip.split(" ");
            
            System.out.println(name[0] + " " + name[1] + "'s state is " + cityStateZip[1]);

//     --------------------------------------------
//            PrintWriter out = new PrintWriter(
//                    new BufferedWriter(
//                            new FileWriter(data, append)));
//            out.println();
//            out.println();
//            out.println("Andrew Wintermeyer");
//            out.println("W ImaStreet 1111");
//            out.println("Peawaukee, WI 53112");
//
//            out.close();
//
//
//            //---------------------------------------- 
//            try {
//                in = new BufferedReader(new FileReader(data));
//                String line = in.readLine();
//                while (line != null) {
//                    System.out.println(line);
//                    line = in.readLine();  // strips out any carriage return chars 
//                }
//
//            } catch (IOException ioe) {

//            } finally {
//                try {
//                    in.close();
//                } catch (Exception e) {
//
//                }
        }
    }

}
