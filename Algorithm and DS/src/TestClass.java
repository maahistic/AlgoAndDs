import java.util.Arrays;
import java.util.Scanner;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        */
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        s.nextLine();
        int[] str = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        	
        // Reading input from STDIN
        int num = s.nextInt();
        for (int x = 0 ; x<num ; x++)
        {
        	
        	
        }
        
        
        System.out.println(str);    // Writing output to STDOUT


        // Write your code here

    }
}
