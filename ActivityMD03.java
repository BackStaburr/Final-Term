/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @NEO ITE-104
 */
public class ActivityMD03 {
    public static void main(String[] args) {
        int rows = 5;
        
        //outer loop 
        //1st for loop
        for (int i =0; i < rows; i++) {
        //Leading spaces
        //2nd for loop
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //3rd for loop
            for (int k =0; k < (2 * (rows - i) - 1); k++) {
                System.out.print("*");
            }
             System.out.println();
        }
        
    }
    
}
