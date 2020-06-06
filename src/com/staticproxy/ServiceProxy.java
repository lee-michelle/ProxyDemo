package com.staticproxy;

/**
 * 代理类
 * 
 * @author Administrator
 *
 */
public class ServiceProxy implements Service {
	private ServiceImpl serivceImpl;

	public ServiceProxy(ServiceImpl serivceImpl) {
		this.serivceImpl = serivceImpl;
	}

	@Override
	public String queryDate() {
		return serivceImpl.queryDate();
	}

	@Override
	public int sub(int a, int b) {
		return serivceImpl.sub(a, b);
	}

	public void ownMethod() {
		System.out.println("It's my own method");
	}
}