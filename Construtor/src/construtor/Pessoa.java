package construtor;

public class Pessoa{
	private String nome;
	private int idade = 18;
	private int idadeMinima = 18;

//	Construtor Principal.
	public Pessoa(String nome, int idade){
//	Para chamar um construtor dentro de outro construtor sobrecarregado utilizamos apenas o this() e passamos o parametro dentro do parenteses do this()
		this(nome);
		this.setIdade(idade);
	}

//	Construtor sobrecarregado.
	public Pessoa(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;	
	}
	
	public void setNome(String nome){
		this.nome = nome;	
	}

	public int getIdade(){
		return this.idade;
	}

	public void setIdade(int idade){
		if(idade<idadeMinima){
			System.out.println("Idade invalida " + idade);
		}else{
			this.idade = idade;	
		}
	}
	
	public void imprime(){
		System.out.println("Pessoa: " + this.nome + " tem " + this.idade + " anos");
	}

}
