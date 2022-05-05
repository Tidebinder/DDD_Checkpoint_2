package EX30;

public class Ex30For {
	
	public static void main(String args[]) {
		
		int a = 1;
		
		int b = 1;
		
		int c = 1;
		
		int resultado;
		
		for(int i=0; i <= 20;i++ ) {
			
			resultado = a + b + c;
			
			a = b;
					
			b = c;
			
			c = resultado;
			
			System.out.printf("%d\n",resultado);
			
		}
	}
}
