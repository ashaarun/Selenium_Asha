package seleniumWebdriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("linda.anderson");
		WebElement web=driver.findElement(By.xpath("//*[@id='txtUsername']"));
		System.out.println(web.getText());
		String web1=driver.findElement(By.xpath("//*[@id='txtUsername']")).getAttribute("value");
		driver.findElement(By.id("txtPassword")).sendKeys("linda.anderson");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(4000);
		//driver.findElement(By.linkText("Performance")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Performance')]")).click();
		//driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click(); --> here b is the tagname 
		Thread.sleep(4000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement e:links)
		{
			String str=e.getText();
			System.out.println(str);
			
		}
		
		
		
		
	}

}
