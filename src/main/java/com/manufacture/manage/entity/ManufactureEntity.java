package com.manufacture.manage.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "manufacture",schema = "manufacture_schema")

public class ManufactureEntity {
	@Id
	@Column(name = "manufacture_id")
	private int manufactureId;
	@Column(name = "company_name")
	private String companyName; 
	
	@Column(name = "registration_number")
	private String registrationNumber;
	
	@Column(name = "registration_date")//registration_date
	private LocalDate registrationDate;
	
	private String description;
	
	@JsonManagedReference("manufacture-contact")
	@OneToMany(mappedBy = "manufactureEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ContactEntity> contactList;
	
	
	@OneToOne
	@JoinColumn(name = "address_id")
	private AddressEntity addressEntity;
	 
	public ManufactureEntity() {
		
	}

	public ManufactureEntity(int manufactureId, String companyName, String registrationNumber,
			LocalDate registrationDate, String description, List<ContactEntity> contactList,
			AddressEntity addressEntity) {
		super();
		this.manufactureId = manufactureId;
		this.companyName = companyName;
		this.registrationNumber = registrationNumber;
		this.registrationDate = registrationDate;
		this.description = description;
		this.contactList = contactList;
		this.addressEntity = addressEntity;
	}

	public int getManufactureId() {
		return manufactureId;
	}

	public void setManufactureId(int manufactureId) {
		this.manufactureId = manufactureId;
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

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<ContactEntity> getContactList() {
		return contactList;
	}

	public void setContactList(List<ContactEntity> contactList) {
		this.contactList = contactList;
	}

	public AddressEntity getAddressEntity() {
		return addressEntity;
	}

	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}

	
	

}
