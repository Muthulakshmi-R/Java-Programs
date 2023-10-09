/** A java program to convert hexadecimal number to decimal number */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HexadecimalToDecimal {
	public static void main(String[] args) {
        			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				try {
            				System.out.print("Input a hexadecimal number: ");
            				String hexadecimalString = reader.readLine();
            				if (hexadecimalString.startsWith("0x")) {
                				hexadecimalString = hexadecimalString.substring(2);
            				}
					int decimal = Integer.parseInt(hexadecimalString, 16);
					System.out.println("Equivalent decimal number is: " + decimal);
        			} catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter a valid hexadecimal number.");
        			}
    	}
}
