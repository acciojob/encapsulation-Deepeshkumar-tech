package com.driver;


public class Main {
  public static void main(String[] args)
  {
     RWOnly obj=new RWOnly();
     obj.name="Deepesh";
    // System.out.println(name);//java: name has private access in com.driver.RWOnly
      obj.setName("Rupesh");
      obj.getName();
      System.out.println();
  }
}