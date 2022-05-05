package EX27;

import java.util.Scanner;

public class Ex27For {
	
	public static void main(String args[]) {
		
		Scanner stdin = new Scanner(System.in);
		
		
		for(int i = 1 ; i < 21 ; i++) {
			System.out.printf("Tabuada do %d:\n",i);
			
			for(int y = 1; y < 11;y++) {
				
				System.out.printf("%d x %d = %d\n",i,y,i*y);
				
			}
			System.out.println("Digite uma teclada para continuar...");
			stdin.nextLine();
		}
		
		System.out.print("Finalizando...");
		
		stdin.close();
	}
}
