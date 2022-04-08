package br.com.generation.herancaanimal;

public class TestaTodosAnimais {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica sloth = new Preguica();
		
		dog.setNome("Woody");
		dog.setIdade(2);
		
		horse.setNome("Trov�o");
		horse.setIdade(8);
		
		sloth.setNome("Jazz");
		sloth.setIdade(2);

		System.out.println("Nome do doguinho: " + dog.getNome());
		System.out.println("O doguinho tem: " + dog.getIdade() + " anos.");
		dog.correr();
		System.out.println();
		System.out.println("Nome do Cavalo: " + horse.getNome());
		System.out.println("O Cavalo tem: " + horse.getIdade() + " anos.");
		horse.cavalgando();
		System.out.println();
		System.out.println("Nome da Pregui�a: " + sloth.getNome());
		System.out.println("A pregui�a tem: " + sloth.getIdade() + " anos.");
		sloth.subir();
	}

}
