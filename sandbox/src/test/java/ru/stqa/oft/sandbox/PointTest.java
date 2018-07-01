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
}
