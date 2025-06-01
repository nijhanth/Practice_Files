package implicittime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Time {

	public static void main(String[] args) {

		//launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//load URL
		driver.get("https://letcode.in/");

		//click Work-space button
		driver.findElement(By.id("testing")).click();

		//Implicit time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//click click button
		driver.findElement(By.xpath("//a[@href='/buttons']")).click();

	}

}
