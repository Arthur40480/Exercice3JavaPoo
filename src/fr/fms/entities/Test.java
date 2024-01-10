package fr.fms.entities;

public class Test {

	public static void main(String[] args) {
		Capital londres = new Capital("Londres", "France", 100000, "BigBen");
		Capital bangkok = new Capital("Bangkok", "Thaïlande", 300000, "Le Louvre");
		Capital paris = new Capital("Bayonne", "France", 100000, "La Tour Eiffel");
		
		City bayonne = new City("Bayonne", "France", 100000);
		
		londres.setCountry("Angleterre");
		bangkok.setMonument("The Grand Palace");
		paris.setCityName("Paris");
		paris.setNbrInhabitant(600000);;
		
		System.out.println(londres.getCountry());
		System.out.println(bangkok.getMonument());
		System.out.println(paris.getCityName());
		System.out.println(paris.getNbrInhabitant());
		
		System.out.println(londres);
		System.out.println(bangkok);
		System.out.println(paris);
		
		Person bernard = new Person("Nom", "Prenom", 30, "Adresse", londres);
		
		Employe marchand = new Employe("Nom", "Prenom", 30, "Adresse", londres, "FMS", 1400);
		Employe macon = new Employe("Nom", "Prenom", 30, "Adresse", bayonne, "FMS", 1400);
		System.out.println(marchand);
		System.out.println(macon);
		
		Commerciale a = new Commerciale("Gibert", "Arthur", 30, "15 rue des artisans", new City("Toulouse", "France", 250000), "FMS", 50);
		a.setRemuneration(-10);
		System.out.println(a.getRemuneration());
	}

}
