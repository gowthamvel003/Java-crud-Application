package com.example.demo.pojo;

import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;  
@Entity  
public class labourPOJO { 
	@Id
  @GeneratedValue(strategy = GenerationType.AUTO) 
    private int id;  
    private String name;  
    private String adress;  
    private int  number;
    private String place;
    public labourPOJO(){}  
    public int getId() {  
        return id;  
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public void setId(int id) {
		this.id = id;
	}
	
    }