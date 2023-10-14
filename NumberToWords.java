/** A java program to convert the integer value to words */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberToWords {
	private final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	private final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	private final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	
	public static void main(String[] args) {
				try {
            				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            				System.out.print("Enter an integer between 1 and 100000000: ");
            				String input = reader.readLine().trim();
            				long number = Long.parseLong(input);

            				if (number < 0 || number > 100000000) {
                				System.out.println("Number out of range.");
            				} else {
                				NumberToWords numberToWords = new NumberToWords();
                				String words = numberToWords.convertNumberToWords(number);
                				System.out.println("In words: " + words);
		
            				}
        			} catch (IOException e) {
            				System.err.println("An error occurred while reading input: " + e.getMessage());
        			} catch (NumberFormatException e) {
            				System.err.println("Invalid input. Please enter a valid number for the radius.");
        			}
    }

	public String convertNumberToWords(long number) {
        			if (number == 0) {
            				return "Zero";
        			}
        			return convertNumberToWordsRecursive(number);
    	}

	public String convertNumberToWordsRecursive(long number) {
        			if (number == 0) {
            				return "";
        			}
        			if (number < 10) {
            				return units[(int) number];
        			} else if (number < 20) {
            				return teens[(int) (number - 10)];
        			} else if (number < 100) {
            				return tens[(int) (number / 10)] + " " + convertNumberToWordsRecursive(number % 10);
        			} else if (number < 1000) {
            				return units[(int) (number / 100)] + " Hundred and " + convertNumberToWordsRecursive(number % 100);
        			} else if (number < 100000) {
            				return convertNumberToWordsRecursive(number / 1000) + " Thousand " + convertNumberToWordsRecursive(number % 1000);
        			} else if (number < 10000000) {
            				return convertNumberToWordsRecursive(number / 100000) + " Lakh " + convertNumberToWordsRecursive(number % 100000);
        			} else {
            				return convertNumberToWordsRecursive(number / 10000000) + " Crore " + convertNumberToWordsRecursive(number % 10000000);
        			}
    	}
}
