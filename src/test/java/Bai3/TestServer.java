package Bai3;

import org.testng.annotations.Test;

// tất cả các phương thức trong class này đều thuộc về nhóm deploy
@Test(groups="deploy")
public class TestServer {
	@Test
	public void deployServer() {
		System.out.println("Deploying Server...");
	}

	// chạy phương thức deployBackUpServer() nếu phương thức deployServer() pass.
	@Test(dependsOnMethods="deployServer")
	public void deployBackUpServer() {
		System.out.println("Deploying Backup Server...");
	}
}
