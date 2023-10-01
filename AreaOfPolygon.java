/** Java program to find the area of a polygon */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfPolygon {
	public static void main(String[] args) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        			try {
            				System.out.print("Input the number of sides on the polygon: ");
            				String numberOfSidesAsString = reader.readLine();
            				int NumberOfSides = Integer.parseInt(numberOfSidesAsString);

            				System.out.print("Input the length of one of the sides: ");
            				String sideLengthAsString = reader.readLine();
            				double sideLength = Double.parseDouble(sideLengthAsString);
            				double area = (NumberOfSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / NumberOfSides ));
            				System.out.println("The area is: " + area);
					reader.close();
				} catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter valid numbers.");
        			}
    	}
}
