package EX35;

import java.util.Scanner;

public class CadastroCliente {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner (System.in);
		
		Cliente[]ListaCliente= new Cliente[5];
		
		int id;
		String nome;
		int idade;
		String email;
		ContaBancaria conta;
		String possuiConta;
		String AtualizarEmail;
		String agencia;
		String numero;
		double saldo;
		String novoEmail;
		
		for (int i = 0 ; i<5 ; i++) {
			Cliente c = new Cliente();
			
			System.out.println("Digite o seu id: ");
			id = stdin.nextInt();
			c.setId(id);
			
			System.out.println("Digite o seu nome: ");
			nome = stdin.next();
			c.setNome(nome);
			
			System.out.println("Digite a sua idade: ");
			idade = stdin.nextInt();
			c.setIdade(idade);
			
			System.out.println("Digite o seu email:");
			email = stdin.next();
			c.setEmail(email);
			
			System.out.println("Possui conta banc�ria (S/N): ");
			possuiConta = stdin.next().toUpperCase();
			
			if (possuiConta.equals("S")) {
				
				ContaBancaria cb = new ContaBancaria();
							
				System.out.printf("Digite sua ag�ncia: ");
				agencia = stdin.next();
				cb.setAgencia(agencia);
				System.out.printf("Digite o n�mero da conta: ");
				numero = stdin.next();
				cb.setNumero(numero);
				System.out.printf("Digite o seu saldo: ");
				saldo = stdin.nextDouble();
				cb.setSaldo(saldo);
				
				c.setContaBancaria(cb);
			}else {	
				conta = null;	
			}
			
	
			ListaCliente[i] = c;
			
			
		}
		for (int i = 0 ; i< 5 ; i++) {
			
			
			System.out.println("\nDeseja atualizar seu email (S/N)? ");
			AtualizarEmail = stdin.next().toUpperCase();
			
			if(AtualizarEmail.equals("S")) {
				System.out.println("Digite o novo email do cliente: ");
				novoEmail = stdin.next();

				ListaCliente[i].setAtualizarEmail(novoEmail);
				
				System.out.printf("Email atualizado com sucesso! Novo email: %s", ListaCliente[i].getEmail());
			}
			System.out.printf("\n %s", ListaCliente[i].getExibirNomeIdade());
			System.out.printf("\n %s", ListaCliente[i].getExibirDadosConta());
			
		}
		
		stdin.close();
	}

}
