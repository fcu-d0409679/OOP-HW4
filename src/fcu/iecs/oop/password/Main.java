package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input;

		Scanner scanner = new Scanner(System.in);
		
		PasswordEncorder pe = new PasswordEncorder();
		
		while(true){
			System.out.println("Please enter a password:");
		
			input = scanner.nextLine(); 
		
			input =pe.encode(input);
		
			if(input.equals("exit")){
				break;
			}
		
			else{
				System.out.println(input);
			}
		}
		scanner.close();
	}

}
