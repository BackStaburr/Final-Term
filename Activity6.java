/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity6;

/**
 *
 * @author Neo
 */
import java.util.Scanner;
public class Activity6 {

    public static void main(String[] args) {
        Scanner: scanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String Fullname = scanner.nextLine();
        
        System.out.println("Enter your age: ");
        byte age = scanner.nextByte();
        
        System.out.println("Enter your height: ");
        double height = scanner.nextdouble();
        
        System.out.println("Enter your Gender: (M for Male :  F for Female");
        char gender = scanner.next().charAt(0);
        
        System.out.println("Are you Married? (true/false):");
        boolean isMarried + scanner.nextBoolean();
        
    }
}
