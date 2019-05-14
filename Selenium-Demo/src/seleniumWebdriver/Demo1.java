package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	
	public static void main (String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		WebElement web=driver.findElement(By.xpath("//*[@id='txtUsername']"));
		System.out.println(web.getText());
		
		//gettext is for dropdowns and getAttributes for elements 
		String web1=driver.findElement(By.xpath("//*[@id='txtUsername']")).getAttribute("value");
		String web2=driver.findElement(By.xpath("//*[@id='txtUsername']")).getAttribute("id");
		System.out.println(web1);
		System.out.println(web2);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input.button")).click();
		String ExpectedTitle="OrangeHRM";
		String ActualTitle=driver.getTitle();
		if(ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("Title are same");
			
			driver.findElement(By.xpath("//*[@id='welcome']")).click();
			Thread.sleep(1000);
			//driver.findElement(By.linkText("Logout"));
			driver.findElement(By.xpath("//*[@id='welcome-menu'/ul/li[2]/a")).click();
			Thread.sleep(1000);
			driver.close();
		}
		
	}
	

}
