package com.jdkproxy;

public class MyOwner {
	private Beauty beauty;

	public MyOwner(Beauty beauty) {
		this.beauty = beauty;
	}

	public void makefriend() {
		beauty.eat();
	}

	public void show() {
		beauty.gift(10);
	}
}
