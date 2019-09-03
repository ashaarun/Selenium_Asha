package UsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testNG1 {
	
	@Test
	public void method1()
	{
		System.out.println("TestNG running");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
	}

}
