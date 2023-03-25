package com.syntax.review1;

public class WorkingWithVariables {
    public static void main(String[] args) {


       //create a variable and store value into it
        int number=10;


        int num;//declarationof a variable happens only once
        num=100;  // initialize the variable
        num=200;  // reassign the value
        num=2000;
        num=5000;
        //num=30.01;
        System.out.println(num); //200

        boolean hungry= false;
        hungry=true;


        //String is the popular datatype
        String myString= "hello";
        String name= "Artem";
        String address="123 Test Drive";

        //hello
        System.out.println(myString+"    "+name);
        int age=21;
        System.out.println(name + " is "+age+" years old");

        /* if we want to TTch String to anything :
        String to anotehr String
        String to a boolean
        String to a char
         */





    }

    public static class DataTypes {
        public static void main(String[] args) {

        /* Data Types in java: 1. primitive and 2. non  primitive

        primitive dataTypes: byte, short, float, int, long, double, boolean, char

        numeric:
            whole numbers: byte, short, int, long
            decimal numbers: float, double


            boolean:true or false
            char: single charctar
             */
            //datatype nameOfTheVariable = value;
            byte num = 127;
            short num1 = 10;
            int num2 = 1000;
            long num3 = 1000000;

            // data type for decimal values
            float number = 10.99f;
            double number1 = 100.89;

            // datatype to represent single character
            char money = '$';
            char gender = 'm';
            //to represnt yes or no
            boolean needBreak = true;
            boolean understandingJava = true;

            System.out.println(num1);
            // printing value inside variable num1=10

        }
    }
}
