package services;

import java.time.LocalDate;
import java.util.Random;

import classes.Employer;

public class EmployerService {

	public EmployerService() {
		
	}
	
	public Employer create(int id, String nom, String prenom, int age, String pole, float salaire, boolean actif ) {
		
		return new Employer(id, nom, prenom, age, pole, salaire, actif);
		
	}
	 
	
	public String getInformation(Employer employer) {
		
		return employer.toString();
		
	
	
			
	}
		
	
}
