package EX22;

import java.util.Scanner;

public class Ex22While {
	
	public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero, ele deve ser menor que o proximo:");
		int numero_1 = stdin.nextInt();
		System.out.print("Digite o segundo n�mero, ele deve ser maior que o anterior:");
		int numero_2 = stdin.nextInt();
		
		while(numero_1 >= numero_2) {
			System.out.printf("%d n�o � maior que %d\n", numero_2,numero_1);
			System.out.print("Digite o segundo n�mero, ele deve ser maior que o anterior:");
			numero_2 = stdin.nextInt();
		}
	
		System.out.printf("%d � maior que %d",numero_2,numero_1);
		stdin.close();
		
	}

}
