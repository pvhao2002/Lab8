package Bai3;

import org.testng.annotations.Test;

public class TestDatabase {

	// thuộc về nhóm db
	// chạy nếu như tất cả các phương thức trong nhóm deploy pass
	@Test(groups = "db", dependsOnGroups = "deploy")
	public void initDB() {
		System.out.println("This is initDB()");
	}

	// thuộc nhóm db
	// chạy nếu như phương thức initDB() pass.
	@Test(dependsOnMethods = { "initDB" }, groups = "db")
	public void testConnection() {
		System.out.println("This is testConnection()");
	}
}
