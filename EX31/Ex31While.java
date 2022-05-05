package EX31;
import java.util.Scanner;

public class Ex31While {
	public static void main(String[] args) {
		Scanner stdin = new Scanner (System.in);
		int n,numero,i,soma;
		
		System.out.println("Digite X para calcular a soma dos X primeiros numeros: ");
		n = stdin.nextInt();
		
		numero =2;
		soma = 0;
		i = 3 ;
		if (n > 0 && n <100) {
		System.out.println(numero);
	
			while (i <= (2 * n)) {
				
				numero = numero + i ;
				soma =  soma + numero;
				i +=2;
				
				System.out.println(numero);
			}
			System.out.printf("A soma de todos é %d",(soma+2));
			
		}else {
			System.out.println("ERRO. Digite o valor novamente: ");
			n = stdin.nextInt();
			
		}
		stdin.close();
			
	}

}
