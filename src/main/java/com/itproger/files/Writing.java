package com.itproger.files;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Writing {

    public static void main(String[] args) {
        try {
            File file = new File("newFile.txt");
            if(!file.exists()) {
                file.createNewFile();
            }

            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("Everything is working");
            printWriter.println("Hello world");
            printWriter.println("Hello world 2");
            printWriter.close();
        } catch (IOException ioException) {
            System.out.println("Error: " + ioException);
        }

    }
}
