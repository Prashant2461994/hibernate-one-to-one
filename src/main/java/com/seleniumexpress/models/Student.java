package com.seleniumexpress.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student { // enitity -> primary key

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id", length = 45, nullable = false)
	private int id; // value type

	@Column(name = "student_name", length = 45, nullable = false)
	private String name;

	@Column(name = "student_country", length = 45, nullable = false)
	private String country;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passport_id")
	private Passport passport;

	public int getId() {
		return id;
	}

	public Passport getPassportId() {
		return passport;
	}

	public void setPassportId(Passport passportId) {
		this.passport = passportId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", country=" + country + ", passport=" + passport + "]";
	}
}
