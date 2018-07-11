package ru.stqa.oft.sandbox;

public class Cat {
    private String name;
    private int age;
    private int energy;

    public Cat() {
      name = "mruczek";
      age = 1;
      energy = 55; // 0 - 100
    }

    public String getName(){
      return name;

  }
    public int getAge(){
      return  age;
    }
    public  int getEnergy(){
      return energy;
    }
}
