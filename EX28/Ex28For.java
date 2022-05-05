package EX28;

public class Ex28For {
	
	public static void main(String args[]) {
		
		int numero = 1;
		
		for (int i = 1;i<=100;i++) {
			
			System.out.printf("%d + %d = %d\n",numero,i,numero+i);
			numero = numero + i;
		}
		
	}

}
