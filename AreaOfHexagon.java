/** Java program to find the area of a hexagon */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfHexagon {
	public static void main(String[] args) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				try {
            				System.out.print("Input the length of a side of the hexagon: ");
					String sideLengthAsString = reader.readLine();
            				double sideLength = Double.parseDouble(sideLengthAsString);
            				double area = (6 * sideLength * sideLength) / (4 * Math.tan(Math.PI / 6));
            				System.out.println("The area of the hexagon is: " + area);
            				reader.close();
        			} catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter a valid number for the side length.");
        			}
    	}
}
