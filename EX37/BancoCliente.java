package EX37;

public class BancoCliente {
	
	private int id;
	private String nome;
	private int idade;
	private String email;
	private ContaBancaria conta;
	
	BancoCliente () {
		
	}
	
	BancoCliente(int id,String nome,int idade,String email,ContaBancaria conta) {
		
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public ContaBancaria getConta() {
		return this.conta;
	}

}
