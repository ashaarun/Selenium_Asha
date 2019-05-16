package seleniumWebdriver;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolsQA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//This is to identify parent window - only one window to store 
		String parentwin=driver.getWindowHandle();
		System.out.println("My parent name"+parentwin);
		WebElement link=driver.findElement(By.id("button1"));
		//to click and open the browser 3times 
		for (int i=0;i<3;i++)
		{
			link.click();
			Thread.sleep(3000);
			System.out.println("window"+i);
		
		}
		//getwindowhandles -- parent window + child windows
		//getwindowhandle -- one browser which is focussed or current 
		//To work with only child window use list 
	/*List<String> allwindows = new ArrayList <String> (driver.getWindowHandles());
	
	for (int i=1;i<allwindows.size();i++)
	{
		driver.switchTo().window(allwindows.get(i));
		driver.get("http://www.google.com");
		lastwindow=allwindows.get(i).toString();
	}*/
		Set<String> allwindows = driver.getWindowHandles();
		String lastwindow="";
		//set will not go with normal for loop hence foreach 
		for(String handle: allwindows)
		{
			driver.switchTo().window(handle);
			driver.get("http://www.google.com");
			lastwindow=handle;
		}
		//Print all window ids
		System.out.println("Parent+Children"+allwindows);
		
		driver.switchTo().window(parentwin);
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.close();
		
		driver.switchTo().window(lastwindow);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.close();
			
	}

}
