package demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;   
//import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");	
		String mainId = driver.getWindowHandle();
		System.out.println(mainId);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Set<String> sessIds = driver.getWindowHandles();
		for(String ids:sessIds)
		{
			
			System.out.println(ids);
		}
		//driver.findElement(By.id(":r12:")).sendKeys("sindhu");
	}

}
