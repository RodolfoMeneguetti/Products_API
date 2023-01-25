package com.algaworks.crm.modal;

import java.math.BigDecimal;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

	private String publicPlace;

	private BigDecimal numberAddress;

	private String complement;

	private String district;

	private String zipCode;

	private String city;

	private String state;


	public String getPublicPlace() {
		return publicPlace;
	}

	public void setPublicPlace(String publicPlace) {
		this.publicPlace = publicPlace;
	}

	public BigDecimal getNumberAddress() {
		return numberAddress;
	}

	public void setNumberAddress(BigDecimal numberAddress) {
		this.numberAddress = numberAddress;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
