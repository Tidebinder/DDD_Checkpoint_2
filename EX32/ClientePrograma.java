package EX32;

import java.util.Scanner;

public class ClientePrograma {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner (System.in);
		Cliente[] listaCliente = new Cliente[5] ; 
		
		for (int i = 0; i<5; i++) {
			Cliente a = new Cliente() ;
			System.out.printf("Digite seu id: ");
			a.id = stdin.nextInt();
			System.out.printf("Digite seu nome: ");
			a.nome = stdin.next();
			System.out.printf("Digite sua idade: ");
			a.idade = stdin.nextInt();
			System.out.printf("Digite seu email: ");
			a.email = stdin.next();
			listaCliente[i] = a ;
		}
		for (int i = 0 ; i<5; i++) {
			
			if(listaCliente[i].idade > 18) {
				System.out.printf("O cliente %s é maior de idade. \n",listaCliente[i].nome);
			}
		}
		stdin.close();	
	}
}
