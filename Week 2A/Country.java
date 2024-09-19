public class Country{

	private  String countryName;
	private University pk;

	public void setCountryName(String countryN)
	{
		countryName = countryN;
	}

	public String getCountryName()
	{
		return countryName;
	}

	public void setPK(University pkC)
	{
		pk = pkC;
	}

	public University getPK()
	{
		return pk;
	}

	public void displayCountry()
	{
		System.out.println("\n|||||||||||||||||||||||||||||||||||||");
		System.out.println(" Country Name = " + countryName);
		pk.UniversityDisplay();
		System.out.println("|||||||||||||||||||||||||||||||||||||\n");

		
	}

}