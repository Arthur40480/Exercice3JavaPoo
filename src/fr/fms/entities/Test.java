package fr.fms.entities;

public class Test {

	public static void main(String[] args) {
		Capital londres = new Capital("Londres", "France", 100000, "BigBen");
		Capital bangkok = new Capital("Bangkok", "Thaïlande", 300000, "Le Louvre");
		Capital paris = new Capital("Bayonne", "France", 100000, "La Tour Eiffel");

		londres.setCountry("Angleterre");
		bangkok.setMonument("The Grand Palace");
		paris.setCityName("Paris");
		paris.setNbrPeople(600000);
		
		System.out.println(londres.getCountry());
		System.out.println(bangkok.getMonument());
		System.out.println(paris.getCityName());
		System.out.println(paris.getNbrPeople());
		
		System.out.println(londres);
		System.out.println(bangkok);
		System.out.println(paris);
	}

}
