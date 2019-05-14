package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//table[@role='presentation']/tbody/tr[1]/td[1]"));
		//System.out.println(driver.findElement(((WebElement) By.xpath("//*[@name='email']//parent::td//parent::tr//preceding-sibling::tr//td/label")).getText()));
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Password')]//ancestor::tr//following-sibling::tr//child::td[2]//input[@id='pass']")).getAttribute("name"));
	}
	}