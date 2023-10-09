/** A java program to add two binary numbers */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryAddition {
	public static void main(String[] args) {
        				try {
						BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
						System.out.print("Input first binary number: ");
						String binary1 = reader.readLine();
						System.out.print("Input second binary number: ");
            					String binary2 = reader.readLine();
						int number1 = Integer.parseInt(binary1, 2);
        					int number2 = Integer.parseInt(binary2, 2);
						int sum = number1 + number2;
						String result = Integer.toBinary(sum);
            					System.out.println("Sum of two binary numbers: " + result);
        				} catch (IOException e) {
						System.err.println("An error occurred while reading input: " + e.getMessage());
					} catch (NumberFormatException e) {
            					System.err.println("Invalid input. Please enter a valid number.");
        				}

	}
}