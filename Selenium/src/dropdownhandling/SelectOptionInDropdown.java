package dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionInDropdown {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement multipleDropdown = driver.findElement(By.name("Month"));
		Select sel = new Select(multipleDropdown);
		sel.selectByIndex(4);
		sel.selectByValue("Nov");
		sel.selectByVisibleText("December");
	
		Thread.sleep(3000);
		driver.quit();
	}
}
