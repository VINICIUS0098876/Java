package construtor;

class UsaPessoa{

	public static void main(String[] args){
//		Utilizando construtores passamos apenas as respostas dentro dos parenteses
		Pessoa marcelo = new Pessoa("Marcelo");
		marcelo.imprime();

		Pessoa daniel = new Pessoa("Daniel", 19);
		daniel.imprime();	
	}

}
