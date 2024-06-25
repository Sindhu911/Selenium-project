package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("sindhukuppusamy1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Passw0rd@99"); 
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		//driver.findElement(By.cssSelector("[class='button-1 login-button']")).click(); 
	
		

	}

}
