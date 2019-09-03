package UsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testNG2 {

	@Test
	public void testmethod2()
	{
		System.out.println("TestNG2 running");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
	}
}
