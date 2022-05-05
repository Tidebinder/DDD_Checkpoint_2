package EX26;

import java.util.Scanner;

public class Ex26For {
	
	public static void main(String args[]) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Digite o numero que vamos calcular a tabuada:");
		int numero_tabuada = stdin.nextInt();
		
		while (numero_tabuada < 0 ) {
			
			System.out.print("Números negativos não são permitidos.\n");
			System.out.print("Digite o numero que vamos calcular a tabuada:");
			numero_tabuada = stdin.nextInt();
			
		}
		
		System.out.print("Digite o numero que vamos iniciar calculando a tabuada:"); 
		int tabuada_de = stdin.nextInt();
		
		while(tabuada_de < 0) {
			
			System.out.print("Números negativos não são permitidos.\n");
			System.out.print("Digite o numero que vamos iniciar calculando a tabuada:"); 
			tabuada_de = stdin.nextInt();
			
		}
		
		System.out.print("Digite o numero de até onde vamos calcular a tabuada:");
		int tabuada_ate = stdin.nextInt();
		
		while (tabuada_ate < 0) {
			System.out.print("Números negativos não são permitidos.\n");
			System.out.print("Digite o numero de até onde vamos calcular a tabuada:"); 
			tabuada_ate = stdin.nextInt();
		}
		
		while (tabuada_ate < tabuada_de) {
			System.out.printf("Não podemos calcular a tabuada do %d de %d até %d\n",numero_tabuada,tabuada_de,tabuada_ate);
			System.out.print("Digite o numero de até onde vamos calcular a tabuada:"); 
			tabuada_ate = stdin.nextInt();
			while (tabuada_ate < 0) {
				System.out.print("Números negativos não são permitidos.\n");
				System.out.print("Digite o numero de até onde vamos calcular a tabuada:"); 
				tabuada_ate = stdin.nextInt();
			}
		}
		
		for (int i = tabuada_de; i <= tabuada_ate;i++) {
			System.out.printf("%d X %d = %d\n",numero_tabuada,i,numero_tabuada*i);
		}
		
		stdin.close();
		
	}

}
