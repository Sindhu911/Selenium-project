package relativexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributeAndVisibleText {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-register' and text()='Register']")).click();//Register link
		driver.findElement(By.xpath("//a[text()='Register' and @class='ico-register']")).click();//Register link
		driver.quit();

	}

}
