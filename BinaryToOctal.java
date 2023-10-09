/**  A Java program to convert binary number to an octal number */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryToOctal {
	public static void main(String[] args) {
				try{
					BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        				System.out.print("Input a Binary Number: ");
        				String binaryString = reader.readLine();
        				int binary = Integer.parseInt(binaryString);
        				int octal = 0, decimal = 0, i = 0;

        				while (binary != 0) {
            					decimal += (binary % 10) * Math.pow(2, i);
            					++i;
        					binary /= 10;
        				}
s
        				i = 1;

        				while (decimal != 0) {
            					octal += (decimal % 8) * i;
            					decimal /= 8;
            					i *= 10;
        				}

        				System.out.println("Octal number: " + octal);
				}catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter valid numbers.");
        			}

	}
}
