package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//FirefoxDriver driver1 = new FirefoxDriver();
		
		driver.get("http://retail.upskills.in/admin");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		
		//by css
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click;
		//by xpath
		//driver.findElement(By.xpath("//*[@class='btn btn-primary' and type='submit']")).click();
		WebElement link=driver.findElement(By.id("menu-catalog"));
		Actions act=new Actions(driver);
		act.moveToElement(link).build().perform();
		act.click();
	

	}

}
