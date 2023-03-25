package com.syntax.review4;

public class ForLoop {
    public static void main(String[] args) {


        //best loop - used when we know how many times we want to repeat block of codes
        for (int i = 2; i <=20 ; i+=5) {
            System.out.println(i);

        }
        System.out.println("    --------------      ");
        // we can use break and continue
        for (int i = 2; i <=20 ; i+=5) {
            System.out.println(i);
            if (i==12){
                System.out.println("i is equal to 12 - I am breaking my loop");
                break; // stops/break the loop
            }

        }
        //  continue; //java goes back to the beginning of the loop
        // and skips the rest of the code that is inside loop body
        for (int i = 2; i < 20; i+=5) {
            if (i % 3 == 0) {
                System.out.println(i);
                continue;
            }
            System.out.println("Hello");
            System.out.println("how are you?");
            System.out.println("Hope you well");
        }
    }
}
