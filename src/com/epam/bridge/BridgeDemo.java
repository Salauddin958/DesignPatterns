package com.epam.bridge;

public class BridgeDemo {

	public static void main(String[] args) {
		Color color = new Blue();
		Shape square = new Square(color);
		square.applyColor();
	}

}
