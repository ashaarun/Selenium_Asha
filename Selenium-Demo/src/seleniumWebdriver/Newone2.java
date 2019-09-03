package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Newone2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.fb.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		String URL=driver.getCurrentUrl();
		if(URL.equals("https://www.facebook.com/"))
		{
			System.out.println("Redirection success");
		}
		else
		{
			System.out.println("Failure");
		}
		WebElement create=driver.findElement(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']"));
		String verify=create.getText();
		if(verify.equals("Create an account"))
		{
			System.out.println("Found create");
		}
		else
		{
			System.out.println("Didnt find create");
		}
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Alexion");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ion");
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("no.seven.some@gmail.com");
		driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys("no.seven.some@gmail.com");
		driver.findElement(By.xpath("//input[@type='password'and @data-type='password']")).sendKeys("selenium");
		
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select sel=new Select(day);
		sel.selectByIndex(8);
		day=driver.findElement(By.xpath("//select[@id='month']"));
		sel=new Select(day);
		sel.selectByIndex(3);
		day=driver.findElement(By.xpath("//select[@id='year']"));
		sel=new Select(day);
		sel.selectByValue("1991");
		Thread.sleep(2000);
		/*if(driver.findElement(By.cssSelector("label[@class='_58mt']")).isSelected()==false)
		{
			driver.findElement(By.cssSelector("label[@class='_58mt']")).click();
		}*/
		if(driver.findElement(By.xpath("//input[@type='radio' and @name='sex' and @value='2']")).isSelected()==false)
		{
			driver.findElement(By.xpath("//input[@type='radio' and @name='sex' and @value='2']")).click();
		}
		driver.findElement(By.xpath("//*[@type='submit'and @name='websubmit']")).click();
		Thread.sleep(3000);
		/*driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sel");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("selenium");
		driver.findElement(By.id("loginbutton")).click();*/
	}

}
