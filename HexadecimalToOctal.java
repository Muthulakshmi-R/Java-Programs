/** A java program to convert hexadecimal to octal */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HexadecimalToOctal {
				public static void main(String[] args) {
        			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				try{
        				System.out.print("Input a hexadecimal number: ");
        				String hexadecimal = reader.readLine();
        				int decimal = Integer.parseInt(hexadecimal, 16);
        				String octal = Integer.toOctalString(decimal);
        				System.out.println("Equivalent of octal number is: " + octal);
				}catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter a valid hexadecimal number.");
        			}
    }
}
