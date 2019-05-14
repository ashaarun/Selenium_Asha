package seleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//file:///C:/TP_bkup_remaining/New_TP/Selenium%20Training/Webpage.html
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/TP_bkup_remaining/New_TP/Selenium%20Training/Webpage.html");
		WebElement web=driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]/following-sibling::td[1]"));
		System.out.println(web.getText());
			
	}

}
