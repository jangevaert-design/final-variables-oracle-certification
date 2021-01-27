package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.List;

public class FinalVariables {

  private static final int SIZE = 10;

  private static final List<String> VALUES = new ArrayList<>();

  public static void main(String[] args) {
      int[] myArray = new int[SIZE];//size is final.

//    SIZE = 11; compilation error because SIZE is final.
//    SIZE++; does not compile

    int doubleSize = SIZE * 2; //this works because you don't change the value of SIZE.

    for (int i = 0; i < SIZE; i++) {//note that we can use SIZE instead of myArray.length!
      System.out.println(myArray[i]);
    }

    VALUES.add("changed");//this compiles! We cannot assign the variable to another object like line 26
    //but we can call methods like add, remove, clear.
    //VALUES = new ArrayList<>(); does not compile.

    final int myNumber = 10;
    //myNumber = 11; will not compile
  }

}
