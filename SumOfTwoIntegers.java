import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfTwoIntegers {
	public static void main(String[] args) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

				try {
					System.out.print("Enter the first integer: ");
					String Number1AsString = reader.readLine();
					int Number1 = Integer.parseInt(Number1AsString);

					System.out.print("Enter the second integer: ");
					String Number2AsString = reader.readLine();
					int Number2 = Integer.parseInt(Number2AsString);
					int sum = Number1 + Number2;
					System.out.println("Sum: " + sum);
					reader.close();
				} catch (IOException e) {
					System.err.println("An error occurred while reading input: " + e.getMessage());
				} catch (NumberFormatException e) {
					System.err.println("Invalid input. Please enter valid integers.");
        }
    }
}
