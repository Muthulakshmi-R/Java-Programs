/** A Java Program to compute the distance between two points on the earth's surface */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistanceBetweenTwoPoints {
	public static void main(String[] args) {
				double radius = 6371.01;
				double x1, y1, x2, y2;
        
        			try {
            				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            				System.out.print("Input the latitude of coordinate 1: ");
            				x1 = Double.parseDouble(reader.readLine());

            				System.out.print("Input the longitude of coordinate 1: ");
            				y1 = Double.parseDouble(reader.readLine());

            				System.out.print("Input the latitude of coordinate 2: ");
            				x2 = Double.parseDouble(reader.readLine());

            				System.out.print("Input the longitude of coordinate 2: ");
            				y2 = Double.parseDouble(reader.readLine());

            				reader.close();
					double distance = DistanceCalculation(radius, x1, y1, x2, y2);
            				System.out.println("The distance between those points is: " + distance + " km");
        			} catch (IOException e) {
            				System.err.println("Error: Invalid input. Please enter valid numeric values for coordinates.");
       	 			}
       				catch (NumberFormatException e) {
            				System.err.println("Error: Invalid input. Please enter valid numeric values for coordinates.");
        			}
	}

	public static double DistanceCalculation(double radius, double x1, double y1, double x2, double y2) {
        			x1 = Math.toRadians(x1);
        			y1 = Math.toRadians(y1);
				x2 = Math.toRadians(x2);
       				y2 = Math.toRadians(y2);

        			double distance = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        			return distance;
	}
}

