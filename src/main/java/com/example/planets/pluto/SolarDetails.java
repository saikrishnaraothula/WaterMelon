package com.example.planets.pluto;


import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SolarDetails")
@Component
public class SolarDetails {


private int id;
private String planets;
private Boolean milkywayGalaxy;
private String planetColor;

public SolarDetails() {}
	public SolarDetails(int id , String planets , Boolean milkywayGalaxy ,String planetColor) {
		this.id=id;
		this.milkywayGalaxy=milkywayGalaxy;
		this.planetColor=planetColor;
		this.planets=planets;
				
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getPlanets() {
		return planets;
	}
	public void setPlanets(String planets) {
		this.planets = planets;
	}
	public Boolean getMilkywayGalaxy() {
		return milkywayGalaxy;
	}
	public void setMilkywayGalaxy(Boolean milkywayGalaxy) {
		this.milkywayGalaxy = milkywayGalaxy;
	}
	public String getPlanetColor() {
		return planetColor;
	}
	public void setPlanetColor(String planetColor) {
		this.planetColor = planetColor;
	}
	@Override
	public String toString() {
		return "SolarDetails [id=" + id + ", planets=" + planets + ", milkywayGalaxy=" + milkywayGalaxy
				+ ", planetColor=" + planetColor + "]";
	}
	

}
