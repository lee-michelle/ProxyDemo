package com.staticproxy;

import java.util.Date;

/**
 * Service接口的实现类
 * 
 * @author Administrator
 *
 */
public class ServiceImpl implements Service {

	@Override
	public String queryDate() {
		return new Date().toString();
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	public void ownMethod() {
		System.out.println("It's my own method");
	}
}
