package relativexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBySurroundingElement {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[7]/a")).click();//Gift cards link
		String price = driver.findElement(By.xpath("//a[text()='$100 Physical Gift Card']/../../div[3]/div[1]/span")).getText();
		System.out.println(price);
		driver.quit();

	}

}
