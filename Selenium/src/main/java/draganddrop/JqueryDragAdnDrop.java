package draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryDragAdnDrop {

	public static void main(String[] args) {
		
				//launch browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				//load URL
				driver.get("https://jqueryui.com/droppable/");
		
				//Maximize
				driver.manage().window().maximize();
				
				//iframe
				WebElement frm = driver.findElement(By.xpath("//iframe"));
				driver.switchTo().frame(frm);
				
				//drag element
				WebElement drag = driver.findElement(By.id("draggable"));
				
				//drop element
				WebElement drop = driver.findElement(By.id("droppable"));
				
				//drag and drop action
				Actions builder = new Actions(driver);
				builder.dragAndDrop(drag, drop).perform();
				
				//result
				WebElement msg = driver.findElement(By.id("droppable"));
				String res = msg.getText();
				
				System.out.println(res);
				
	}

}
