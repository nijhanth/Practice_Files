package testngBasic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


public class ButtonPage {
	
	static final int sleepduration = 1000;
	
	@Test
	public void buttonScreenshot() throws InterruptedException, IOException {
		//launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//load URL
		driver.get("https://letcode.in/");
		
		//click Work-space button
		driver.findElement(By.id("testing")).click();
		Thread.sleep(sleepduration);
		
		//click click button
		driver.findElement(By.xpath("//a[@href='/buttons']")).click();
		
		//screenshot
		File scr = driver.findElement(By.xpath("//app-learning-point")).getScreenshotAs(OutputType.FILE);
		File des = new File("./Image/file1.png");
		FileHandler.copy(scr, des);
		
		driver.quit();
		
		
	}
}
