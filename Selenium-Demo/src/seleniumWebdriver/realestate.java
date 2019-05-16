package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class realestate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://realestate.upskills.in/wp-admin/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

		
		driver.findElement(By.xpath("//*[@class='wp-menu-name' and contains(text(),'Posts')]")).click();
		driver.findElement(By.xpath("//*[contains(a,'All Posts')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@class='row-title' and @aria-label='“apollo” (Edit)']//ancestor::td//preceding-sibling::th//input[@id='cb-select-3371' and type='checkbox']")).click();
		
		driver.findElement(By.xpath("//a[@class='row-title' and @aria-label='“apollo” (Edit)']//ancestor::td//preceding-sibling::th//input[@id='cb-select-3371']")).click();
		//driver.findElement(By.)

	}

}
