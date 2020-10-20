package com.java.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hello {

	public static void main(String[] args) {
		List<String> greetings = new ArrayList<String>();
		greetings.add("Hello World");
		greetings.add("Welcome");
		
		Random ran = new Random();
		int random = ran.nextInt() % 2;
		random = Math.abs(random);
		System.out.println(greetings.get(random));

//		System.out.println(greetings.get(random));
		
		
	}
}
