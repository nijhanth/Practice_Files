package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		//launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/radio");
		
		WebElement chkbox1 = driver.findElement(By.xpath("//*[@type='checkbox']"));
		boolean res1 = chkbox1.isSelected();
		System.out.println("checkbox1 is selected: "+ res1);
		chkbox1.click();
		System.out.println(chkbox1.isSelected());
		
		

	}

}
