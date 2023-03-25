package com.syntax.review9;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // the Integer class wrap a value of the primitive type int in an object
      ArrayList<Integer> alist =new ArrayList<>();
      // to store value inside an arraylist
        alist.add(12);
        alist.add(13);
        alist.add(14);
        // how to find size of my arraylist
        int size=alist.size();
        System.out.println(" The size of alilst is ="+size);

        //to access
        int firstElement=alist.get(0);
        System.out.println(firstElement);//12
        //replacing value of the 1 element
        alist.set(0, 120);

        firstElement=alist.get(0);
        System.out.println(firstElement);
        //remove element
      alist.remove(2);
      //printing list after the removal
      System.out.println(alist);
    }
}
