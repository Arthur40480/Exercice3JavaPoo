package fr.fms.entities;

public class Commerciale extends Person {
	// Attributs ( tous les attributs de Person ) + :
	private String entreprise;
	private double remuneration;
	
	final double MIN_REMUNERATION = 1;
	
	// Constructeur :
	public Commerciale(String lastName, String name, int age, String adress, City bornCity, String entreprise, double remuneration) {
		super(lastName, name, age, adress, bornCity);
		this.entreprise = entreprise;
		this.remuneration = remuneration;

	}
	// Méthode de classe :
	public String toString() {
		return this.getLastName() + " , " + this.getName() + " , " + this.getAge() + "ans , habitant " +
				this.getAdress() + " , Ville de naissance :" + this.bornCity.getCityName() + " , " + 
				this.bornCity.getCountry() + " , Entreprise : " + this.entreprise + " , % CA : " + this.remuneration;
	}
	
	// Accesseurs (getter et setter) :
	public String getEntreprise() {
		return this.entreprise;
	}
	
	public double getRemuneration() {
		return this.remuneration;
	}
	
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	
	public void setRemuneration(double remuneration) {
		if(remuneration < 0) {
			System.out.println("% du chiffre d'affaire inférieur à 0 est impossible !");
			this.remuneration = MIN_REMUNERATION;
		} else {
			this.remuneration = remuneration;
		}
	}
}
