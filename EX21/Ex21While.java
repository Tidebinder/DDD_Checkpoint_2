package EX21;

import java.util.Scanner;

public class Ex21While {
	
	public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Digite um numero positivo:");
		int numero = stdin.nextInt();
		
		while (numero < 0) {
			System.out.print("Digite um numero positivo:");
			numero = stdin.nextInt();
		}
		
		System.out.print("Numero positivo!");
		stdin.close();
	}

}
