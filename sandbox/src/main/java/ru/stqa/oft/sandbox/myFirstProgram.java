package ru.stqa.oft.sandbox;

public class myFirstProgram {

  public static void main(String[] args) {

    Point p1;
    Point p2;
    p1 = new Point(1.0, 1.0);
    p2 = new Point(5.0, 1.0);
    double distance = p1.distance(p2);

    System.out.println("the result is " + distance);

  }
}