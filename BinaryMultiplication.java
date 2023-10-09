/** A java program to multiply two binary numbers */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryMultiplication {
	public static void main(String[] args) {
				try {
            				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            				System.out.print("Input the first binary number: ");
            				String binary1 = reader.readLine();
            				System.out.print("Input the second binary number: ");
            				String binary2 = reader.readLine();
					int number1 = Integer.parseInt(binary1, 2);
        				int number2 = Integer.parseInt(binary2, 2);
					int result = number1 * number2;
            				String product = Integer.toBinaryString(result);
            				System.out.println("Product of two binary numbers: " + product);
        			} catch (IOException e) {
					System.err.println("An error occurred while reading input: " + e.getMessage());
				} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter a valid number.");
        			}
	}
}

