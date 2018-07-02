package ru.stqa.oft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {


  @Test
  public  void testArea(){

    Point p1 = new Point(1, 1);
    Point p2 = new Point(2, 4);


    Point p = new Point(p1.x, p1.y);

    Assert.assertEquals(p.area(p1,p2), 3.1622776601683795);
  }
  @Test
  public  void testArea1(){

    Point p1 = new Point(3, 3);
    Point p2 = new Point(4, 4);


    Point p = new Point(p1.x, p1.y);

    Assert.assertEquals(p.area(p1,p2), 1.4142135623730951);
  }
  @Test
  public  void testArea2(){

    Point p1 = new Point(6, 6);
    Point p2 = new Point(9, 9);


    Point p = new Point(p1.x, p1.y);

    Assert.assertEquals(p.area(p1,p2), 4.242640687119285);
  }
}