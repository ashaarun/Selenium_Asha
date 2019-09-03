package seleniumWebdriver;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentReports {

public static void main(String[] args) {
ExtentReports extent;//where my report should be
ExtentTest logger;//to log my test
extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/ancy.html",true);//user.dir ==>same directory ,create a folder namked ancy.html
extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
//create a folder structure and load xml
logger = extent.startTest("Demo1");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\AncyIssac\\Desktop\\java_elcipse\\selenium\\chrome\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.google.com");
logger.log(LogStatus.PASS, "Application opened");
String title = driver.getTitle();
logger.log(LogStatus.PASS, title);
driver.close();
logger.log(LogStatus.PASS, "Browser closed successfully");
extent.endTest(logger);
extent.flush();//flush all reports
extent.close();
//for each test case u can have logger-pass/fail
}

}
