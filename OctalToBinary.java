/** A java program to convert octal  number to binary number */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OctalToBinary {
	public static void main(String[] args) throws IOException {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				try{
				System.out.print("Input any octal number: ");
				String octalString = reader.readLine();
				if (isOctalValid(octalString)) {
            				int octal = Integer.parseInt(octalString, 8);
            				String binaryString = Integer.toBinaryString(octal);
            				System.out.println("Equivalent binary number: " + binaryString);
        			} else {
            				System.out.println("Invalid octal input. Please enter a valid octal number.");
        			}
				}catch (IOException e) {
					System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter valid numbers.");
				}
    	}

public static boolean isOctalValid(String octalInput) {
				for (char c : octalInput.toCharArray()) {
            				if (c < '0' || c > '7') {
                				return false;
            				}
        			}
        			return true;
    				}
}
