package alertandnotificationhandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationHandling {

	public static void main(String[] args) {
		
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opts);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
	
		driver.quit();
		

	}

}
