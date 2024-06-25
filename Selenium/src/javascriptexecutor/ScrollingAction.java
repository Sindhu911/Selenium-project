package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingAction {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		// Explicit type casting
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// Javascript code for scrolling action - from top to bottom
		jse.executeScript("window.scrollBy(0, 1000);");
		Thread.sleep(3000);
		// Javascript code for scrolling action - from bottom to top
		jse.executeScript("window.scrollBy(0, -1000);");
		driver.quit();
	}
}
