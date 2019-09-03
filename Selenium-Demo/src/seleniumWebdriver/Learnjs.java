package seleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Learnjs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		//document.evaluate syntax -- used for evaluating xpaths 
		//document.evaluate( xpathExpression, contextNode, namespaceResolver, resultType, result );
		WebElement value = (WebElement)driver.executeScript("return document.evaluate( '//body//div/iframe' ,document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null ).singleNodeValue;");
		
		//*[@id='primary-menu']/li/a/span/span[@class='menu-text'and contains(text(),'HOME')]
		
		driver.
	}
	

}
