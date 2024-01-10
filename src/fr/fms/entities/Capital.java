package fr.fms.entities;

public class Capital extends City {
	// Attributs ( tous les attributs de City ) + :
	 private String monument;		// Monument
	
	// Constructeur :
	public Capital(String cityName, String country, int nbrPeople, String monument) {
		// Utilisation de super dans le contexte de l'héritage pour se référer à la classe parente (SUPERCLASSE) :
		// Grâce à lui, on peut accéder au membres(attributs, méthodes, constructeurs) de la classe parente (City) :
		super(cityName, country, nbrPeople);
		this.monument = monument;
	}
	
	// Accesseur (setter et getter) :
	public String getMonument() {
		return this.monument;
	}
	
	public void setMonument(String monument) {
		this.monument = monument;
	}
	
	// Méthode de classe :
	// Méthode de classe permettant d'utiliser system.out.println() directement sur l'objet en question :
	@Override
	public String toString() {
		return this.getCityName() + " , " + this.getCountry() + " , " + this.getNbrInhabitant()+ " d'habitants monument : " + this.monument;
	}
	
}
