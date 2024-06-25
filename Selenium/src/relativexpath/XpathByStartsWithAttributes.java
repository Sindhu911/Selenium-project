package relativexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByStartsWithAttributes {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[starts-with(@id,'small-sear')]")).sendKeys("Mobiles");//Search text box
		//In this starts with we can't check matching by removing the starting letters
		driver.quit();

	}

}
