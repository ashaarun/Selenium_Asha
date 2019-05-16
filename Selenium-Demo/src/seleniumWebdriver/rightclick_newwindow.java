package seleniumWebdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick_newwindow {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://realestate.upskills.in/wp-admin/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		WebElement link=driver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		//act.moveToElement(link).click().perform();
		act.contextClick(link).click().perform();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
	
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());
		

	}

}
