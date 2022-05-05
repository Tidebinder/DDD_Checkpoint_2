package EX21;

import java.util.Scanner;

public class Ex21For {
	
	public static void main(String args[]) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Digite um numero positivo:");
		
		int numero = stdin.nextInt();
		
		for (int i=1; i != 0;) {
			
			if (numero < 0 ) {
				System.out.println("Numero negativo.");
				System.out.print("Digite um numero positivo:");
				numero = stdin.nextInt();
			} else {
				System.out.println("Número positivo!");
				i = 0;
			}
			
		}
		
		stdin.close();
	}

}
