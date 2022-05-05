package EX37;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Iterator;
public class RegistroBancoCliente {
	
	public static void main(String args[]) {
		
		int codigo = 0;
		Scanner stdin = new Scanner(System.in);
		
		ArrayList<BancoCliente> listaClientes = new ArrayList<>();
		
		int id = 1;
		
		while(codigo != 5) {
			
			System.out.println("###Cadastro de clientes do banco###");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Editar cliente");
			System.out.println("3 - Listar clientes");
			System.out.println("4 - Deletar cliente");
			System.out.println("5 - Sair");
			System.out.print("Digite a opção desejada:");
			codigo = stdin.nextInt();
			switch(codigo) {
				case 1 :
					BancoCliente novo_cliente = new BancoCliente();
					System.out.println("###Cadastro de novo cliente###");
					//Isso aqui está aqui para consumirmos o \n do println acima, se não os proximos
					//nextLine iam ler ele.
					stdin.nextLine();
					novo_cliente.setId(id);
					System.out.print("Digite o nome do cliente:");
					novo_cliente.setNome(stdin.nextLine());
					System.out.print("Digite o email do cliente:");
					novo_cliente.setEmail(stdin.next());
					System.out.print("Digite a idade do cliente:");
					novo_cliente.setIdade(stdin.nextInt());
					String nova_agencia = Integer.toString( new Random().nextInt() * 1);
					String nova_conta = Integer.toString(new Random().nextInt() * 1);
					double saldo = 0;
					ContaBancaria nova_contabancaria = new ContaBancaria(nova_agencia,nova_conta,saldo);
					novo_cliente.setConta(nova_contabancaria);
					listaClientes.add(novo_cliente);
					System.out.println("Cliente e conta bancaria cadastradas com sucesso.");
					break;
				case 2 :
					if (listaClientes.size() == 0) {
						System.out.println("Nenhum cliente cadastrado ainda.\nSaindo...");
						break;
					}
					System.out.print("Digite o id do úsuario que deseja editar:");
					int cliente_id = stdin.nextInt();
					BancoCliente cliente_selecionado = null;
					for (BancoCliente cliente: listaClientes) {
						if (cliente_id == cliente.getId()) {
							cliente_selecionado = cliente;
						}
					}
					
					if (cliente_selecionado != null) {
						System.out.println("1 - Editar nome");
						System.out.println("2 - Editar email");
						System.out.println("3 - Editar idade");
						System.out.println("4 - Voltar ao menu principal");
						System.out.print("Digite a opção desejada:");
						int option = stdin.nextInt();
						
						switch (option) {
							case 1:
								System.out.print("Digite o novo nome:");
								String nome = stdin.next();
								cliente_selecionado.setNome(nome);
								System.out.println("\nNome atualizado com sucesso!");
								break;
							case 2:
								System.out.print("Digite o novo email:");
								String email = stdin.next();
								cliente_selecionado.setEmail(email);
								System.out.println("\nEmail atualizado com sucesso!");
								break;
							case 3:
								System.out.print("Digite a nova idade:");
								int idade = stdin.nextInt();
								cliente_selecionado.setIdade(idade);
								System.out.println("\nIdade atualizado com sucesso!");
								break;
							case 4:
								break;
						}
					}
					else {
						System.out.println("Cliente não encontrado.");
					}
					
					
					break;
				case 3 :
					if (listaClientes.isEmpty()) {
						System.out.println("Nenhum cliente cadastrado!");
					}
					else {
						for (BancoCliente cliente: listaClientes) {
							ContaBancaria cliente_conta = cliente.getConta();
							System.out.println("____________________________________________");
							System.out.printf("ID:%d\n",cliente.getId());
							System.out.printf("Nome: %s\n",cliente.getNome());
							System.out.printf("Email: %s\n", cliente.getEmail());
							System.out.printf("Idade: %d\n",cliente.getIdade());
							System.out.printf("Agência: %s\n",cliente_conta.getAgencia());
							System.out.printf("Nº da conta: %s\n",cliente_conta.getNumero());
							System.out.printf("Saldo:R$%f",cliente_conta.getSaldo());
							System.out.println("\n_____________________________________________");
						}	
					}
					break;
				case 4 :
					System.out.print("Digite o ID do úsuario que quer deletar:");
					int del_id = stdin.nextInt();
					
					//Precisamos criar um novo iterator para looparmos sobre,
					//Isso porque se iterarmos sobre o ArrayList e removermos um objeto,
					//ele da expcetion por estar modificando o mesmo ArrayList que estamos iterando.
					Iterator<BancoCliente> clientes = listaClientes.iterator();
					
					//Iteramos enquanto o iterator tiver algo para iterarmos.
					while (clientes.hasNext() ) {
						//Pegando o cliente na iteração
						BancoCliente cliente = clientes.next();
						//Se o ID dele for igual
						if (del_id == cliente.getId()) {
							System.out.println("_____________________________________________");
							System.out.printf("Removendo usúario!\nID:%d\nNome:%s\n", cliente.getId(),cliente.getNome());
							//Removemos do iterator, isso também remove do arrayList em que ele foi baseado.
							clientes.remove();
							System.out.println("Removido!");
							System.out.println("_____________________________________________");
							break;
						}
					}
					
					break;
				case 5:
					System.out.println("Saindo....");
					System.exit(0);
					break;
		}
		id += id;
	}
	stdin.close();		
	}
}
	
