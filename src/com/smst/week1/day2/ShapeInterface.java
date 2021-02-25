package com.smst.week1.day2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ShapeInterface {
  public static void main(String[] args) {
    circle.calculateArea(6.5, 3.1415);
    circle.displayArea();

    rectangle.calculateArea(8.3, 5.6);
    rectangle.displayArea();

    triangle.calculateArea(7.65, 10.21);
    triangle.displayArea();

  }

  static Circle circle = new Circle();
  static Rectangle rectangle = new Rectangle();
  static Triangle triangle = new Triangle();
}

interface IShape {
  // interface methods are abstract by default
  void calculateArea(double firstMeasurement, double secondMeasurement);

  void displayArea();

  default double round(double value, int places) {
    if (places < 0)
      throw new IllegalArgumentException();

    BigDecimal bd = BigDecimal.valueOf(value);
    bd = bd.setScale(places, RoundingMode.HALF_UP);
    return bd.doubleValue();
  }
}

class Circle implements IShape {

  private double area;

  @Override
  public void calculateArea(double radius, double PI) {

    this.area = Math.pow((double) ((radius / 2) * PI), 2);

  }

  @Override
  public void displayArea() {
    System.out.println("area of circle: " + round(this.area, 2));
  }
}

class Rectangle implements IShape {

  private double area;

  @Override
  public void calculateArea(double width, double length) {
    this.area = width * length;
  }

  @Override
  public void displayArea() {
    System.out.println("area of rectangle: " + round(this.area, 2));
  }
}

class Triangle implements IShape {

  private double area;

  @Override
  public void calculateArea(double base, double height) {
    this.area = (0.5 * base) * height;
  }

  @Override
  public void displayArea() {
    System.out.println("area of triangle: " + round(this.area, 2));
  }
}
