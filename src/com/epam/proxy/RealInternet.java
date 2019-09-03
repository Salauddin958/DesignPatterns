package com.epam.proxy;

public class RealInternet implements Internet{

	@Override
	public void connectTo(String address) {
		System.out.println("Connecting To : "+address);
	}

}
