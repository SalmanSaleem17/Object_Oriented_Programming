public class University{

	private String universityName;
	private Campus lahore;
	private Campus islamabad;

	public void setUniversityName(String uName){
		universityName = uName;
	}

	public String getUniversityName(){
		return universityName;
	}

	public void setLahoreCampus(Campus lhr){
		lahore = lhr;;
	}

	public Campus getLahoreCampus(){
		return lahore;
	}

	public void setIslamabadCampus(Campus isb){
		islamabad = isb;
	}

	public Campus getIslamabadCampus(){
		return islamabad;
	}

	public void UniversityDisplay(){
		System.out.println("====================================");
		System.out.println("University Name = "+ universityName);
		System.out.println("====================================");
		lahore.CampusDisplay(); 
		System.out.println("------------------------------------");
		islamabad.CampusDisplay();
		System.out.println("====================================");
	}

}