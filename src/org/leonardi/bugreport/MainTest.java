package org.leonardi.bugreport;

import java.io.*;
import java.util.Scanner;

public class MainTest {
    public static void main(String[]args){
        Scanner fileIn;
        String fileName = "bugs\\test.txt";

        try {
            fileIn = new Scanner(new FileReader(fileName));
            while (fileIn.hasNextLine()) {
                System.out.println(fileIn.nextLine());
            }
            fileIn.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }


    }
}
