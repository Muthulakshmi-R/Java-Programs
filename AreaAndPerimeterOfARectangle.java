/**  A Java program to print the area and perimeter of a rectangle */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class AreaAndPerimeterOfARectangle {
	public static void main(String[] args) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

				try {
					System.out.print("Width=");
            				String widthAsString = reader.readLine();
            				double width = Double.parseDouble(widthAsString);

            				System.out.print("Height=");
					String heightAsString = reader.readLine();
					double height = Double.parseDouble(heightAsString);

					double area = width * height;
					double perimeter = 2 * (width + height);
            				DecimalFormat df = new DecimalFormat("#.00");

            				System.out.println("Area is " + width + " * " + height + " = " + df.format(area));
            				System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + df.format(perimeter));

		            		reader.close();
        			} catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter valid numbers for width and height.");
        			}
	}
}
