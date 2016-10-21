package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input;

		Scanner scanner = new Scanner(System.in);
		
		PasswordEncorder pe = new PasswordEncorder();
		
		System.out.println("Please enter a password:");
		
		input = scanner.nextLine(); 
		
		input =pe.encode(input);
		
		System.out.println(input);
		
		
	}

}
