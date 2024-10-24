/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author neo yabut
 */

import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner inputNumber = new Scanner (System.in);
        System.out.println("Enter 1st number: ");
        int a = inputNumber.nextInt();
        
        System.out.println("Enter 2nd number: ");
        int b = inputNumber.nextInt();
        
        int add = a+b;
        int subtract = a-b;
        int multiply = a*b;
        int division = a/b;
        
        System.out.println("Results: ");
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + subtract);
        System.out.println("Multiply: " + multiply);
        System.out.println("Division: " + division);
        
    }
}
