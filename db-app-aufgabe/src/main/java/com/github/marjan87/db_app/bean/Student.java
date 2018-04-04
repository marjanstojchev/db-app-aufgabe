package com.github.marjan87.db_app.bean;

import java.util.HashSet;

public class Student extends Person{
	
	private int studentId;
	private HashSet<Teilnahme> teilnahme;
	
	public Student() {
		super();
	
	}
	
	public HashSet<Teilnahme> getTeilnahme() {
		return teilnahme;
	}

	public void setTeilnahme(HashSet<Teilnahme> teilnahme) {
		this.teilnahme = teilnahme;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
}
