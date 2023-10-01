/** Java program to compare two numbers */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComparingTwoNumbers {
	public static void main(String[] args) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        			try {
            				System.out.print("Input first integer: ");
           				String number1AsString = reader.readLine();
            				int number1 = Integer.parseInt(number1AsString);

            				System.out.print("Input second integer: ");
            				String number2AsString = reader.readLine();
            				int number2 = Integer.parseInt(number2AsString);

            				if (number1 != number2) {
                				System.out.println(number1 + " != " + number2);
            				}
            				if (number1 < number2) {
                				System.out.println(number1 + " < " + number2);
            				}
            				if (number1 <= number2) {
                				System.out.println(number1 + " <= " + number2);
            				}
            				reader.close();
				} catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter valid integers.");
        			}
    	}
}
