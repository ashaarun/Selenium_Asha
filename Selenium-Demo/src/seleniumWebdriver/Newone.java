package seleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://qatechhub.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String title = driver.getTitle();
		if(title.equals("QA Automation Tools Trainings and Tutorials | QA Tech Hub"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
