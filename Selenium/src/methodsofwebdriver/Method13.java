package methodsofwebdriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method13 {
	public static void main(String[] args) {
		
		//findElements() method
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
		}
	}
}
