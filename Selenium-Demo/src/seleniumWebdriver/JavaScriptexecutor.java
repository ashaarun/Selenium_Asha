package seleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

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
		//System.out.println("domain:"+domain);
		Thread.sleep(2000);
		js.executeScript("document.getElementById('txtUsername').value='Admin'");
		//driver.navigate().refresh(); same as below
		//js.executeScript("history.go(0)");
		//js.executeScript()
		//WebElement web=driver.findElement(By.id("txtUsername"));
		//String str=web.getText();
		//query selector is used for CSS 
		js.executeScript("document.querySelector('input#txtPassword').value='admin123'");
		js.executeScript("document.getElementById('btnLogin').click()");
		//only with css selector or id no other things 
		Thread.sleep(4000);
		driver.findElement(By.linkText("PIM")).click();

		/*js.executeScript("document.getElementById('menu_leave_viewLeaveModule').click()");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('menu_leave_viewLeaveList').click()");
		Thread.sleep(2000);*/
		js.executeScript("document.getElementById('menu_pim_viewPimModule').click()");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('menu_pim_viewEmployeeList').click()");
		Thread.sleep(3000);
		Actions act= new Actions(driver);
		//scroll will not happen till the end 
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		//window.scrollby(0,800) with coordinates
		//scroll height will go till end of the script 
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('ohrmList_chkSelectRecord_5').scrollIntoView().click()");
		
		
	}

}
