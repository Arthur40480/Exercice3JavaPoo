package fr.fms.entities;

public class Employe extends Person {
	// Attributs ( tous les attributs de Person ) + :
	private String entreprise;
	private double salary;
	
	final double MIN_SALARY = 1;
	
	// Constructeur :
	public Employe(String lastName, String name, int age, String adress, City bornCity, String entreprise, double salary) {
		super(lastName, name, age, adress, bornCity);
		this.entreprise = entreprise;
		this.salary = salary;
	}
	
	// Méthode de classe :
	public String toString() {
		// Si notre attribut bornCity est une instance de la classe Capital alors :
		if(bornCity instanceof Capital) {
			Capital capital = (Capital) this.bornCity;
			return this.getLastName() + " , " + this.getName() + " , " + this.getAge() + "ans , habitant: " + this.getAdress() + " , Ville de naissance : " +
					capital.getCityName() + " , " + capital.getCountry() + " , monument :" + capital.getMonument()
					+ " , Entreprise : " + this.entreprise + " , salaire : " + this.salary;  
		// Sinon :			
		} else {
			return this.getLastName() + " , " + this.getName() + " , " + this.getAge() + "ans , habitant: " + this.getAdress() + " , Ville de naissance : " +
					this.bornCity.getCityName() + " , " + this.bornCity.getCountry() + " , Entreprise : " + 
					this.entreprise + " , salaire : " + this.salary;  
		}
	}
		
	// Accesseur (getter setter) :
	public String getEntreprise() {
		return this.entreprise;
	}
	
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setSalary(double salary) {
		if(salary < 0) {
			System.out.println("Le salaire d'un employer ne peux pas être inférieur à 0 !");
			this.salary = MIN_SALARY;
		}
		this.salary = salary;
	}
}
