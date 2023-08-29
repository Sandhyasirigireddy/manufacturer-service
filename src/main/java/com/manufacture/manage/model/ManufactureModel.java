package com.manufacture.manage.model;


public class ManufactureModel {
	private int manufacturerId;
	private String companyName; 
	private String registrationNumber;
	private String registrationDate;
	private String description;
	private ContactModel contactModel;
	public ManufactureModel() {
			}
	public ManufactureModel(int manufacturerId, String companyName, String registrationNumber, String registrationDate,
			String description, ContactModel contactModel) {
		super();
		this.manufacturerId = manufacturerId;
		this.companyName = companyName;
		this.registrationNumber = registrationNumber;
		this.registrationDate = registrationDate;
		this.description = description;
		this.contactModel = contactModel;
	}
	public int getManufacturerId() {
		return manufacturerId;
	}
	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ContactModel getContactModel() {
		return contactModel;
	}
	public void setContactModel(ContactModel contactModel) {
		this.contactModel = contactModel;
	}
	@Override
	public String toString() {
		return "ManufactureModel [manufacturerId=" + manufacturerId + ", companyName=" + companyName
				+ ", registrationNumber=" + registrationNumber + ", registrationDate=" + registrationDate
				+ ", description=" + description + ", contactModel=" + contactModel + "]";
	}
	
	 
	 

	

}
