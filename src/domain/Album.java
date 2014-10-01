package domain;

import java.util.List;

public class Album {
	
	private String title;
	private String type;
	private String year;
	
	private Artist artist;
	private List<Tracks> tracksList;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	public List<Tracks> getTracksList() {
		return tracksList;
	}
	public void setTracksList(List<Tracks> tracksList) {
		this.tracksList = tracksList;
	}
}
