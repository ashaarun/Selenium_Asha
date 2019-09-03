package seleniumWebdriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//List<WebElement> listframes=driver.findElements(By.tagName("iframe"));
		List<WebElement> listframes=driver.findElements(By.xpath("//iframe"));
		System.out.println(listframes.size());
		
		for(int i=0;i<listframes.size()-1;i++)
		{
			System.out.println(listframes.get(i).getAttribute("name"));
		}
		driver.switchTo().frame("iframe1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 String Text = driver.findElement(By.xpath("//*[@class='wpb_wrapper']//child::h2/span")).getText();
	        System.out.println(Text);
	        driver.switchTo().defaultContent();
	        driver.switchTo().frame("iframe2");
	        
	        System.out.println("im here");
	        
	        
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        Thread.sleep(3000);
	        js.executeScript("window.scrollTo(0,800)");
	        System.out.println("after scroll");
	        //html/body/div[1]/div[2]/div/div[1]/aside[2]/ul/li[5]/a*/
	        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/aside[2]/ul/li[5]/a")).click();
	        
	      WebElement drop=driver.findElement(By.xpath("//*[@id='speed-button']"));
	      drop.click();
	      System.out.println("reached drop down");
	      Select sel=new Select(drop);
	      sel.selectByIndex(0);
	      
	        //js.executeScript("document.getElementById('ohrmList_chkSelectRecord_5').scrollIntoView().click()");
		
	}

}
