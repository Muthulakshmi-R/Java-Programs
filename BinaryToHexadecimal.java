/**  A Java program to convert a binary number to an hexadecimal number */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryToHexadecimal {
	public static void main(String[] args) throws IOException {
        			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				try{
        				System.out.print("Input a Binary Number: ");
        				String binaryNumber = reader.readLine();
        				if ("0".equals(binaryNumber)) {
						System.out.println("Hexadecimal value: 0");
            					System.exit(0);
					}
        				BinaryToHexadecimal converter = new BinaryToHexadecimal();
        				int decimalNumber = converter.binaryToDecimal(binaryNumber);
        				String hexadecimalNumber = converter.decimalToHexadecimal(decimalNumber);

        				System.out.println("Hexadecimal value: " + hexadecimalNumber);
				}catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter valid numbers.");
        			}
	}

	public int binaryToDecimal(String binaryNumber) {
				int decimalNumber = 0;
				int power = 0;

        			for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            				int digit = binaryNumber.charAt(i) - '0';
            				decimalNumber += digit * Math.pow(2, power);
            				power++;
        			}

        			return decimalNumber;
	}

	public String decimalToHexadecimal(int decimalNumber) {
        			StringBuilder hexadecimalNumber = new StringBuilder();

        			while (decimalNumber != 0) {
            				int remainder = decimalNumber % 16;

            				if (remainder < 10) {
                				hexadecimalNumber.insert(0, remainder);
            				} else {
                				char hexDigit = (char) ('A' + remainder - 10);
                				hexadecimalNumber.insert(0, hexDigit);
            				}
            				decimalNumber /= 16;
        			}

        			return hexadecimalNumber.toString();
	}
}
