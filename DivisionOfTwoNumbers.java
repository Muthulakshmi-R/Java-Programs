/** Program to perform division of two numbers and to print the integer value of the quotient */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisionOfTwoNumbers {
	public static void main(String[] args) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        			try {
					System.out.println("Enter the dividend: ");
            				String dividendAsString = reader.readLine();
            				int dividend = Integer.parseInt(dividendAsString);

            				System.out.println("Enter the divisor: ");
            				String divisorAsString = reader.readLine();
            				int divisor = Integer.parseInt(divisorAsString);

            				if (divisor!= 0) {
                				int result = dividend/divisor;
                				System.out.println("Result: "+result);
            				} else {
                				System.err.println("Error: Division by zero is not allowed.");
            				}

            				reader.close();
        			} catch (IOException e) {
					System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter valid numbers.");
				}
	}
}
