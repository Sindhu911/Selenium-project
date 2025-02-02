package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {
	public static void main(String[] args) {

		// partialLinkText() method

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log i")).click();
		// driver.findElement(By.partialLinkText("g i")).click();

		driver.quit();

		// Note: linkText() and partialLinkText() will work only in the anchor tag

	}
}
