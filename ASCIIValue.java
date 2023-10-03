/** A Java program to print the ASCII value*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ASCIIValue {
	public static void main(String[] args) throws IOException {
        			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        			System.out.print("Enter a character: ");
        			String input = reader.readLine();
        			if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            				char character = input.charAt(0);
            				int asciiValue = (int) character;
            				System.out.println("The ASCII value of " + character + " is: " + asciiValue);
        			} else {
            				System.out.println("Invalid input. Please enter a single character.");
        			}
    	}
}
