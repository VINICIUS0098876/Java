package construtor;
class UsaPessoa{

	public static void main(String[] args){
		Pessoa marcelo = new Pessoa();
		marcelo.inicializaPessoa("Marcelo");
		marcelo.imprime();

		Pessoa daniel = new Pessoa();
		daniel.inicializaPessoa("Daniel");
//		System.out.println("Lendo o nome: " + daniel.getNome());
		
		daniel.imprime();
	}

}