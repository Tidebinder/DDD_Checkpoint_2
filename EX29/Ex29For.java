package EX29;

public class Ex29For {
	
	public static void main (String args[]) {
		
		int a = 1;
		
		int b = 0;
		
		int c = 0;
		
		for (int i=1;i<=30;i++) {
			
			c = a + b;
			
			a = b;
			
			b = c;
			
			System.out.printf("%dº número de fibonnaci = %d\n",i,c);
			
			
			
		}
	}

}
