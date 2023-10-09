/** A java program to convert hexadecimal to binary */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HexadecimalToBinary {
	public static void main(String[] args) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				try{       
 					System.out.print("Enter Hexadecimal Number : ");
        				String hexadecimal = reader.readLine();
        				int decimal = Integer.parseInt(hexadecimal, 16);
        				String binary = Integer.toBinaryString(decimal);
        				System.out.println("Equivalent Binary Number is: " + binary);
				}catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter a valid hexadecimal number.");
        			}
	}
}
