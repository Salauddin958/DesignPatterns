package com.epam.factory;

public class Shop extends Website{

	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new SearchPage());
		pages.add(new ItemPage());
	}

}
