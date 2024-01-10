package fr.fms.entities;

public class City {
	// Attributs :
	public String cityName;				// Nom de la ville
	public String country;				// Pays
	private int nbrPeople;				// Nombre d'habitants	
	public static int nbrCity = 0; 		// Nombre de city
	
	// Constructeurs :
	public City(String cityName, String country, int nbrPeople) {
		this.cityName = cityName;
		this.country = country;
		setNbrPeople(nbrPeople);
		nbrCity ++;
	}
	
	public City(String cityName, int nbrPeople) {
		this.cityName = cityName;
		this.country = "unknow";
		setNbrPeople(nbrPeople);
	}
	
	public City(String cityName, String country) {
		this.cityName = cityName;
		this.country = country;
		this.nbrPeople = 0;
	}
	
	// Accesseur (getter et setter) :
	public String getCityName() {
		return cityName;
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getNbrPeople() {
		return nbrPeople;
	}
		
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
		
	public void setNbrPeople(int nbrPeople) {
		// Si nbrPeople inferieur à 0, alors on return :
		if(nbrPeople < 0) {
			System.out.println("Le nombre d'habitant ne peut être négatif");
			return;
		}
		this.nbrPeople = nbrPeople;
	}
	
	// Méthode de classe :
	// Méthode de classe pour ajouter de la population à la population actuelle :
	// Empêche la diminution de population :
	public void addPeople(int peopleToAdd) {
		if(this.nbrPeople > (this.nbrPeople + peopleToAdd)) {
			System.out.println("Impossible de réduire la population !");
			return;
		}
		this.nbrPeople = this.nbrPeople + peopleToAdd;
	}
	// Méthode de classe permettant d'afficher les attributs d'une instance de l'objet City :
	public void displayCity() {
		System.out.println("Ville de " + this.cityName + " en " + this.country + " ayant une population de " + this.nbrPeople);
	}
	// Méthode de classe permettant d'utiliser system.out.println() directement sur l'objet en question :
	public String toString() {
		return "Ville de " + this.cityName + " en " + this.country + " ayant une population de " + this.nbrPeople;
	}
}
