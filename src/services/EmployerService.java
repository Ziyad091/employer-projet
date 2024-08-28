package services;

import java.time.LocalDate;
import java.util.Random;

import classes.Employer;

public class EmployerService {

	public EmployerService() {
		
	}
	
	public Employer create(int id, String nom, String prenom, int age, String sexe, String pole, LocalDate dateEntree, LocalDate dateSortie, float salaire, boolean actif ) {
		
		return new Employer(id, nom, prenom, age, sexe, pole, dateEntree, dateSortie, salaire, actif);
		
		
	}
	 
	
	public String getInformation(Employer employer) {
		
		
			
	}
		
	
		
		
	}
	
}
