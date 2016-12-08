
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A7Q4 {
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating an input for the user
        Scanner input =  new Scanner (System.in);
        
        //create an array to store in 10 marks
        int []  marks = new int [10];
        
        // create a for loops to go through the numbers
        for ( int i = 0; i < marks.length; i++){
            System.out.println("Please Enter mark: " + (i+1));
            marks [i] = input.nextInt();
        }
        for ( int i = 0; i < marks.length -1; i++){
            for ( int b = 0; b < marks.length -2 ; b++){
                // comparing array values
                if (marks[b] > marks[b+1]){
                    // storing the value of the array in lowtohigh variable
                    int lowtohigh = 0;
                    lowtohigh = marks[b];
                    // swapping values
                    marks[b] = marks[b+1];
                    // storing lowtohigh value in array
                    marks[b+1]= lowtohigh;
                }
            }
        }
        // printing the results in one line
             System.out.print("The Marks in Lowest to Highest is: ");
               for ( int i = 0; i < marks.length; i++){
                   // printing the results in low to highest
                   System.out.print(" " + marks[i]);
               }
               }
        
                }
                
            
            
        
        

