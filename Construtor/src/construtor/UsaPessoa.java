package construtor;

class UsaPessoa{

	public static void main(String[] args){
		Pessoa marcelo = new Pessoa("Marcelo");
		marcelo.imprime();

		Pessoa daniel = new Pessoa("Daniel", 19);
		daniel.imprime();	
	}

}
