package com.study.pattern.template;

/**
 * @author
 *
 */
public abstract class BikeWorkshop {
	public void asseblePart() {
		fitEngine();
		checkOil();
		fitTyre();
		checkAir();
		fitBrake();
		checkBrakeOil();
		fitAccesories();
		checkPaint();
	}

	public abstract void checkPaint();

	public abstract void fitBrake();

	public abstract void fitTyre();

	public abstract void fitEngine();

	public void fitAccesories() {
		System.out.println("fit accesories done.");

	}

	private void checkBrakeOil() {
		System.out.println("break oil filled.");

	}

	private void checkAir() {
		System.out.println("Air filled.");

	}

	private void checkOil() {
		System.out.println("Oil filled in engine.");

	}

}
