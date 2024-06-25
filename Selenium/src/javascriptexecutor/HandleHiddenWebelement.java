package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenWebelement {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();  		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Save the element till which we need to perform scrolling
		WebElement elementDisplayedExample = driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
		//Save the textbox
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		//Explicit typecasting
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//Scrolling action
		jse.executeScript("arguments[0].scrollIntoView(true);", elementDisplayedExample);
		Thread.sleep(2000);
		//Click on Hide button
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
		//Passing text to hidden text box
		jse.executeScript("arguments[0].value='Sindhu';", textBox);
		Thread.sleep(2000);
		//Click on show button
		driver.findElement(By.id("show-textbox")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
