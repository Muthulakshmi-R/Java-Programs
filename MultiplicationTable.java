/** Program to print the multiplication table up to ten  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationTable {
	public static void main(String[] args) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				try {
					System.out.println("Input a number: ");
            				String numberAsString = reader.readLine();
            				int number = Integer.parseInt(numberAsString);

            				System.out.println("Multiplication Table for " + number + ":");
            				for (int i = 1; i <= 10; i++) {
					int result = number * i;
					System.out.println(number + " x " + i + " = " + result);
            				}
				reader.close();
        			} catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter a valid number.");
        			}
    	}
}
