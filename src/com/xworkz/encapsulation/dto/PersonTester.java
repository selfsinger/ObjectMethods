package com.xworkz.encapsulation.dto;

public class PersonTester {

	public static void main(String[] args) {

		PersonDTO person = new PersonDTO("Megha", 48, 5.4, false, false);
		PersonDTO person1 = new PersonDTO("Pinku", 52, 4.5, false, false);
		System.out.println(person.getName() + " \n" + person.getWeight() + " \n" + person.getHeight() + " \n"
				+ person.isDisabled() + " \n" + person.isDead());
		System.out.println();
		person.setName("Manju");  person.setHeight(6.5);
		System.out.println(person.getName() + " \n" + person.getHeight());
		System.out.println();
		System.out.println(person1.getName() + " " + person1.getWeight() + " \n" + person1.getHeight() + " \n"
				+ person1.isDisabled() + " \n" + person1.isDead());
		System.out.println();
		person1.setName("Purna"); person1.setWeight(70);
		System.out.println(person1.getName() + " \n" + person1.getWeight());

	}

}
