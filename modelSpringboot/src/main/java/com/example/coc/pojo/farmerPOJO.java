package com.example.coc.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Optional;


@Entity
public class farmerPOJO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int id ;
	 private  String name ;
	 private String  address;
	 private String place;
	 public farmerPOJO(){}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
/*	@Override
	public String toString() {
		return "farmer [id=" + id + ", name=" + name + ", address=" + address + ", place=" + place + "]";
	}*/
	
	
	
}
