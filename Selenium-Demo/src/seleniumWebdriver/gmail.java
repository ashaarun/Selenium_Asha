package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("2389asha");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='whsOnd zHQkBf' and @type='password']")).sendKeys("asha2389");
		driver.findElement(By.xpath("//*[@class='RveJvd snByac']")).click();
		Thread.sleep(10000);
		//driver.findElement(By.name("Ola Share")).;
		
		
		WebElement web=driver.findElement(By.name("Ola Share"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",web);
		Actions action=new Actions(driver);
		action.moveToElement(web);
		action.click();
		action.perform();
		
		/*if(web.isSelected()==false)
		{
			web.click();
		}*/
		
	}

}
