package com.github.marjan87.db_app.bean;

import java.util.HashSet;

public class Vorlesung {
	
	private int vorlesungId;
	private String titel;
	private Dozent dozent;
	private HashSet<Teilnahme> teilnehmer;
	
	public Vorlesung() {
		// TODO Auto-generated constructor stub
	}

	public int getVorlesungId() {
		return vorlesungId;
	}

	public void setVorlesungId(int vorlesungId) {
		this.vorlesungId = vorlesungId;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public Dozent getDozent() {
		return dozent;
	}

	public void setDozent(Dozent dozent) {
		this.dozent = dozent;
	}

	public HashSet<Teilnahme> getTeilnehmer() {
		return teilnehmer;
	}

	public void setTeilnehmer(HashSet<Teilnahme> teilnehmer) {
		this.teilnehmer = teilnehmer;
	}

}
