/**  A Java program to convert an integer number to a binary number */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToBinary {
	public static void main(String[] args) {
        			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        		     try {
            				System.out.print("Input a Decimal Number: ");
            				int decimalNumber = Integer.parseInt(reader.readLine());
            				if (decimalNumber == 0) {
            					System.out.println("Binary number is: 0");
            					System.exit(0);
            				}
        				StringBuilder binary = new StringBuilder();
        				while (decimalNumber > 0) {
            					int remainder = decimalNumber % 2;
            					binary.insert(0, remainder);
            					decimalNumber /= 2;
        				}
					String binaryNumber =binary.toString();
            				System.out.println("Binary number is: " + binaryNumber);
        			} catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter valid numbers for width and height.");
        			}
	}
}