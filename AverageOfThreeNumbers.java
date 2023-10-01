/**  A Java program to print the average of three numbers */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AverageOfThreeNumbers {
	public static void main(String[] args) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

				try {
					System.out.println("Enter the first number: ");
            				String number1AsString = reader.readLine();
            				double number1 = Double.parseDouble(number1AsString);

            				System.out.println("Enter the second number: ");
            				String number2AsString = reader.readLine();
					double number2 = Double.parseDouble(number2AsString);

            				System.out.println("Enter the third number: ");
            				String number3AsString = reader.readLine();
            				double number3 = Double.parseDouble(number3AsString);

            				double average = (number1 + number2 + number3) / 3;
            				System.out.println("Average: " + average);
            				
					reader.close();
        			} catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter valid numbers.");
        			}
	}
}
