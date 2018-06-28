package ru.stqa.oft.sandbox;

public class myFirstProgram {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
  //      hello("world");
  //      hello("user");
  //      hello("Bartosz");

  //      double l = 5;
  //      System.out.println("pole kwadratu o boku "+ l +" = " + area(l));

  //      double a = 4;
  //      double b = 6;
  //      System.out.println("pole prostokatu o boku "+ a + " i " + b +" = " + area(a, b));


        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        System.out.println("Distance between points: +" + distance(p1, p2));
    }
   // public static void hello(String somebody)  {
   //     System.out.println("Hello, " + somebody +"!");
   // }

   // public static double area(double len){
   //    return len * len;
   // }

    //public static double area(double a, double b){
    //return a * b;
    //}
    public static double distance(Point p1, Point p2){
        double dx;
        double dy;
        dx = p2.x - p1.x;
        dy = p2.y - p1.y;

        return Math.sqrt((dx * dx) + (dy * dy));

    }
}