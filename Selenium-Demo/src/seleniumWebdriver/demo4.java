package seleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AshaArun\\Documents\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		String notworking="Under Construction: Mercury Tours";
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int linkscount=links.size();
		String[] linktexts=new String[linkscount];
		int i=0;
		System.out.println("Number of links in page is :"+linkscount);
		for(WebElement ele:links)
		{
			linktexts[i]=ele.getText();
			i++;
		}
		
		for(String each:linktexts)
		{
			 driver.findElement(By.linkText(each)).click();
			 //WebElement temp=driver.findElement(By.xpath("//img[contains(@src,'/images/masts/mast_construction.gif')]"));
			 //WebElement temp=driver.findElement(By.xpath("//*[contains(text(),'Sorry for any inconvienece')]"));
			if(driver.getTitle().equals(notworking))
			{
				//System.out.println(driver.getTitle());
				System.out.println(driver.getTitle()+each+"NOT WORKING");
			}
			else
			{
				//System.out.println();
				System.out.println(driver.getTitle()+each+" WORKING");
			}
			driver.navigate().back();
		}
		/*for(int i=0;i<linkscount;i++)
		{
			links.get(i).click();
			if(links.get(i).getAttribute("href").contains("mercurywelcome.php"))
			{
				String eachlink=links.get(i).getAttribute("href");
				System.out.println( eachlink + " UNDER CONSTRUCTION");
			}
			else
			{
				String eachlink1=links.get(i).getAttribute("href");
				System.out.println( eachlink1 +" WORKING");
			}*/
		
		
	//}
	}
	
}
