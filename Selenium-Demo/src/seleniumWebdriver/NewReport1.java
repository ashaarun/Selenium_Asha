package seleniumWebdriver;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class NewReport1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports extent;
		ExtentTest logger;
		extent= new ExtentReports(System.getProperty("user.dir")+"/test-output/asha.html",true);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		logger=extent.startTest("Demo1");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		logger.log(LogStatus.PASS, "Google opened");
	
		String title=driver.getTitle();
		logger.log(LogStatus.PASS, title);
		driver.close();
		logger.log(LogStatus.PASS, "Window closed");
		extent.endTest(logger);
		extent.flush();
		extent.close();
		//jxl - supports - xls format , apache poi supports for xls and xlsx
		
		
	}

}
