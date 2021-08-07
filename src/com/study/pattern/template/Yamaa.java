package com.study.pattern.template;

/**
 * @author 
 *
 */
public class Yamaa extends BikeWorkshop {

	@Override
	public void checkPaint() {
		System.out.println("Color is red.");

	}

	@Override
	public void fitBrake() {
		System.out.println("Abs system");

	}

	@Override
	public void fitTyre() {
		System.out.println("Tubeless");

	}

	@Override
	public void fitEngine() {
		System.out.println("Petrol engine");

	}

}
