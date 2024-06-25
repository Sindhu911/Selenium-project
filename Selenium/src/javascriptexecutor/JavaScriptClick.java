package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptClick {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement loginLink = driver.findElement(By.className("ico-login"));
		Thread.sleep(4000);
		// Explicit type casting
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// Javascript code for click action
		jse.executeScript("arguments[0].click();", loginLink);
		Thread.sleep(4000);
		driver.quit();
	}
}
