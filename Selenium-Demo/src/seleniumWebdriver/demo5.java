package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class demo5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement link=driver.findElement(By.linkText("Car Rentals"));
		Thread.sleep(2000);
		Actions MH=new Actions(driver);
		//MH.moveToElement(link).click().build().perform();
		Action mouseover=MH.moveToElement(link).click().build();
		mouseover.perform();
		MH.sendKeys(link,(Keys.ENTER)).perform();
		
		
	}

}
