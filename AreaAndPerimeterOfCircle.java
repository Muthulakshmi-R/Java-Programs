/** Program to calculate and print the area and perimeter of a circle */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class AreaAndPerimeterOfCircle {
	public static void main(String[] args) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        			try {
					System.out.print("Enter the radius of the circle: ");
            				String radiusAsString = reader.readLine();
            				double radius = Double.parseDouble(radiusAsString);
            				double perimeter = 2 * 3.14 * radius;
            				double area = 3.14 * Math.pow(radius, 2);
            				DecimalFormat df = new DecimalFormat("#.##############");
            				System.out.println("Perimeter is = " + df.format(perimeter));
            				System.out.println("Area is = " + df.format(area));
            				reader.close();
        			} catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter a valid number for the radius.");
        			}
	}
}
