package EX23;

import java.util.Scanner;
import java.lang.Character;

public class Ex23For {
	
	public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Sexo(M/F):");
		char sexo = Character.toUpperCase(stdin.next().charAt(0));
		
		
		for(int i=1; i != 0;) {
			
			
			if (sexo == 'M') {
				System.out.print("Sexo masculino selecionado");
				i = 0;
			}
			else if (sexo == 'F') {
				System.out.print("Sexo feminino selecionado!");
				i = 0;
			}
			else {
				System.out.println("Sexo invalido!");
				System.out.print("Sexo(M/F):");
				sexo = Character.toUpperCase(stdin.next().charAt(0));
			}
			
		}
		
		
		
		
		
		stdin.close();
	}

}
