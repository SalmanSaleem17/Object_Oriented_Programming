public class Department{
	private String name;
	private String hod;

	public void setName(String nName){
		name = nName;
	}
	
	public void setHod(String nHod){
		hod = nHod;
	}

	String getName(){
		return name;
	}

	String getHod(){
		return hod;
	}

	public void display(){
		System.out.println("Department Name = "+ name);
		System.out.println("HOD Name = "+ hod);
	}
} 