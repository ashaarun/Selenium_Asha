package seleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptexecutor {

	public JavaScriptexecutor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title=js.executeScript("return document.title").toString();
		System.out.println("title:"+title);
		String url=js.executeScript("return document.URL").toString();
		System.out.println("url:"+url);
		String domain=js.executeScript("return document.domain").toString();
		System.out.println("domain:"+domain);
		Thread.sleep(2000);
		js.executeScript("document.getElementById('txtUsername').value='Admin'");
		//driver.navigate().refresh(); same as below
		//js.executeScript("history.go(0)");
		//js.executeScript()
		WebElement web=driver.findElement(By.id("txtUsername"));
		String str=web.getText();
		
		
		
		
	}

}
