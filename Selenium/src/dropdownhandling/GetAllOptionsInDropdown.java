package dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOptionsInDropdown {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//MULTIPLE DROPDOWN
		WebElement multipleDropdown = driver.findElement(By.name("Month"));
		Select sel = new Select(multipleDropdown);
		
		List<WebElement> allOptions = sel.getOptions();
		for(WebElement options:allOptions)
		{
			System.out.println(options.getText());
		}	
		
		/* SINGLE DROPDOWN
		 * WebElement singleDropdown = driver.findElement(By.name("country")); 
		 * Select sel1 = new Select(singleDropdown); 
		 * List<WebElement> allOptionsInSingle = sel1.getOptions(); 
		 * for(WebElement options:allOptionsInSingle) 
		 * {
		 * System.out.println(options.getText()); 
		 * }
		 */
		Thread.sleep(3000);
		driver.quit();
	}
}
