package com.springBootProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserRegistration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	@Column(name = "homeaddress")
	private String homeAddress;
	@Column(name = "pincode")
	private int picCode;
	private String city;
	private String district;
	private String state;
	@Column(name = "adharcardnumber")
	private long adharCardNumber;
	@Column(name = "adharcardphoto")
	private String adharcardPhoto;
	@Column(name = "pincordnumber")
	private String pinCordNumber;
	@Column(name = "voteridnumber")
	private String voterIdNumber;
	@Column(name = "fathername")
	private String fatherName;
	@Column(name = "mathername")
	private String matherName;
	@Column(name = "dateofbirth")
	private String dateOfBirth;

	public int getId() {
		return id;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public int getPicCode() {
		return picCode;
	}

	public void setPicCode(int picCode) {
		this.picCode = picCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getAdharCardNumber() {
		return adharCardNumber;
	}

	public void setAdharCardNumber(long adharCardNumber) {
		this.adharCardNumber = adharCardNumber;
	}

	public String getAdharcardPhoto() {
		return adharcardPhoto;
	}

	public void setAdharcardPhoto(String adharcardPhoto) {
		this.adharcardPhoto = adharcardPhoto;
	}

	public String getPinCordNumber() {
		return pinCordNumber;
	}

	public void setPinCordNumber(String pinCordNumber) {
		this.pinCordNumber = pinCordNumber;
	}

	public String getVoterIdNumber() {
		return voterIdNumber;
	}

	public void setVoterIdNumber(String voterIdNumber) {
		this.voterIdNumber = voterIdNumber;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMatherName() {
		return matherName;
	}

	public void setMatherName(String matherName) {
		this.matherName = matherName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
