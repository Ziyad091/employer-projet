package classes;

import java.time.LocalDate;

public class Employer {
	
	private int id;
	private String nom;
	private String prenom;
	private int age;
	private String sexe;
	private String pole;
	private LocalDate dateEntree;
	private LocalDate dateSortie;
	private float salaire;
	private boolean actif;
	
	public Employer() {
		
	}
	
	public Employer(int id, String nom, String prenom, int age, String sexe, String pole, LocalDate dateEntree, LocalDate dateSortie, float salaire, boolean actif ) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.sexe = sexe;
		this.pole = pole;
		this.dateEntree = dateEntree;
		this.dateSortie = dateSortie;
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

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getPole() {
		return pole;
	}

	public void setPole(String pole) {
		this.pole = pole;
	}

	public LocalDate getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(LocalDate dateEntree) {
		this.dateEntree = dateEntree;
	}

	public LocalDate getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(LocalDate dateSortie) {
		this.dateSortie = dateSortie;
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
		return "["+ this.id + "," + this.nom + "," + this.prenom + "," + this.age + "," + this.sexe + "," + this.pole + "," + this.dateEntree + "," + this.dateSortie + "," + this.salaire + "," + this.actif + "," +  "]";
	
	
	}

}
