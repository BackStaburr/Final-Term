/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @Neo ITE-104
 */
public class ActivityMD02 {
    public static void main(String[] args) {
        
        //Declare and initialize
        char[][] array = new char [4][];
        
        //initialize and fill the array
        for(int i = 0; i < array.length; i++)
        {
            array[i] = new char[i+1];
            for (int j = 0; j < array[i].length; j++){
                
                
                     array[i][j] = '*';
                
            
            }
        }
            //print 2D array
            
            for (int i = 0; i < array.length; i++){
                for(int j = 0 ; j < array[i].length; j++)
                {
                    System.out.print(array[i][j]+" ");
                }
                System.out.println();
            }
    }
}
                    
                
    

