package com.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {
		MyLikeGirl girl = new MyLikeGirl();
		Beauty beauty = (Beauty) Proxy.newProxyInstance(girl.getClass().getClassLoader(),
				girl.getClass().getInterfaces(), new InvocationHandler() {
					@Override
					public Object invoke(Object var1, Method method, Object[] var3) throws Throwable {
						// System.out.println("请吃饭之前的操作");
						// Object invoke = method.invoke(girl);
						// System.out.println("请吃饭之后的操作");
						Object invoke = null;
						if ("eat".equals(method.getName())) {
							System.out.println("请吃饭之前的操作");
							invoke = method.invoke(girl);
							System.out.println("请吃饭之后的操作");
						}
						if ("gift".equals(method.getName())) {
							invoke = method.invoke(girl, new Object[] { (Integer) var3[0] / 2 });
						}
						return invoke;
					}
				});
		MyOwner owner = new MyOwner(beauty);
		owner.makefriend();
		owner.show();
	}

}
