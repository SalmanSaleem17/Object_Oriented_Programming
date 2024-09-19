public class Artwork{
	private String bookName;
	private int year;
	private Artist Artist1;

	public void setBookName(String bookTitle)
	{
		bookName = bookTitle;
	}	

	String getBookName()
	{
		return bookName;
	}

	public void setYear(int yyyy)
	{
		year = yyyy;
	}	

	int getYear()
	{
		return year;
	}

	public void setArtistName(Artist artist){
		Artist1 = artist;
	}

	public Artist getArtistName(){
		return Artist1;
	}

	public void bookDisplay()
	{
		System.out.println("Book Name = " + bookName);
		System.out.println("Published Year = " + year);
		Artist1.display();
	}
}