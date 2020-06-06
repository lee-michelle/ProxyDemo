package com.staticproxy;

public class Main {

	public static void main(String[] args) {
		ServiceImpl userImpl = new ServiceImpl();
		ServiceProxy proxy = new ServiceProxy(userImpl);
		System.out.println(proxy.queryDate());
		System.out.println("----------分割线----------");
		System.out.println(proxy.sub(4, 6));
		System.out.println("----------分割线----------");
		proxy.ownMethod();
	}

}
