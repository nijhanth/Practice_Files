package draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropXY {

	public static void main(String[] args) {
		//launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//load URL
		driver.get("https://jqueryui.com/draggable/");

		//Maximize
		driver.manage().window().maximize();
		
		//iframe
		WebElement frm = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frm);
		
		//Drag
		WebElement drag = driver.findElement(By.id("draggable"));
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, 15, 50).perform();
	}

}
