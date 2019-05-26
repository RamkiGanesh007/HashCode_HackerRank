package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class P1 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
         int j;
         double e;
         String t;
        /* Declare second integer, double, and String variables. */
          j=scan.nextInt();
          e=scan.nextDouble();
          t=scan.next();
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
         System.out.println(i+j);
        /* Print the sum of both integer variables on a new line. */
        System.out.println(d+e);            
        /* Print the sum of the double variables on a new line. */
		 System.out.println(s + 
         t);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
}
