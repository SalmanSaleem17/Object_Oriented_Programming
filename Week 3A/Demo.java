public class Demo
{
	public static void main(String args[])
	{
		Artwork artwork = new Artwork();
		artwork.setBookName("Differential Equations");
		artwork.setYear(1996);
		
		Artist artist = new Artist();
		artist.setName("D.J. Zill");
		artwork.setArtistName(artist);
		
		artwork.bookDisplay();

	}
}