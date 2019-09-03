package com.epam.proxy;

public class ProxyDemo {

	public static void main(String[] args) {
		Internet net = new ProxyInternet();
		net.connectTo("123.com");
		net.connectTo("abc.com");
		
		int i = (int) Math.random();
		System.out.println((int)0.7);
	}

}
