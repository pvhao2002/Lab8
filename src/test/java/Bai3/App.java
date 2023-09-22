package Bai3;

import org.testng.annotations.Test;

public class App {
	// nếu method1() pass thì method2() sẽ được thực thi
	@Test
	public void method1() {
		System.out.println("This is method 1");
	}

	@Test(dependsOnMethods = { "method1" })
	public void method2() {
		System.out.println("This is method 2");
	}
	
	// nếu method3() sai thì method4() sẽ được bỏ qua không thực thi
	@Test
	public void method3() {
		System.out.println("This is method 3");
		throw new RuntimeException();
	}

	@Test(dependsOnMethods = { "method3" })
	public void method4() {
		System.out.println("This is method 4");
	}
}
