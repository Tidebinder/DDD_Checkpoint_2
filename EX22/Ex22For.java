package EX22;

import java.util.Scanner;

public class Ex22For {
	
	public static void main(String args[]) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número, ele deve ser menor que o proximo:");
		int numero_1 = stdin.nextInt();
		System.out.print("Digite o segundo número, ele deve ser mairo que o anterior:");
		int numero_2 = stdin.nextInt();
		
		for(int i=1;i != 0;) {
			if (numero_2 > numero_1) {
				System.out.printf("%d é maior que %d", numero_2, numero_1);
				i=0;
			}
			else {
				System.out.printf("%d não é maior que %d, tente novamente.\n", numero_2,numero_1);
				System.out.print("Digite o segundo número, ele deve ser mairo que o anterior:");
				numero_2 = stdin.nextInt();
			}
		}
		stdin.close();
		
	}

}
