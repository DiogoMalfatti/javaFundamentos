package pacoteAula02;

public class Teste {

	public static void main(String[] args) {
		
		Animal animal = new Animal(); //obejto super classe animal
		animal.setAlimenta("Todo animal se alimenta");
		animal.setLocomove("Todo animal se locomove");
		
		Cachorro cachorro = new Cachorro(); //objeto sub classe cachorro
		cachorro.setAlimenta("Cachorro come ração de cachorro"); //extends animal
		cachorro.setLocomove("Cachorro usa 4 patas"); //extends animal
		cachorro.setLatido("Cachorro faz au au"); //especifico cachorro
		
		Animal poodle = new Cachorro();
		poodle.setAlimenta("Poodle come ração de cachorro");
		poodle.setLocomove("Poodle usa 4 patas");

	}

}
