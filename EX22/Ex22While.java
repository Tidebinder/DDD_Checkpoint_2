package EX22;

import java.util.Scanner;

public class Ex22While {
	
	public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número, ele deve ser menor que o proximo:");
		int numero_1 = stdin.nextInt();
		System.out.print("Digite o segundo número, ele deve ser maior que o anterior:");
		int numero_2 = stdin.nextInt();
		
		while(numero_1 >= numero_2) {
			System.out.printf("%d não é maior que %d\n", numero_2,numero_1);
			System.out.print("Digite o segundo número, ele deve ser maior que o anterior:");
			numero_2 = stdin.nextInt();
		}
	
		System.out.printf("%d é maior que %d",numero_2,numero_1);
		stdin.close();
		
	}

}
