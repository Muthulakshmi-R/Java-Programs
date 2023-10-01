/** Java program to print sum of the digits of a number */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigits {
	public static void main(String[] args) {
        			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				try {
            				System.out.print("Input an integer: ");
            				String inputAsString = reader.readLine();
            				int number = Integer.parseInt(inputAsString);
            				int sum = 0;
            				while (number != 0) {
                			int digit = number % 10;
                			sum += digit;
                			number /= 10;
            				}
            				System.out.println("The sum of the digits is: " + sum);
            				reader.close();
        			} catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
           	 			System.err.println("Invalid input. Please enter a valid integer.");
        			}
    	}
}
