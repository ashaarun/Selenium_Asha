package seleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Keys {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	//String baseUrl = “”;
	//WebDriver driver = new FirefoxDriver();
	 
	driver.get("https://www.facebook.com");
	WebElement txtUserName = driver.findElement(By.xpath("//*[@name='email']"));
	//driver. 
	Actions builder = new Actions(driver);
	Action seriesOfActions = builder
	 .moveToElement(txtUserName)
	 .click().keyDown(txtUserName,Keys.SHIFT)
	 .sendKeys(txtUserName, “hello”)
	 .keyUp(txtUserName, Keys.SHIFT)
	 .doubleClick(txtUserName);
	 .contextClick();
	 .build();
	seriesOfActions.perform();
	}
}
