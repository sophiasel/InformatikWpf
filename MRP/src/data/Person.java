package data;

import java.util.ArrayList;

public class Person {
	//
	private static ArrayList<Person> personenListe = new ArrayList<>();
	//static damit nur einmal vorhanden
	//
	private String vorname = null;
	private String nachname = null;
	private boolean female = false;
	//Modifier private -> getter und setter notwendig
	//Standardwerte setzen!
	
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public boolean isFemale() {
		return female;
	}

	public void setFemale(boolean female) {
		this.female = female;
	}
	
	@Override
	public String toString() {
		return (isFemale() ? "Frau" : "Mann") + " " + getVorname() + " " + getNachname();
		//dasselbe wie: if isFemale(){....} else{....}
	}

	public static ArrayList<Person> getPersonenListe() {
		return personenListe;
	}

}
