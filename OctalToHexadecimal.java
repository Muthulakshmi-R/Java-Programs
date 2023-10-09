/** A java program to convert octal  number to hexadecimal number */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OctalToHexadecimal {
	public static void main(String[] args) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				try {
            				System.out.print("Enter an octal number: ");
            				String octalString = reader.readLine();
            				if (isOctalValid(octalString)) {
                				int octal = Integer.parseInt(octalString, 8);
                				String hexadecimal = Integer.toHexString(octal);
                				System.out.println("Equivalent hexadecimal number: " + hexadecimal.toUpperCase());
            				} else {
                				System.out.println("Invalid octal input. Please enter a valid octal number.");
            				}
        			} catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter a valid number.");
        			}
	}

	public static boolean isOctalValid(String octalString) {
        			for (char c : octalString.toCharArray()) {
            				if (c < '0' || c > '7') {
                				return false;
            				}
        			}
        			return true;
	}
}
