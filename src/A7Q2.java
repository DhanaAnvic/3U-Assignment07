
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an input for the user
        Scanner input = new Scanner (System.in);
        
        // ask the user for how many people are 
        System.out.println("How many people do you have?");
        int people = input.nextInt();
        
        // create an array to store 5 variable
        int [] height = new int [people];
        
        // go through the height
        for (int i = 0; i < height.length; i++){
            System.out.println("Please Enter the Height Measurement :" + (i+1));
            height [i] = input.nextInt(); 
        }
        // to find the total height for the people
        double total = 0;
        
        // go through the each number
        for (int i = 0; i < height.length; i++){
            // create a variable to store in the sum of total and heigth
            total = total + height [i];    
        }
        // create a variable to store in the average height measurements
        // to find the average divide the total sum of the height by the number of people
        double average = total/people;
        // printing the answer
        System.out.println("The average height measurements of the people is: " + average);
       
        
        
    }
}
