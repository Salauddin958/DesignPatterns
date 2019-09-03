package com.epam.builder;

public class LunchOrderBeanDemo {

	public static void main(String[] args) {
		
		LunchOrderBean.Builder builder = new LunchOrderBean.Builder();
		builder.bread("brown").condiments("lettuce").dressing("maya").meat("turkey");
		LunchOrderBean order = builder.build();
		System.out.println(order.getBread());
		System.out.println(order.getCondiments());
		System.out.println(order.getDressing());
		System.out.println(order.getMeat());
	}

}
