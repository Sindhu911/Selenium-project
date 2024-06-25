package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement textBox = driver.findElement(By.id("small-searchterms"));
		  Rectangle sizeAndLocation = textBox.getRect();
		System.out.println(sizeAndLocation.getX());
		System.out.println(sizeAndLocation.getY());
		System.out.println(sizeAndLocation.getHeight());
		System.out.println(sizeAndLocation.getWidth());
		driver.quit();
	}

}
