package mousehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement doubleClickButton = driver.findElement(By.cssSelector("[ondblclick='myFunction()']"));
		Actions act = new Actions(driver);
		//doubleClick(WebElement target)
		act.doubleClick(doubleClickButton).perform();
		driver.quit();
		
		//doubleClick()
		//act.moveToElement(textBox).doubleClick().perform();
		
		
	}

}
