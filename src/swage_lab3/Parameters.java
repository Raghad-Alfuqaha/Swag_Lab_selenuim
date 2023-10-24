package swage_lab3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Parameters {
	static String Url = "https://www.saucedemo.com/";
	static String StandardUserName = "standard_user";
	static String ProblemUserName = "problem_user";

	static String PerformanceUserName = "performance_glitch_user";

	static String passWord = "secret_sauce";

	static WebDriver driver = new ChromeDriver();


	static void loginFunction(String userName, String Password) {
		
		WebElement userNameInputFailed = driver.findElement(By.id("user-name"));
		userNameInputFailed.sendKeys(userName);
		WebElement passwordInputFailed = driver.findElement(By.id("password"));
		passwordInputFailed.sendKeys(Password);
		
		WebElement LoginButton = driver.findElement(By.id("login-button"));
		LoginButton.click();
		
		
	}
	
	
	
	
	
}
