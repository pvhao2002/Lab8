package Bai3;

import org.testng.annotations.Test;

public class TestApp {
	// chạy nếu như tất cả các phương thức trong nhóm deploy và db đều pass
	@Test(dependsOnGroups = { "deploy", "db" })
	public void method1() {
		System.out.println("This is method 1");
		// throw new RuntimeException();
	}

	// chạy nếu như phương thức method1() pass
	@Test(dependsOnMethods = { "method1" })
	public void method2() {
		System.out.println("This is method 2");
	}
}
