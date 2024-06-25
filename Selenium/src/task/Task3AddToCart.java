package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3AddToCart {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.xpath("//a[text()='Simple Computer']/../following-sibling::div[3]/div[1]/following-sibling::div/input")).click();
		driver.findElement(By.xpath("//a[text()='Simple Computer']/../../div[3]/div[2]/input")).click();
		//driver.quit();
		

	}

}
