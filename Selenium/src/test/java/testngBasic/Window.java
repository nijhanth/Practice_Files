package testngBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class Window {

	@Test
	public void windowHandling() {
		//launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/windows");

		driver.findElement(By.xpath("//button[.='Open Home Page']")).click();

		@SuppressWarnings("rawtypes")
		Set page = driver.getWindowHandles();

		//set interface cannot execute with .get. so we should convert set as List

		List<String> windows = new ArrayList<String>(page);

		//go to the child page
		driver.switchTo().window(windows.get(1));
				

		System.out.println(driver.getCurrentUrl());

		//go to the main page
		driver.switchTo().window(windows.get(0));

		//close the main page
		driver.close();

		//target window already closed so need to create another one
		@SuppressWarnings("rawtypes")
		Set page2 = driver.getWindowHandles();
		windows.clear();
		windows.addAll(page2);

		//Again go to the main page
		driver.switchTo().window(windows.get(0));

		System.out.println(driver.getCurrentUrl());
		
		driver.get("https://letcode.in/windows");
		
		driver.findElement(By.id("multi")).click();
		
		@SuppressWarnings("rawtypes")
		Set multi = driver.getWindowHandles();
		
				
		List<String> windows2 = new ArrayList<String>(multi);
		
		driver.switchTo().window(windows2.get(1));
		
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(windows2.get(2));
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		driver.switchTo().window(windows2.get(1));
		
		driver.close();
		
		driver.quit();


	}

}
