package seleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class New3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String window1=driver.getWindowHandle();
		System.out.println(window1);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		String[] handles=driver.getWindowHandles().toArray(new String[2]);
		//driver.switchTo().window(handles[handles.length-1]);
	 driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		//driver.close();
	 List <WebElement> links=driver.findElements(By.tagName("a"));
	 System.out.println("Linkscount"+links.size());
	 for(int i=0;i<links.size();i++)
	 {
		 
		 System.out.println(links.get(i).getText() + "--> " +driver.getCurrentUrl());
		
		 //System.out.println(links.get(i).getAttribute("name"));
	 }
		
		
	}

}
