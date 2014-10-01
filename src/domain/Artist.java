package domain;

public class Artist {
	
	private String name;
	private String country;
	private String genry;
	
	private Album album;
	
	public String getGenry() {
		return genry;
	}

	public void setGenry(String genry) {
		this.genry = genry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

}
