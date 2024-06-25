package relativexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByFollowingSibling {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.xpath("//span[@role='status']/../input[1]")).sendKeys("Mobiles");//Search text box
		driver.findElement(By.xpath("//span[@role='status']/following-sibling::input[1]")).sendKeys("Mobiles");
		////a[text()='$100 Physical Gift Card']/../following-sibling::div[3]/div[1]/span //dynamic element
		driver.quit();

	}

}
