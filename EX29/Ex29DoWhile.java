package EX29;

public class Ex29DoWhile {
	
	public static void main(String args[]) {
		int a = 1;
		
		int b = 0;
		
		int c = 0;
		int contador = 1;
		do {
			
			c = a + b;
			
			b = a;
			
			a = c;
			
			System.out.printf("%dº numero de fibonnaci = %d\n",contador,c);
			contador++;
		}while(contador <= 30);
	}

}
