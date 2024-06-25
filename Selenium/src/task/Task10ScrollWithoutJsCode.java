package task;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10ScrollWithoutJsCode {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		// WebElement customerServiceText = driver.findElement(By.xpath("//a[text()='New
		// products']"));
		// customerServiceText.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);
		driver.quit();
	}

}
