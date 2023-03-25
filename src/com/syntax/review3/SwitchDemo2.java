package com.syntax.review3;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {

      Scanner scan=new Scanner(System.in);

        System.out.println("Please enter your favorite browser");
        String browser=scan.nextLine();

        switch (browser.toLowerCase()) {

            case "chrome":
                System.out.println("Test case executed in "+browser);
                break;
            case "safari":
                System.out.println("Test case executed in "+browser);
                break;
            case "microsoft":
                System.out.println("Test case executed in");
                break;
            default:
                System.out.println("browser is unknown - no execution");


        }


    }


}

