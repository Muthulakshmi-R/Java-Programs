/**  A Java program to convert a binary number to an decimal number */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryToDecimal {
	public static void main(String[] args) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        			try {
            				System.out.print("Input a binary number: ");
            				String binaryNumber = reader.readLine();
            				BinaryToDecimal converter = new BinaryToDecimal();
            				int length = converter.BinaryLength(binaryNumber);
            				int decimalNumber = converter.BinaryToDecimalConversion(binaryNumber, length);
            				System.out.println("Decimal Number: " + decimalNumber);
        			} catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter a valid number.");
        			}
    	}

    	public int BinaryToDecimalConversion(String binaryNumber, int length) {
        			int decimalNumber = 0;
        			int power = 0;
        			for (int i = length - 1; i >= 0; i--) {
            				int digit = binaryNumber.charAt(i) - '0';
            				decimalNumber += digit * Math.pow(2, power);
            				power++;
        			}

        			return decimalNumber;
	}

	public int BinaryLength(String binaryNumber) {
        			int length = 0;
        			for (char c : binaryNumber.toCharArray()) {
            				if (c == '0' || c == '1') {
                				length++;
            				} else {
                				break; 
            				}
        			}
        			return length;
	}
}
