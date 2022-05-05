package EX27;

import java.util.Scanner;

public class Ex27While {
	
public static void main(String args[]) {
		
		Scanner stdin = new Scanner(System.in);
		
		
		int x = 1;
		int y = 1;
		
		while (x <= 20) {
			System.out.printf("Tabuada do %d\n",x);
			
			while(y <= 10) {
				
				System.out.printf("%d x %d = %d\n",x,y,x*y);
				y++;
			}
			
			System.out.print("Digite uma teclada para continuar...");
			stdin.nextLine();
			
			x++;
			y -= 10;
			
		}
		
		System.out.print("Finalizando...");
		
		stdin.close();
	}

}
