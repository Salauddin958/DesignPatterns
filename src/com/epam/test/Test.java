package com.epam.test;
import static java.lang.System.out;

import java.util.Arrays;
import java.util.Optional;

public class Test implements A,B{
	
	Runnable z = () -> out.println(this);

	public static void main(String[] args) {
		//new Test().z.run();
		Test t = new Test();
//		System.out.println(((A)t).val);
		//IntSummaryStatistics stats = Arrays.asList(1,2,3,4).stream().reduce((a,b) -> a+b));
		Optional<Integer> optional = Arrays.asList(1,2,3,4).stream().reduce((a,b) -> a+b);
		System.out.println(optional.get());
		
	}
	public String toString() {
		return "Hello World";
	}
	/*@Override
	public void a() {
		new Test().a();
	}*/
	
	
}

interface A {
	int val = 10;
	/*default void a() {
		System.out.println("hello from a");
	}*/
}

interface B {
	int val = 101;
	/*default void a() {
		System.out.println("hello from b");
	}*/
}