/** A java program to convert an octal number to decimal number */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OctalToDecimal {
	public static void main(String[] args) {
				try {
					BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            				System.out.print("Input any octal number: ");
            				String octalInput = reader.readLine();	
                			int decimalOutput = Integer.parseInt(octalInput, 8);
                			System.out.println("Equivalent decimal number: " + decimalOutput);
            			}catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter a valid number.");
        			}
    }
}
