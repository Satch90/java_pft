package ru.stqa.oft.sandbox;

import com.sun.xml.internal.bind.v2.util.EditDistance;
import sun.awt.geom.AreaOp;
import javax.swing.plaf.synth.SynthPopupMenuUI;

import static java.lang.Math.pow;

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


    // System.out.println("Distance between points: +" + distance(p1, p2));

    //double distance = distance(p1, p2);

    //boolean weryfikacja = verify(p1, p2, distance);
    // System.out.println("Verification status (true / false):" + weryfikacja);


    Point p1 = new Point(1, 1);
    Point p2 = new Point(6, 4);


    // System.out.println(distance);


    System.out.println("Distance between points:" + p1.area(p1, p2));
    System.out.println("Verification status (true / false):" + area(p1, p2));


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

  public static boolean area(Point p1, Point p2) {
    double dx;
    double dy;
    dx = p2.x - p1.x;
    dy = p2.y - p1.y;

    double wynik;
    wynik = pow(dx, 2) + pow(dy, 2);


    double distance = p1.area(p1, p2);

    if ((int) wynik == (int) pow(distance, 2)) {
      return true;

    } else {
      return false;
    }


  }
}