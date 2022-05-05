package EX25;

import java.util.Scanner;

public class Ex25While {
	
	public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("Digite um numero positivo:");
		int numero = stdin.nextInt();
		while (numero < 0 ) {
			
			System.out.print("Número negativo!\n");
			System.out.print("Digite um numero positivo:");
			numero = stdin.nextInt();
		}
		int i = 1;
		while(i < 11) {
			System.out.printf("%d x %d = %d\n",numero,i,numero*i);
			i++;
		}
		
		stdin.close();	
	}

}
