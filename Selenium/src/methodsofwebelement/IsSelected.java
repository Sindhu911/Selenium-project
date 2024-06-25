package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		WebElement checkBox = driver.findElement(By.id("RememberMe"));
		System.out.println(checkBox.isSelected());
		checkBox.click();
		System.out.println(checkBox.isSelected());
		driver.quit();
		
		
	}

}
