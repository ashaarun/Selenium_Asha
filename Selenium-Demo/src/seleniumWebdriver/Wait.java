package seleniumWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//implicit wait will apply for all below lines of code 
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		//explicit wait is with a condition - for a specific element 
		WebDriverWait mywait= new WebDriverWait(driver,100);
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
		mywait.until(ExpectedConditions.
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		
		
	}

}
