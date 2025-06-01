package alerttest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomwWork {

	public static void main(String[] args) {
		//launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//load URL
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		//click try it button
		WebElement frm = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frm);
		
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		
		//find alert
		Alert popup = driver.switchTo().alert();
		String msg = popup.getText();
		System.out.println(msg);
		popup.sendKeys("Nijhanth");
		popup.accept();
		
		//output
		WebElement res = driver.findElement(By.id("demo"));
		String output = res.getText();
		System.out.println(output);
		
	}

}
