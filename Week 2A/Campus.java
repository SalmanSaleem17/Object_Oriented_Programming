public class Campus{
	private String campusName;
	private Department cs;
	private Department se;

	public void setCampusName(String nName){
		campusName = nName;
	}

	public String getCampusName(){
		return campusName;
	}

	public void setCs(Department cs1){
		cs = cs1;
	}

	public Department getCs(){
		return cs;
	}

	public void setSe(Department se1){
		se = se1;
	}

	public Department getSe(){
		return se;
	}

	public void CampusDisplay(){
		System.out.println("Campus Name = "+ campusName);
		cs.display(); 
		se.display();
	}
} 