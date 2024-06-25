package relativexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByPrecedingSibling {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@type='submit']/preceding-sibling::span"));
		driver.findElement(By.xpath("//input[@type='submit']/preceding-sibling::input")); 	
		driver.quit();

	}

}
