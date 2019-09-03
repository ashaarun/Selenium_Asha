package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class demo6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Actions act=new Actions(driver);
		//button.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER);
		act.sendKeys(Keys.RETURN);

		//act.sendKeys(Keys.TAB);

		act.sendKeys("ENTER");

		act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
		
	}

}
