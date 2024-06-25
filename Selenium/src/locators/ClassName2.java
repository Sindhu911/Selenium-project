package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName2 {
	public static void main(String[] args) {

		// className() method

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement textBox = driver.findElement(By.className("search-box-text ui-autocomplete-input"));
		textBox.sendKeys("Mobile");
		
		//Note: If we have a space inbetween the value then we can't use className() locator
	}
}
