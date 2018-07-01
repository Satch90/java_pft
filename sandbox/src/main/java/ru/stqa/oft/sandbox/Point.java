package ru.stqa.oft.sandbox;

public class Point {


  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }


  public double area(Point p1, Point p2){ //P
    double dx;
    double dy;
    dx = p2.x - p1.x;
    dy = p2.y - p1.y;

    return Math.sqrt((dx * dx) + (dy * dy));

  }

  }
