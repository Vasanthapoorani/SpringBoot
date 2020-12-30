package com.rest;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
@Entity
@Table(name="carinfo")
public class Car {
	
	@Id
	private int id;
	private String manufacturer;
	private String model;
	private int year;
	private String color;
	private String vin;
	private int miles;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public int getMiles() {
		return miles;
	}
	public void setMiles(int miles) {
		this.miles = miles;
	}
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", manufacturer=" + manufacturer + ", model=" + model + ", year=" + year + ", color="
				+ color + ", vin=" + vin + ", miles=" + miles + "]";
	}
	
	

}
