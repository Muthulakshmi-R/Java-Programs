/**  A Java program to input and display your password */

import java.io.Console;
public class PasswordInputAndDisplay {
	public static void main(String[] args) {
        			Console console = System.console();
        			if (console == null) {
            				System.out.println("No console available");
            				System.exit(1);
        			}
        			char[] passwordArray = console.readPassword("Input your Password: ");
        			String password = new String(passwordArray);
       	 			System.out.println("Your password was: " + password);
    	}
}
