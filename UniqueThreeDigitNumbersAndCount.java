/**  A Java program to create and display a unique three-digit number using 1, 2, 3, 4 and count the number of three-digit numbers */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UniqueThreeDigitNumbersAndCount {
	public static void main(String[] args) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				try{        
					int count = 0;
        				for (int i = 1; i <= 4; i++) {
            					for (int j = 1; j <= 4; j++) {
                					for (int k = 1; k <= 4; k++) {
                    						if (i != j && j != k && k != i) {
                        						int number = i * 100 + j * 10 + k;
                        						System.out.println(number);
                        						count++;
                    						}
                					}
            					}
        				}

        				System.out.println("Total number of three-digit numbers is " + count);
        				reader.close();
				}catch (IOException e) {
            				System.err.println("An error occurred. " + e.getMessage());
        			}
	}
}
