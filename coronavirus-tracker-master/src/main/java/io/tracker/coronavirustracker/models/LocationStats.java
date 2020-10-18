package io.tracker.coronavirustracker.models;

public class LocationStats {

    private String date;
    private String china;
    private String usa;
    private String uk;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getChina() {
		return china;
	}
	public void setChina(String china) {
		this.china = china;
	}
	public String getUsa() {
		return usa;
	}
	public void setUsa(String usa) {
		this.usa = usa;
	}
	public String getUk() {
		return uk;
	}
	public void setUk(String uk) {
		this.uk = uk;
	}
	@Override
	public String toString() {
		return "LocationStats [date=" + date + ", china=" + china + ", usa=" + usa + ", uk=" + uk + "]";
	}
 

    
}
