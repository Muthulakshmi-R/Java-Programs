/** A Java program that accepts an integer (n) and computes the value of n+nn+nnn*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputingTheValue {
	public static void main(String[] args)throws IOException{
        			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        			System.out.print("Input number: ");
        			String input = reader.readLine();
        			try {
            				int n = Integer.parseInt(input);
            				int nn = Integer.parseInt(input + input);
            				int nnn = Integer.parseInt(input + input + input);
            				int result = n + nn + nnn;
            				System.out.println(n + " + " + nn + " + " + nnn + " = " + result);
        			} catch (NumberFormatException e) {
            				System.out.println("Invalid input. Please enter a valid integer.");
        			}
    	}	
}
