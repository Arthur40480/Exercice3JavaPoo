package fr.fms.entities;

public class City {
	// Attributs :
	private String cityName;					// Nom de la ville
	private String country;					// Pays
	private int nbrInhabitant;				// Nombre d'habitants	
	public static int nbrCity = 0; 			// Nombre de city
	
	final int MIN_INHABITANT = 0;			// Nombre minimum d'habitant
	
	// Constructeurs :
	public City(String cityName, String country, int nbrInhabitant) {
		this.cityName = cityName;
		this.country = country;
		setNbrInhabitant(nbrInhabitant);
		nbrCity ++;
	}
	
	public City(String cityName, int nbrInhabitant) {
		this.cityName = cityName;
		this.country = "unknow";
		setNbrInhabitant(nbrInhabitant);
	}
	
	public City(String cityName, String country) {
		this.cityName = cityName;
		this.country = country;
		this.nbrInhabitant = MIN_INHABITANT;
	}
	
	// Accesseur (getter et setter) :
	public String getCityName() {
		return cityName;
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getNbrInhabitant() {
		return nbrInhabitant;
	}
		
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
		
	public void setNbrInhabitant(int nbrInhabitant) {
		// Si nbrPeople inferieur à 0, alors on return :
		if(nbrInhabitant < MIN_INHABITANT) {
			System.out.println("Le nombre d'habitant ne peut être négatif");
			return;
		}
		this.nbrInhabitant = nbrInhabitant;
	}
	
	// Méthode de classe :
	// Méthode de classe pour ajouter de la population à la population actuelle :
	// Empêche la diminution de population :
	public void addPeople(int peopleToAdd) {
		if(this.nbrInhabitant > (this.nbrInhabitant + peopleToAdd)) {
			System.out.println("Impossible de réduire la population !");
			return;
		}
		this.nbrInhabitant = this.nbrInhabitant + peopleToAdd;
	}
	// Méthode de classe permettant d'afficher les attributs d'une instance de l'objet City :
	public void displayCity() {
		System.out.println("Ville de " + this.cityName + " en " + this.country + " ayant une population de " + this.nbrInhabitant);
	}
	
	// Méthode de classe permettant d'utiliser system.out.println() directement sur l'objet en question :
	public String toString() {
		return "Ville de " + this.cityName + " en " + this.country + " ayant une population de " + this.nbrInhabitant;
	}
}
