package findElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsFinding {

	public static void main(String[] args) {

		//launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://letcode.in/radio");
		
		List<WebElement> names = driver.findElements(By.tagName("label"));
		
		for (WebElement ele : names) {
			
			String elename = ele.getText();
			
			System.out.println(elename);			
			
		}
		
		System.out.println("=========================");
		
		int size = names.size();
		System.out.println(size);
		
		System.out.println("=========================");
		
				
		driver.quit();
	}

}
