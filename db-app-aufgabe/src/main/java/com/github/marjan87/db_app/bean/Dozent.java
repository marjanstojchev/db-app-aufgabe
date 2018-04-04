package com.github.marjan87.db_app.bean;

import java.util.HashSet;

public class Dozent extends Person {
	
	private HashSet<Vorlesung> vorlesung;
	
	private int dozentId;

	public Dozent() {
		super();
	
	}


	public HashSet<Vorlesung> getVorlesung() {
		return vorlesung;
	}



	public void setVorlesung(HashSet<Vorlesung> vorlesung) {
		this.vorlesung = vorlesung;
	}



	public int getDozentId() {
		return dozentId;
	}

	public void setDozentId(int dozentId) {
		this.dozentId = dozentId;
	}
	
	

}
