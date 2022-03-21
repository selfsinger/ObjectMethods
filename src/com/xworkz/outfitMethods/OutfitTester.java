package com.xworkz.outfitMethods;

public class OutfitTester {

//	Product : brand,cost,quantity,type:enum
//	Overrise hashcode, toString and equals
//	in equals conpare all properties 
//
//	create two intances ans check the equality 
	public static void main(String[] args) {
	
	Outfit outfit=new Outfit("Biba","Two",4000,OutfitType.TRADITIONAL_OUTFIT);
	Outfit outfit1=new Outfit("Biba","Two",4000,OutfitType.MODERN_OUTFIT);
	System.out.println(outfit.hashCode()+" \n"+outfit.toString());
	System.out.println(outfit1.hashCode()+" \n"+outfit1.toString());
	
	System.out.println();
	//System.out.println(outfit.equals(outfit1));
	if(outfit.equals(outfit1))
		System.out.println("contents of outfit and outfit1 are same");
	else
		System.out.println("contents of oufit and oufit1 are not same");
	
	
	}
}
