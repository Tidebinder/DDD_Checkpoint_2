package EX23;

import java.util.Scanner;

public class Ex23While {
	
	public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Sexo(M/F):");
		char sexo = Character.toUpperCase(stdin.next().charAt(0));
		
		while (sexo != 'M' && sexo != 'F') {
			System.out.println("Sexo invalido!");
			System.out.print("Sexo(M/F):");
			sexo = Character.toUpperCase(stdin.next().charAt(0));
			
		}
		
		if (sexo == 'M') {
			System.out.print("Sexo masculino selecionado");
		}
		else {
			System.out.print("Sexo feminino selecionado.");
		}
		stdin.close();
	}
}
