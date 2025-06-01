package webTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Marking {

	public static void main(String[] args) {
		//launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/table");
		
		/*
		//click Work-space button
		driver.findElement(By.id("testing")).click();
		
		//wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//click simple table
		driver.findElement(By.linkText("Simple table")).click();*/
		
		//find table
		WebElement table =driver.findElement(By.id("simpletable"));
		
		//header find
		List<WebElement> header = table.findElements(By.tagName("th"));
		
		for (WebElement names : header) {
			
			System.out.println(names.getText());
			
		}
		
		System.out.println("Header rows: "+header.size());
		
		List<WebElement> allrows = table.findElements(By.cssSelector("tbody tr"));
		
		for (WebElement row : allrows) {
			
		List<WebElement> column =row.findElements(By.id("td"));
		WebElement first = column.get(0);
		System.out.println(first.getText());
			
		}
		//System.out.println("User name count: "+cnames.size());
	
	}
		
		
	

}
