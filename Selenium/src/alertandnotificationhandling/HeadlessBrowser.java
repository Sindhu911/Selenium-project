package alertandnotificationhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {

		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("headless");
		WebDriver driver = new ChromeDriver(opts);
		 
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.linkText("Log in")).click();
		
		System.out.println(driver.getTitle());

		driver.quit();

	}

}
