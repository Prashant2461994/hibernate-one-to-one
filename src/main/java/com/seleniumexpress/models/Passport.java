package com.seleniumexpress.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passport")
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "passport_id", nullable = false)
	private int id;

	@Column(name = "passport_no", nullable = false, length = 45, unique = true)
	private String passportNo;

	@OneToOne(mappedBy = "passport")
	private Student student;

	public int getId() {
	return id;
	}

	public void setId(int id) {
	this.id = id;
	}

	public String getPassportNo() {
	return passportNo;
	}

	public void setPassportNo(String passportNo) {
	this.passportNo = passportNo;
	}

	public Student getStudent() {
	return student;
	}

	public void setStudent(Student student) {
	this.student = student;
	}

}
