package relativexpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByBackwardTraversing {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		// driver.findElement(By.xpath("//input[@type='text']/../../..")); just for
		// understanding not executable (Search Text box)
		driver.quit();

	}

}
