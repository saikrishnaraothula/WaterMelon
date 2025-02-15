package com.example.planets.pluto;

public class PlutoDto {

	private String planets;
	private Boolean milkywayGalaxy;
	private String planetColor;
	
	public PlutoDto( String planets,
	 Boolean milkywayGalaxy,
	 String planetColor) {
		this.planetColor=planetColor;
		this.planets=planets;
		this.milkywayGalaxy=milkywayGalaxy;
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
	

}
