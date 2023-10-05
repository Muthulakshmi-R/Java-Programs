/**  A Java program to convert a decimal number to a hexadecimal number */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToHexadecimal {
	public static void main(String[] args) {
        			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				try {
            				System.out.print("Input a Decimal Number: ");
            				int decimalNumber = Integer.parseInt(reader.readLine());
            				StringBuilder hexadecimal = new StringBuilder();
					char[] CharactersInHexadecimalValues = "0123456789ABCDEF".toCharArray();
					if (decimalNumber == 0) {
            					System.out.println("Hexadecimal number is: 0");
            					System.exit(0);
            				}
        				while (decimalNumber > 0) {
            					int remainder = decimalNumber % 16;
            					hexadecimal.insert(0, CharactersInHexadecimalValues[remainder]);
            					decimalNumber /= 16;
        				}
            				String hexadecimalNumber = hexadecimal.toString();
            				System.out.println("Hexadecimal number is: " + hexadecimalNumber);
        			}catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter a valid number.");
        			}
    }
}