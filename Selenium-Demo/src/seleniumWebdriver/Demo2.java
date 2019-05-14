package seleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.cssSelector("input[name='userName']"));
		//driver.findElement(By.name("userName")).sendKeys("sunil");
		if(username.isEnabled())
		{
			username.sendKeys("sunil");
			
			username.clear();
			
			username.sendKeys("sunil");
		}
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.xpath("//*[@name='login'and @value='Login']")).click();
		
		Thread.sleep(10000);
		
		/*if(driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected())
		{
			//System.out.println("Inside if");
			driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		}
		WebElement passengers=driver.findElement(By.name("passCount"));
		//for dropdowns use select keyword
		Select sel=new Select(passengers);
		sel.selectByIndex(1);
		List<WebElement>options=sel.getOptions();
		System.out.println(options.size());
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		//System.out.println(options.);
		WebElement fromport=driver.findElement(By.name("fromPort"));
		sel=new Select(fromport);
		options=sel.getOptions();
		for(int j=0;j<options.size();j++)
		{
			System.out.println(options.get(j).getText());
		}*/
		//sel.selectByValue("London");
		driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
		driver.findElement(By.name("findFlights")).click();
		
		driver.findElement(By.xpath("//*[@name='reserveFlights']")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("Asha");
		driver.findElement(By.name("passLast0")).sendKeys("Arun");
		driver.findElement(By.name("creditnumber")).sendKeys("2344 5543 345");
		//if(driver.findElement(By.name("ticketLess")).isSelected()==false)
		//{
			driver.findElement(By.name("ticketLess")).click();
		//}
		//both checkboxes have same attributes so using findelements and for each loop 
		
		List<WebElement> checkbox=driver.findElements(By.name("ticketLess"));
		for(WebElement e:checkbox)
		{
			e.click();
		}
		
		
	}

}
