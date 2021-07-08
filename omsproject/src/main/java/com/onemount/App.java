package com.onemount;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        int a1 =5;
        float a2 = 5.0f;
        double a3 =5.0d;
        System.out.println(a1/3);
        System.out.println(a2/3);
        System.out.println(a3/3);
//        String str = "abc";
        char data[] = {'a', 'b', 'c'};
        String str = new String(data);
        System.out.println("dfdff" + str);




    }


    public void example1(){
        Scanner input = new Scanner(System.in);

        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);

        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered = " + myDouble);

        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);
    }

    public void example(){

        char a ='k';
        char[] charVar = {'a','b','c','d'};
        System.out.println( "Hello World Yen " + charVar[0]);

        int myNum = 5;                                          // Integer (whole number)
        float myFloatNum = 5.99f;                               // Floating point number
        char myLetter = 'S', myLetter2 = 'M';                   // Character
        boolean myBool = true;                                  // Boolean
        String myText = "Hello World";                          // String
        short myShortNum = 5000;                                // Short
        long myLongNum = 15000000000L;                          //long
        double myDoubleNum = 19.99d;                            //double
        double myDoubleNum2 = 19.99;
        float f1 = 35e3f; //A floating point number can also be a scientific number with an "e" to indicate the power of 10
        double d1 = 12E4d;//A floating point number can also be a scientific number with an "e" to indicate the power of 10
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};      //Array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        cars[0] = "Opel";                                        //Now outputs Opel instead of Volvo
        int[] myArrayNum = {10, 20, 30, 40};                     //Array
        for (int i = 0; i < myArrayNum.length; i++) {
            System.out.println(myArrayNum[i]);
        }
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myBool);
        System.out.println(myText);
        System.out.println(myShortNum);
        System.out.println(myLongNum);
        System.out.println(myDoubleNum);
        System.out.println(myDoubleNum2);
        System.out.println(myLetter);
        System.out.println(myLetter2);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(cars[0]);
    }
}
