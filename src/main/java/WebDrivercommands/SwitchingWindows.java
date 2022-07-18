package WebDrivercommands;


import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {

	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.ebay.com");
driver.manage().window().maximize();

	}

}
