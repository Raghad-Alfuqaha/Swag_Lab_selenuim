package swage_lab3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class My_Test extends Parameters {

	@BeforeMethod
	public void mySetup() {
		driver.get(Url);
		
	}

	@Test()
	public void LoginWithStanderdUser() throws InterruptedException{
		loginFunction(StandardUserName,passWord);
		Thread.sleep(3000);
	}
	
	@Test()
	public void LoginWithProblemUser() throws InterruptedException{
		loginFunction(ProblemUserName,passWord);
		Thread.sleep(3000);
	}
	
	@Test()
	public void LoginWithPreformanceUser() throws InterruptedException{
		loginFunction(PerformanceUserName,passWord);
		Thread.sleep(3000);
	}

	@AfterMethod
	public void myPostTesting() {
	}

}
