package com.epam.decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		Room room = new CurtainDecorator(new ColorDecorator(new NormalRoom()));
		System.out.println(room.showRoom());
	}

}
