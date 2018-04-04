package com.github.marjan87.db_app.bean;


public class Teilnahme {

	private Student student;
	private Vorlesung vorlesung;
	private int note;
	
	public Teilnahme() {
		
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Vorlesung getVorlesung() {
		return vorlesung;
	}

	public void setVorlesung(Vorlesung vorlesung) {
		this.vorlesung = vorlesung;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

}
