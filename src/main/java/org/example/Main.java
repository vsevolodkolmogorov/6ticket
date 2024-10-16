package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Integer num = 360/0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}