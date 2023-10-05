/**  A Java program to convert a decimal number to an octal number */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToOctal {
	public static void main(String[] args) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        			try {
            				System.out.print("Input a Decimal Number: ");
            				int decimalNumber = Integer.parseInt(reader.readLine());
            				DecimalToOctal converter = new DecimalToOctal(); 
            				String octalNumber = converter.convertToOctal(decimalNumber);
            				System.out.println("Octal number is: " + octalNumber);
        			} catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter a valid number.");
        			}
	}
	
	public String convertToOctal(int decimalNumber) {
        			StringBuilder octal = new StringBuilder();
        			if (decimalNumber == 0) {
            				octal.append(0);
        			} else {
            				while (decimalNumber > 0) {
                			int remainder = decimalNumber % 8;
                			octal.insert(0, remainder);
                			decimalNumber /= 8;
            				}
        			}
        			return octal.toString();
    	}
}
