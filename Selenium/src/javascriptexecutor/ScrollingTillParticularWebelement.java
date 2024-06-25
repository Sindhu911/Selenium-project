package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingTillParticularWebelement {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement products = driver.findElement(By.xpath("//strong[text()='Featured products']"));
		Thread.sleep(2000);
		// Explicit type casting
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// Javascript code 
		jse.executeScript("arguments[0].scrollIntoView(true);", products);
		Thread.sleep(5000);
		driver.quit();
	}
}
