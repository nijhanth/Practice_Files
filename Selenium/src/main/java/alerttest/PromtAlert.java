package alerttest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlert {
	static final int sleepduration = 1000;
	public static void main(String[] args) throws InterruptedException {
		        //launch browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//load URL
				driver.get("https://letcode.in/");
				
				//click Work-space button
				driver.findElement(By.id("testing")).click();
				Thread.sleep(sleepduration);
				
				//click dialog button
				driver.findElement(By.xpath("//a[@href=\"/alert\"]")).click();
				Thread.sleep(sleepduration);

				//click prompt buttom
				driver.findElement(By.id("prompt")).click();
				
				//Check the Alert
				String msg = driver.switchTo().alert().getText();
				System.out.println(msg);
		
				//enter the value
				Alert popup = driver.switchTo().alert();
				popup.sendKeys("Nijhanth");
				popup.accept();
				/*
				//check the name is accept or not
				WebElement name= driver.findElement(By.id("myName"));
				String tst = name.getText();
				System.out.println(tst);*/
				
				//check the name is accept or not
				String name = driver.findElement(By.id("myName")).getText();
				System.out.println(name);
				
				
	}

}
