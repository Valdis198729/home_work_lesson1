package com.geekbrains;

public class main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.print("Orange\nApple\nBanana\n");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = 9;
        int result = a + b;
        if (result >= 0) {
            System.out.println("Суммуа положительная");
        } else {
            System.out.println("Суммуа отрицательная");
        }
    }

    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value != 0 && value <= 100){
            System.out.println("Желтый");
        } else{
            System.out.println("зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 200;
        int b = 30;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println ("a < b");
        }
    }
}
