package com.epam.proxy;

import java.util.*;

public class ProxyInternet implements Internet{
	
	private Internet internet = new RealInternet();
	private static List<String> bannedSites;
	
	static {
		bannedSites = new ArrayList<>();
		bannedSites.add("abc.com");
		bannedSites.add("abc1.com");
		bannedSites.add("abc2.com");
	}

	@Override
	public void connectTo(String address) {
		if(bannedSites.contains(address)) {
			System.out.println("Site banned");
			return;
		}
		internet.connectTo(address);
	}

}
