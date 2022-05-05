package EX28;

public class Ex28While {
	
	public static void main(String args[]) {
		
		int numero = 1;
		
		int i = 1;
		
		while(i<=100) {
			
			System.out.printf("%d + %d = %d\n",numero,i,numero+i);
			
			numero = numero + i;
			
			i++;
		}
	}
}
