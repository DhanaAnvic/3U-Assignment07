
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fabed2976
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an input for the user
        Scanner input = new Scanner(System.in);

        // asking the user for marks
        System.out.println("Please enter how many marks you want to have:");
        int grade = input.nextInt();

        // create an array to store in the marks the user want o to have
        int[] marks = new int[grade];
        // using a for loop to go thtough the numbers
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Please enter your marks : " + (i + 1));
            marks[i] = input.nextInt();
        }
        for (int i = 0; i < marks.length - 1; i++) {
            for (int k = 0; k < marks.length - 2; k++) {
                // comparing the marks
                if (marks[k] > marks[k + 1]) {
                    // stroing the value of the array in lowtohigh variable
                    int lowtohigh = 0;
                    lowtohigh = marks[k];
                    // swapping the values
                    marks[k] = marks[k + 1];
                    //storing the lowtohigh value in the array
                    marks[k + 1] = lowtohigh;
                }
            }
        }
        System.out.print("The marks form lowest to highest is :");
        // output of the marks form lowest to highest
        for (int i = 0; i < marks.length; i++) {
            System.out.print(" " + marks[i]);
        }
        for (int i = 0; i < marks.length -1; i++) {
            for (int b = 0; b < marks.length ; b++) {
            }
        }
        // create a variable to store the median
        int median = 0;
        // if the array is even
    if (marks.length % 2 == 0){
        median = marks [marks.length /2];
    }
    else {
        // if the array is even
        median = marks[marks.length/2];
    }
    // outputing the median of the marks
        System.out.print("The median is: " + median);
    }
    
        
    }


    

    
        
          
               
      






