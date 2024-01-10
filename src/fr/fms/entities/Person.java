package fr.fms.entities;

public class Person {
	// Attributs :
	private String lastName;		// Nom
	private String name;			// Prénom
	private int age;				// Age
	private String adress;			// Adresse
	public City bornCity;			// Ville de naissance
	
	// Constructeur :
	public Person(String lastName, String name, int age, String adress, City bornCity) {
		this.lastName = lastName;
		this.name = name;
		this.age = age;
		this.adress = adress;
		this.bornCity = bornCity;	
	}
	
	public Person(String lastName, String name, int age) {
		this.lastName = lastName;
		this.name = name;
		this.age = age;
		this.adress = "unknow";
		this.bornCity = new City("Bornnul", "unknow");
	}
	
	public Person(String lastName, String name) {
		this.lastName = lastName;
		this.name = name;
		this.age = 0;
		this.adress = "unknow";
		this.bornCity = new City("Bornnul", "unknow");
	}
	
	// Accesseur (getter et setter) :
	public String getLastName() {
		return this.lastName;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getAdress() {
		return this.adress;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	// Méthode de classe :
	// Méthode de classe permettant d'utiliser system.out.println() directement sur l'objet en question :
	public String toString() {
		if(!this.bornCity.getCityName().equals("Bornnul")) {
			return "[lastName= " + this.lastName + ", firstName= " + this.name + ", âge= " + this.age + 
					", adress=" + this.adress + "] BornCity [name= " + this.bornCity.getCityName() + ", state= " 
					+ this.bornCity.getCountry() + ", nbInhabitants= " + this.bornCity.getNbrInhabitant() + "]";

		} else {
			return "[lastName= " + this.lastName + ", firstName= " + this.name + ", âge= " + this.age + 
					", adress= " + this.adress + "] Bornnull";

		}
	}
}
