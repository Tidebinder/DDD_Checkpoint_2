package EX28;

public class Ex28DoWhile {
	
	public static void main (String args[]) {
		
			
		int numero = 1;
			
		int i = 1;
		
		do {
			
			System.out.printf("%d + %d = %d\n",numero,i,numero+i);
			
			numero = numero + i;
				
			i++;
		}
		while(i<=100);
	}

}
