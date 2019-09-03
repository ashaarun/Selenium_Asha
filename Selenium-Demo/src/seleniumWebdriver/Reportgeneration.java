package seleniumWebdriver;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reportgeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//log4j - for reports 
		//stdout - console output 
		//
		Logger logger= Logger.getLogger("Reportgeneration");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		logger.info("Opened my browser");
		String title=driver.getTitle();
		logger.info(title);
		

	}

}
