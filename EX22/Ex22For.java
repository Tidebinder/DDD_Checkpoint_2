package EX22;

import java.util.Scanner;

public class Ex22For {
	
	public static void main(String args[]) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero, ele deve ser menor que o proximo:");
		int numero_1 = stdin.nextInt();
		System.out.print("Digite o segundo n�mero, ele deve ser mairo que o anterior:");
		int numero_2 = stdin.nextInt();
		
		for(int i=1;i != 0;) {
			if (numero_2 > numero_1) {
				System.out.printf("%d � maior que %d", numero_2, numero_1);
				i=0;
			}
			else {
				System.out.printf("%d n�o � maior que %d, tente novamente.\n", numero_2,numero_1);
				System.out.print("Digite o segundo n�mero, ele deve ser mairo que o anterior:");
				numero_2 = stdin.nextInt();
			}
		}
		stdin.close();
		
	}

}
