package EX34;

import java.util.Scanner;

public class CadastroCliente {
	public static void main(String[] args) {
		Scanner stdin = new Scanner (System.in);
		
		Cliente [] ListaClientes = new Cliente[5];
		int id;
		String nome;
		int idade;
		String email;
		ContaBancaria conta;
		String atualizaEmail;
		
		String PossuiConta;
		
		for (int i = 0 ; i<5 ; i++) {

			
			System.out.println("Digite seu id: ");
			id= stdin.nextInt();
			
			System.out.println("Digite sua idade: ");
			idade = stdin.nextInt();
			
			System.out.println("Digite seu nome: ");
			nome = stdin.next();
			
			System.out.println("Digite seu email: ");
			email = stdin.next();
			
			System.out.println("Você possui conta bancária (S/N) ? ");
			PossuiConta =  stdin.next().toUpperCase();
			
			if (PossuiConta.equals("S")) {
				ContaBancaria cb = new ContaBancaria();
				
							
				System.out.println("Digite sua agência: ");
				cb.agencia = stdin.next();
				System.out.println("Digite o número da conta: ");
				cb.numero = stdin.next();
				System.out.println("Digite o seu saldo: ");
				cb.saldo = stdin.nextDouble();
				
				conta = cb;
			}else {	
				conta = null;	
			}
			
			Cliente c = new Cliente(id,nome,idade,email,conta);
			ListaClientes[i] = c ;
			
		}
		for (int i = 0 ; i<5 ; i++) {
			
			System.out.printf("\n %s ", ListaClientes[i].ExibirNomeIdade());
			System.out.printf("\n %s ", ListaClientes[i].exibirDadosConta());
			System.out.println("Deseja atualizar o email (S/N) ? ");
			atualizaEmail =  stdin.next().toUpperCase();
			
			if(atualizaEmail.equals("S")) {
				System.out.println("Digite o email do cliente");
				email = stdin.next();
				
				ListaClientes[i].AtualizarEmail(email);
				
				System.out.printf("Email atualizado com sucesso! Novo email: %s", ListaClientes[i].email);
			}
		}
		stdin.close();
	}

}
