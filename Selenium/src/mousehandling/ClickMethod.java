package mousehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement jewelery = driver.findElement(By.xpath("//ul[@class='top-menu']/li[6]/a"));
		Actions act = new Actions(driver);
		//click(WebElement target)
		act.click(jewelery).perform();
		driver.quit();
		
		//click()
		//act.moveToElement(jewelery).click().perform();
		
		
	}

}
