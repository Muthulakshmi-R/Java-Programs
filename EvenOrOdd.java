/** A Java program to check whether the number is even or not*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOrOdd {
	public static void main(String[] args) throws IOException {
        			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        			System.out.print("Input a number: ");
        			String input = reader.readLine();
        			try {
            				int number = Integer.parseInt(input);
            				int result = (number % 2 == 0) ? 1 : 0;
            				System.out.println(result);
        			} catch (NumberFormatException e) {
            				System.out.println("Invalid input. Please enter a valid integer.");
        			}
    	}
}
