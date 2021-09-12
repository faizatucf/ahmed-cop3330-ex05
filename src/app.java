/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Faiz Ahmed
*/

import java.util.*;
public class simple_math {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1,num2,add, sub, multi, div;
        System.out.println("What is the first number?");
        num1 = sc.nextInt(); //accepting as int 
        System.out.println("What is the second number?");
        num2 = sc.nextInt();  
        //Keep the inputs and outputs separate from the numerical conversions and other processing.
        add = num1 + num2;
        sub = num1 - num2;
        multi = num1 * num2;
        div =  num1 / num2;
        //Generate a single output statement with line breaks in the appropriate spots.
        System.out.println(String.format("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d",num1,num2,add,num1,num2,sub,num1,num2,multi,num1,num2,div));
    }   
}
