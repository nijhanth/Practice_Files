package alerttest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {
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
		
		//click confirm alert
		driver.findElement(By.id("confirm")).click();
		
				//click cancel in the popup msg
		Alert popup = driver.switchTo().alert();
		String msg = popup.getText();
		System.out.println(msg);
		popup.dismiss();
	}

}
