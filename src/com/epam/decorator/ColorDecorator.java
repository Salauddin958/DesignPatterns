package com.epam.decorator;

public class ColorDecorator extends RoomDecorator{

	public ColorDecorator(Room specialRoom) {
		super(specialRoom);
	}
	
	public String showRoom() {
		return specialRoom.showRoom()+addColor();
	}
	
	private String addColor() {
		return " Colors added ";
	}

}
