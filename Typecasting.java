/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.typecasting;

/**
 *
 * @author @Neo ITE104
 */
public class Typecasting {

    public static void main(String[] args) {
        
        String numberStr = "123";
        String numberStr2 = "456";      
                
        int number = Integer.parseInt(numberStr);
        int number2 = Integer.parseInt(numberStr2);
        
        int neo = number + number2;
        
        System.out.println("String Value: " + numberStr);
        System.out.println("Integer Value: " + number);
        System.out.println("Total: " + neo);
    }
}
