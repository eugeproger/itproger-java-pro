package com.itproger.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reading {

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("newFile.txt"));
            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ioException) {
            System.out.println("Error: " + ioException);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException ioException) {
                System.out.println("Error: " + ioException);
            }
        }
    }
}
