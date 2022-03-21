package com.xworkz.outfitMethods;

public class Outfit {
	String brand,quantity;
	int cost;
	OutfitType type;
	public Outfit(String brand, String quantity, int cost, OutfitType type) {
		super();
		this.brand = brand;
		this.quantity = quantity;
		this.cost = cost;
		this.type = type;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashcode method of outfit");
		return cost;
	}
	@Override
	public String toString() {
		System.out.println("toString method of outfit");
		return brand;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equal method of outfit");
		if(obj==null)
			return false;
		//System.out.println("obj is not equal to null");
		
		if(obj instanceof Outfit)
		{
			 Outfit o=(Outfit)obj;
			 if(this.brand.equals(o.brand) && this.quantity.equals(o.quantity))
				// System.out.println("both are same");
				return true;
		}
		return false;
		
	}
	


}
