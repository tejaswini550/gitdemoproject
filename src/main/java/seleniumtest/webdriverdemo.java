package seleniumtest;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class webdriverdemo {
	// TODO Auto-generated method stub
			
			WebDriver driver=new ChromeDriver();
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://calculator.net");
		driver.manage().window().maximize();
		WebElement mLoan=driver.findElement(By.xpath("//a[text()='Mortgage Calculator']"));
     mLoan.click();
     
		WebElement mDropdown=driver.findElement(By.xpath("//*[text()='Start Date']/following::select[1]"));
		Select strObj=new Select(mDropdown);
		List<WebElement> strOption=strObj.getOptions();
		System.out.print(strOption.get(0).getText());
List<WebElement> eleLinks=driver.findElements(By.tagName("a"));
System.out.print(eleLinks.size());
		
		WebElement errMessage=driver.findElement(By.xpath("//*[text()='Please provide a positive home price value.']"));
		boolean flag=errMessage.isDisplayed();
		if(flag) {
			System.out.println("Error is displayed");
		}else {
			System.out.println("Error is not displayed");
		}

		
		

	}
	public WebElement findWebElementByXPath(String  a) {
		log.info("Error Level Message");
		WebElement mLoan=driver.findElement(By.xpath(a));
		
		return mLoan;
		log.error("Error Level Message");
	}

}
