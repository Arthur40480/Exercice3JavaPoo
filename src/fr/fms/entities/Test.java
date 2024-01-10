package fr.fms.entities;

public class Test {

	public static void main(String[] args) {
		// EXERCICE 3.1 :
		Capital londres = new Capital("Londres", "France", 100000, "BigBen");
		Capital bangkok = new Capital("Bangkok", "Thaïlande", 300000, "Le Louvre");
		Capital paris = new Capital("Bayonne", "France", 100000, "La Tour Eiffel");
		
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
		
		// EXERCICE 3.2 :
		City bayonne = new City("Bayonne", "France", 100000);
		
		Employe guillaume = new Employe("Coutarel", "Guillaume", 30, "15 avenue des tapis", londres, "E.Leclerc", 1400);
		Employe romain = new Employe("Couture", "Romain", 30, "5 rue des tulipes", bayonne, "FMS", 1800);
		
		System.out.println(guillaume);
		System.out.println(romain);
		
		// EXERCICE 3.3 :
		Commerciale arthur = new Commerciale("Gibert", "Arthur", 30, "15 rue des artisans", new City("Toulouse", "France", 250000), "FMS", 50);
		System.out.println(arthur);
		
		// EXERCICE 3.4:
		// EXERCICE 3.5:
	}

}
