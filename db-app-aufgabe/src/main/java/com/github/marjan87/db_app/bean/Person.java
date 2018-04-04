package com.github.marjan87.db_app.bean;

public class Person {

	protected String vorname;
	
	protected String nachname;

	public Person(){}
	
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
	
}
