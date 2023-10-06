/**  A Java program to count letters, spaces, numbers and other characters in an input string */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingCharacters {
	public static void main(String[] args) {
        			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				try{
        				System.out.print("Enter a string: ");
        				String inputString = reader.readLine();
        				int letterCount = 0;
        				int spaceCount = 0;
        				int numberCount = 0;
        				int otherCount = 0;
        				for (int i = 0; i < inputString.length(); i++) {
            					char c = inputString.charAt(i);
            					if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                					letterCount++;
            					} else if (c == ' ') {
                					spaceCount++;
            					} else if (c >= '0' && c <= '9') {
                					numberCount++;
            					} else {
                					otherCount++;
            					}
        				}

        				System.out.println("The string is: " + inputString);
        				System.out.println("letter: " + letterCount);
        				System.out.println("space: " + spaceCount);
        				System.out.println("number: " + numberCount);
        				System.out.println("other: " + otherCount);
				}catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} 
	}
}
