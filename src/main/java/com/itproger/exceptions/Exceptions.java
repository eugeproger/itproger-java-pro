package com.itproger.exceptions;

public class Exceptions {

    public static void main(String[] args) {

        int[] array = {23, 6, 7};

        try {
            System.out.println(array[3]);
            int x = 100 / 0;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Error: " + arithmeticException);
        } catch (Exception exception) {
            System.out.println("Error " + exception);
        } finally {
            System.out.println("Finally is working");
        }
    }
}
