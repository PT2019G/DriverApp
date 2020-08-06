package org.model;

import java.sql.Date;



public class Register {
	private String name;
	private String email;
	private int contact;
	private int adharCard;
	private String panCard;
	private String licenceNo;
	private String state;
	private String district;
	private String city;
	private Date birthDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(int adharCard) {
		this.adharCard = adharCard;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getLicenceNo() {
		return licenceNo;
	}
	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "Register [name=" + name + ", email=" + email + ", contact="
				+ contact + ", adharCard=" + adharCard + ", panCard=" + panCard
				+ ", licenceNo=" + licenceNo + ", state=" + state
				+ ", district=" + district + ", city=" + city + ", birthDate="
				+ birthDate + "]";
	}
	

}
