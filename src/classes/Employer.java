package classes;

import java.time.LocalDate;

public class Employer {
	
	private int id;
	private String nom;
	private String prenom;
	private int age;
	private String pole;
	private float salaire;
	private boolean actif;
	
	public Employer() {
		super();
	}

	public Employer(int id, String nom, String prenom, int age, String pole, float salaire, boolean actif) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.pole = pole;
		this.salaire = salaire;
		this.actif = actif;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPole() {
		return pole;
	}

	public void setPole(String pole) {
		this.pole = pole;
	}

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	@Override
	public String toString() {
		return "Employer : [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", pole=" + pole
				+ ", salaire=" + salaire + ", actif=" + actif + "]";
	}

	

}
