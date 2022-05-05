package EX23;

import java.util.Scanner;

public class Ex23DoWhile {
	
	
	public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);
		
		char sexo;
		
		do {
			
			System.out.print("Sexo(M/F):");
			sexo = Character.toUpperCase(stdin.next().charAt(0));
			
			if (sexo == 'M') {
				System.out.print("Sexo masculino selecionado!");
			}
			else if (sexo == 'F') {
				System.out.print("Sexo feminino selecionado!");
			}
			else {
				System.out.println("Sexo invalido!");
			}
			
		} while(sexo != 'M' && sexo != 'F');
		
		stdin.close();
	}

}
