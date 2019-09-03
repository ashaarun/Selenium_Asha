package seleniumWebdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='content']/p[3]/button")).click();
		Thread.sleep(6000);
		Alert alert= driver.switchTo().alert();
		
		String text= alert.getText();
		System.out.println(text);
		alert.accept();
		Thread.sleep(4000);
		WebElement ele=driver.findElement(By.xpath("//div[@id='content']/p[8]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", ele);
		Thread.sleep(4000);
		Alert confirmalert=driver.switchTo().alert();
		String text1=confirmalert.getText();
		System.out.println(text1);
		Thread.sleep(3000);
		confirmalert.dismiss();
		
		WebElement ele1=driver.findElement(By.xpath("//h3[contains(text(),'Prompt Alert box')]//following-sibling::p/button"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", ele1);
		Thread.sleep(4000);
		Alert prompt=driver.switchTo().alert();
		String text2=prompt.getText();
		System.out.println(text2);
		Thread.sleep(4000);
		prompt.sendKeys("Finally");
		Thread.sleep(4000);
		prompt.accept();
		
		
		
		
}
}