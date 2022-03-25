package com.xworkz.encapsulation.dto;

public class PersonDTO {
//	public class PersonDTO {
//
//
//        private String name;
//        private double weight;
//        private double height;
//        private boolean disabled;
//        private boolean dead;
//
//}
//1. 4 Rules of DTO 
//2. Runner create two instances and init property using setter and get values using getter 


	private String name;
	private double weight,height;
	private boolean disabled,dead;

    public PersonDTO(String name, double weight, double height, boolean disabled, boolean dead) {
	super();
	this.name = name;
	this.weight = weight;
	this.height = height;
	this.disabled = disabled;
	this.dead = dead;
}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isDisabled() {
		return disabled;
	}
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	public boolean isDead() {
		return dead;
	}
	public void setDead(boolean dead) {
		this.dead = dead;
	}
	
	
	

}
