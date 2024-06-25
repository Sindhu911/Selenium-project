package windowhandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToChildTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String mainId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Set<String> allIds = driver.getWindowHandles();
		
		//switching the driver focus from main page to child tab
		for(String id:allIds)
		{
			if(!(id.equals(mainId)))
			{
				driver.switchTo().window(id);
				System.out.println(driver.getCurrentUrl());
	
			}
		}
		//switching the driver focus back to main page from child tab	
		
				driver.switchTo().window(mainId);
				System.out.println(driver.getCurrentUrl());
	
			
		
	}

}
