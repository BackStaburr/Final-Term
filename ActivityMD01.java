/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @Neo ITE-104
 */
public class ActivityMD01 {
    public static void main(String[] args) {
        //Declare and initialize
        char[][] array = new char [3][4];
        
        //fill the array
        for(int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = '*';
            }
        }
            //print the array
            
            for(int i = 0; i < array.length; i++)
            {
                for(int j = 0 ; j < array[i].length; j++)
                {
                    System.out.print(array[i][j] + " ");
                    
               
            }
        }
    }
    
}
