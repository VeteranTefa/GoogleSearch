package steps;

import basePackage.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	

	@After
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
