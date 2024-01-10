package fr.fms.entities;

public class Employe extends Person {
	// Attributs ( tous les attributs de Person ) + :
	private String entreprise;
	private double salary;
	
	// Constructeur :
	public Employe(String lastName, String name, int age, String adress, City bornCity, String entreprise, double salary) {
		super(lastName, name, age, adress, bornCity);
		this.entreprise = entreprise;
		this.salary = salary;
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
			return;
		}
		this.salary = salary;
	}
	
	// Méthode de classe :
	public String toString() {
		if(bornCity instanceof Capital) {
			Capital capital = (Capital) this.bornCity;
			return this.lastName + " , " + this.name + " , " + this.age + "ans , habitant: " + this.adress + " , Ville de naissance : " +
					capital.cityName + " , " + capital.country + " , " + capital.getNbrPeople() + " d'habitants , monument :" + capital.getMonument()
					+ " , Entreprise : " + this.entreprise + " , salaire : " + this.salary;  
					
		} else {
			return this.lastName + " , " + this.name + " , " + this.age + "ans , habitant: " + this.adress + " , Ville de naissance : " +
					this.bornCity.cityName + " , " + this.bornCity.country + " , " + this.bornCity.getNbrPeople()+ " , Entreprise : " + 
					this.entreprise + " , salaire : " + this.salary;  
		}

	}
}