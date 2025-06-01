package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ValueText {

	public static void main(String[] args) {
		//launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//maximize
		driver.manage().window().maximize();

		//load URL
		driver.get("https://letcode.in/");

		//wait time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//click Work-space button
		driver.findElement(By.id("testing")).click();

		//click drop down button
		driver.findElement(By.linkText("Drop-Down")).click();

		//click drop down select country
		WebElement country = driver.findElement(By.id("country"));
				
		//select india
		Select coun = new Select(country);
		coun.selectByValue("India");
		
		//result
		WebElement res = coun.getFirstSelectedOption();
		System.out.println(res.getText());
		

	}

}
