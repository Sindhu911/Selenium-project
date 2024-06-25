package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3AbsoluteXpath{

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li/a")).click();
		driver.findElement(
				By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[2]/input"))
				.click();
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/input"))
				.sendKeys("Sindhu");
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/input"))
				.sendKeys("Kuppusamy");
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input"))
				.sendKeys("ksindhu18@gmail.com");
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/input"))
				.sendKeys("Password@123");
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input"))
				.sendKeys("Password@123");
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[4]/input")).click();
	}

}
