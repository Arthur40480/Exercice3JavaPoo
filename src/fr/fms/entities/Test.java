package fr.fms.entities;

public class Test {

	public static void main(String[] args) {
		Capital londres = new Capital("Londres", "France", 100000, "BigBen");
		Capital bangkok = new Capital("Bangkok", "Thaïlande", 300000, "Le Louvre");
		Capital paris = new Capital("Bayonne", "France", 100000, "La Tour Eiffel");
		Employe marchand = new Employe("Nom", "Prenom", 30, "Adresse", londres, "FMS", 1400);
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
		System.out.println(marchand);
	}

}
