
import java.util.Scanner;
import java.util.Arrays;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating an input for the user
        Scanner input = new Scanner (System.in);
        
        // create an array to store in the integer
        int [] num = new int [2];
        
        // create a for loop to go through each number
        for (int i = 0; i < num.length; i++){
            System.out.print("Enter two integer:");
            num [i] = input.nextInt();
        }
        // printing the result in one line
        System.out.print("The integers in ascending order are :");
        // sorting the integers in ascending order
        for (int i= 0; i < num.length; i++){
            // use arrays.sort to sort the num in ascending order
            Arrays.sort(num);
            // printing out the result in one line including thenumbers in ascending order
            System.out.print( " " + num[i]);
        }
            
            
            }
               

            }
            
        

        
        
        

                
        
        
    
    




