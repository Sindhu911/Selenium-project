package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledWebelement {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		
		//Save the webelement
		WebElement textBox = driver.findElement(By.xpath("//input[@class='form-control']"));
		Thread.sleep(4000);
		
		// Explicit type casting
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		// Javascript code for handling disabled webelement
		jse.executeScript("arguments[0].value='Sindhu';", textBox);
		Thread.sleep(4000);
		driver.quit();
	}
}
