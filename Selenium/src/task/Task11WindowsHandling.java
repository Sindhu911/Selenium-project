package task;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11WindowsHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String dwsId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='YouTube']")).click();
		Set<String> allIds = driver.getWindowHandles();

		// switching the driver focus from main page to YouTube tab
		for (String id : allIds) {
			if (!(id.equals(dwsId))) {
				driver.switchTo().window(id);
				System.out.println(driver.getCurrentUrl());
			}
		}
		
		  driver.switchTo().window(dwsId);
		  driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		  driver.switchTo().window(dwsId);
		  driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		  driver.switchTo().window(dwsId);
		  driver.findElement(By.xpath("//a[text()='Google+']")).click();
		 
	}

}
