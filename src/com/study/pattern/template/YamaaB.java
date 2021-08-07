/**
 * 
 */
package com.study.pattern.template;

/**
 * @author
 *
 */
public class YamaaB extends BikeWorkshop {

	@Override
	public void checkPaint() {
		System.out.println("Color is green.");

	}

	@Override
	public void fitBrake() {
		System.out.println("disc system");

	}

	@Override
	public void fitTyre() {
		System.out.println("Tube type");

	}

	@Override
	public void fitEngine() {
		System.out.println("Battery engine");

	}
}
