package EX21;

import java.util.Scanner;
public class Ex21DoWhile {

	public static void main(String args[]) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("Digite um numero positivo:");
		int number = stdin.nextInt();
		
		do {
			
			System.out.println("Numero não é positivo.");
			System.out.print("Digite um numero positivo:");
			number = stdin.nextInt();
			
		} while(number < 0);
		
		System.out.print("Numero positivo!");
		stdin.close();
	}
}
