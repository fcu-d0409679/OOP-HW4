package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int loop=0;
		
		Scanner scanner = new Scanner(System.in);
		
		NissanTiida nt = new NissanTiida();
		
		System.out.println("Please enter a number(number>0):");
		
		loop = scanner.nextInt();
		
		if(loop==0){
			
			System.out.println("輸入number不可為0");
		}
		
		for(int i=0;i<loop;i++){
			
			nt.tiida();
			
		}
		
		
		scanner.close();
		
		
		
		
	}

}
