package ru.stqa.oft.sandbox;

public class myFirstProgram {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        hello("world");
        hello("user");
        hello("Bartosz");

        double l = 5;
        System.out.println("pole kwadratu o boku "+ l +" = " + area(l));

        double a = 4;
        double b = 6;
        System.out.println("pole prostokatu o boku "+ a + " i " + b +" = " + area(a, b));

    }
    public static void hello(String somebody)  {
        System.out.println("Hello, " + somebody +"!");
    }

    public static double area(double len){
        return len * len;
    }

    public static double area(double a, double b){
    return a * b;
    }
}