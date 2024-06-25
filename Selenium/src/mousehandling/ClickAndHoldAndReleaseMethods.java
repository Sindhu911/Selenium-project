package mousehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldAndReleaseMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dragElement = driver.findElement(By.id("draggable"));
		WebElement dropElement = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.clickAndHold(dragElement).moveToElement(dropElement).release().perform();
		//act.moveToElement(dragElement).clickAndHold().moveToElement(dropElement).release().perform();
		//act.clickAndHold(dragElement).release(dropElement).perform();
		driver.quit();
	}

}
