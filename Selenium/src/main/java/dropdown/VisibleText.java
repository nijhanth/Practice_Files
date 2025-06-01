package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VisibleText {

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

		//click drop down select fruit
		WebElement fruit = driver.findElement(By.id("fruits"));
		fruit.click();

		//select Orange
		Select orgfruit = new Select(fruit);
		orgfruit.selectByContainsVisibleText("Orange");

		//result
		WebElement res = driver.findElement(By.className("subtitle"));
		System.out.println(res.getText());


	}

}
