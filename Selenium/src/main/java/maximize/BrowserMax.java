package maximize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMax {

	public static void main(String[] args) {
		
		//open browser
		System.setProperty("webdriver.driver.chromedriver", "./drivesr/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		
		//load URL
		driver.get("https://letcode.in/");
		
		

	}

}
