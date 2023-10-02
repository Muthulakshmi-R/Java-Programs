/** A Java program to reverse a string */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversingAString {
	public static void main(String[] args) {
        			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        			try{
					System.out.print("Input a string: ");
        				String inputString = reader.readLine();
        				String reversed = "";
        				int length = calculateStringLength(inputString);

        				for (int i = length - 1; i >= 0; i--) {
            					reversed += inputString.charAt(i);
        				}
        				System.out.println("Reverse string: " + reversed);
					reader.close();
				}catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
				}
    	}
	public static int calculateStringLength(String input) {
        			int length = 0;
        			for (char c : input.toCharArray()) {
            				length++;
        			}
        			return length;
    	}
}

  
