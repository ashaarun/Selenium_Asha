package seleniumWebdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://retail.upskills.in/admin/");
		driver.findElement(By.id("input-username")).sendKeys("admin");
		driver.findElement(By.id("input-password")).sendKeys("admin@123");
		driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		
		Thread.sleep(3000);
		
		System.out.println("Before catalog");
		
		//driver.findElement(By.xpath("//*[@class='fa fa-tags fw']")).click();
		
		//WebElement catelog=driver.findElement(By.xpath("//*[@class='fa fa-tags fw']"));
		
		Actions MH=new Actions(driver);
		//MH.moveToElement(catelog).click();
		//WebElement category=driver.findElement(By.linkText("Categories"));
		//System.out.println(category);
		Thread.sleep(2000);
		MH.moveToElement(driver.findElement(By.id("menu-catalog"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Categories")).click();
		
		driver.findElement(By.xpath("//*[@class='text-center']//input[@type='checkbox'and @name='selected[]' and @value='477']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
		Thread.sleep(2000);
		Alert alert= driver.switchTo().alert();
		alert.dismiss();
		//driver.findElement(By.xpath("//*[@class='active open']/a[@href='http://retail.upskills.in/admin/index.php?route=catalog/category&token=vwYa1DLtgXmPi40Ayod5YG88GpuKgN6w']"))).click().build().perform();
		//MH.moveToElement(category).click().build().perform();
		
		//System.out.println("Before catagory");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.linkText("Categories")).click();
		
		System.out.println("After catagory");
}
	
	
}