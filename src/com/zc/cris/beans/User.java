package com.zc.cris.beans;


public class User {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void say() {
		System.out.println("my name is " + this.name);
	}
	
}
