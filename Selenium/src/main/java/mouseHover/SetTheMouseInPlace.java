package mouseHover;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetTheMouseInPlace {

	public static void main(String[] args) throws Exception {
		//launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers2/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		//load URL
		driver.get("https://www.flipkart.com/");

		//Maximize
		driver.manage().window().maximize();
		
		//mouse hover in electronic
		
		WebElement elec = driver.findElement(By.linkText("Electronics"));
		Actions build = new Actions(driver);
		elec.click();
		
		//build.moveToElement(elec).perform();
		
		WebElement elec2 = driver.findElement(By.xpath("//span[.='Electronics']"));
		
		build.moveToElement(elec2).perform();
		
		WebElement samsung = driver.findElement(By.linkText("Samsung"));
				
		wait.until(ExpectedConditions.visibilityOf(samsung));
		
		samsung.click();
		
		/*
		build.moveToElement(gaming);
		
		WebElement games = driver.findElement(By.linkText("Games"));
		wait.until(ExpectedConditions.visibilityOf(games));
		
		games.click();*/
		
		
		
		
	}

}
