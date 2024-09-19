public class Demo{

	public static void main(String args[]){
	
		Country country = new Country();
		country.setCountryName("PAKISTAN");

		University uni = new University();
		uni.setUniversityName("COMSATS UNIVERSITY");
		country.setPK(uni);
		
		Campus lahore = new Campus();
		lahore.setCampusName("Lahore Campus");
		uni.setLahoreCampus(lahore);

		Campus islamabad = new Campus();
		islamabad.setCampusName("Islamabad Campus");	
		uni.setIslamabadCampus(islamabad);	

		Department cs = new Department();
		cs.setName("Computer Science");
		cs.setHod("SALMAN SALEEM");

		Department se = new Department();
		se.setName("Software Engineering");
		se.setHod("Imran Zahoor");

		Department cs1 = new Department();
		cs1.setName("Computer Science");
		cs1.setHod("Adnan Zahoor");

		Department se1 = new Department();
		se1.setName("Software Engineering");
		se1.setHod("Farhan Saleem");

		lahore.setCs(cs);
		lahore.setSe(se);

		islamabad.setCs(cs1);
		islamabad.setSe(se1);
		
		//uni.UniversityDisplay();
		country.displayCountry();

	
	}
}