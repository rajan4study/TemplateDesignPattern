/**
 * 
 */
package com.study.pattern.template;

/**
 * @author 
 *
 */
public class BikeShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Yamaa bike1=new Yamaa();
		bike1.asseblePart();
		System.out.println("Bike1 ready for delivery");
		YamaaB bike2=new YamaaB();
		bike2.asseblePart();
		System.out.println("Bike2 ready for delivery");

	}

}
