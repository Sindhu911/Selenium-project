package dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement multipleDropdown = driver.findElement(By.name("Month"));
		Select sel = new Select(multipleDropdown);
		System.out.println(sel.isMultiple()); 
		/*
		 * WebElement singleDropdown = driver.findElement(By.name("country")); Select
		 * sel = new Select(singleDropdown); System.out.println(sel.isMultiple());
		 */
		driver.quit();
	}
}
