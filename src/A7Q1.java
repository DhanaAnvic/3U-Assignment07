
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a scanner for the input
        Scanner input = new Scanner (System.in);
        
        //ask the user how many students in class
        System.out.println("How many students in the class ? ");
        int students = input.nextInt();
         
        // create an array to store 5 variables
        double [] marks = new double [students];
        
         // ask the user ofr the marks of each students
         for (int i = 0; i < marks.length; i++){
             System.out.println("Please enter the mark:"+ (i+1));
             marks [i] = input.nextDouble();
         }
             // to calculate the average of the students marks
            double total = 0;
            // go through each number
            for (int i = 0; i < marks.length; i++){
                total = total + marks[i];  
            }
            // create a variable to store in the average marks of the students
            // dividing the total by students to find the average
            double average = total/students ; 
            // printing the the class average
            System.out.println("The clasa average: " + average + " %");
            
             

         }
             
    }

