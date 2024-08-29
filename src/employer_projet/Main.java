package employer_projet;

import classes.Employer;
import services.EmployerService;

public class Main {

	public static void main(String[] args) {

		EmployerService employerService = new EmployerService();
		
		Employer employerA = employerService.create(
				0,
				"Nom A",
				"Prenom A",
				28,
				"Finance et comptabilité",
				30250.26f,
				true
			);
		
		System.out.println(employerService.getInformation(employerA));
			
	}


}
