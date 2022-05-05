package EX30;

public class Ex30While {
	
	public static void main(String args[]) {
		
		int resultado;
		
		int a = 1;
		
		int b = 1;
		
		int c = 1;
		
		int i = 0;
		
		while (i <= 20) {
			
			
			resultado = a + b + c;
			
			a = b;
					
			b = c;
			
			c = resultado;
			
			System.out.printf("%d\n",resultado);
			i++;
		}
	}

}
