package fr.fms.entities;

public class TestEntities {

	public static void main(String[] args) {
		// On créer le tableau de Person qui contiendras des instance d'Employe et de Commerciale :
		Person[] personTab = new Person[5];
		
		Commerciale charles = new Commerciale("Jean", "Charle", 45, "rue des baleines", new City("Montpellier", "France", 12000), "Jardiland", 2);
		Commerciale bernard = new Commerciale("Bernard", "Navarro", 70, "camping la dune", new City("Biscarosse", "France", 2000), "Crédit Agricole", 22);
		Commerciale henry = new Commerciale("Henry", "Smith", 25, "quartier mora", new City("Moliets", "France", 1000), "FMS", 0.2);
		Employe antoinette = new Employe("Antoinette", "Lafitte", 38, "n°12 avenue des dindes", new Capital("Paris", "France", 100000, "Tour Eiffel"), "Decathlon", 1400);
		Employe bernadette = new Employe("Bernadette", "Trucho", 38, "Immeuble 8 ", new Capital("Bangkok", "Thaïlande", 800000, "The Grand Palace"), "Marché", 10000);
		
		personTab[0] = charles;
		personTab[1] = bernard;
		personTab[2] = henry;
		personTab[3] = antoinette;
		personTab[4] = bernadette;
		
		for(Person personne : personTab) {
			System.out.println(personne);
		}
	}

}
