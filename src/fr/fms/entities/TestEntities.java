package fr.fms.entities;

import java.util.*;

public class TestEntities {

	public static void main(String[] args) {
		// On créer le tableau de Person qui contiendras des instance d'Employe et de Commerciale :
		Person[] personTab = new Person[5];
		ArrayList<Commerciale> commercialeList = new ArrayList<>();
		ArrayList<Employe> employeList = new ArrayList<>();
		
		Commerciale charles = new Commerciale("Jean", "Charle", 45, "rue des baleines", new City("Montpellier", "France", 12000), "Jardiland", 2);
		Commerciale bernard = new Commerciale("Bernard", "Navarro", 70, "camping la dune", new City("Biscarosse", "France", 2000), "Crédit Agricole", 22);
		Commerciale henry = new Commerciale("Henry", "Smith", 25, "quartier mora", new City("Moliets", "France", 1000), "FMS", 0.2);
		Employe antoinette = new Employe("Antoinette", "Lafitte", 38, "n°12 avenue des dindes", new Capital("Paris", "France", 100000, "Tour Eiffel"), "Decathlon", 1400);
		Employe bernadette = new Employe("Bernadette", "Trucho", 38, "Immeuble 8 ", new Capital("Bangkok", "Thaïlande", 800000, "The Grand Palace"), "Marché", 10000);
		
		// On ajoute les instance de la classe Commerciale et Employe à notre personTab :
		personTab[0] = charles;
		personTab[1] = bernard;
		personTab[2] = henry;
		personTab[3] = antoinette;
		personTab[4] = bernadette;
		
		// On ajoute les instance de la classe Commerciale à notre liste:
		commercialeList.add(charles);
		commercialeList.add(bernard);
		commercialeList.add(henry);
		
		// On ajoute les instance de la classe Employe à notre liste :
		employeList.add(antoinette);
		employeList.add(bernadette);
		System.out.println("******** TABLEAU AVEC INSTANCES EMPLOY ET COMMERCIALE ********");
		
		// On boucle sur notre tableau d'Objet :
		for(Person personne : personTab) {
			System.out.println(personne);
		}
		System.out.println();
		
		System.out.println("******** LISTE AVEC INSTANCES COMMERCIALE ********");
		for(Commerciale commercial : commercialeList) {
			System.out.println(commercial);
		}
		System.out.println();
		
		System.out.println("******** LISTE AVEC INSTANCES EMPLOYE ********");
		for(Employe employe : employeList) {
			System.out.println(employe);
		}
		System.out.println();
	}

}
