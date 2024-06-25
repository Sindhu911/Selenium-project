package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4RelativeXpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Mobiles");
		// driver.findElement(By.xpath("//*[local-name()='svg' and
		// @height='24']")).click();
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		String price1 = driver
				.findElement(By
						.xpath("//div[text()='Motorola G34 5G (Ocean Green, 128 GB)']/../../div[2]/div[1]/div[1]/div"))
				.getText();
		System.out.println(price1);
		
		  String price2 = driver .findElement(By.xpath(
		  "//div[text()='Motorola G34 5G (Charcoal Black, 128 GB)']/../../div[2]/div[1]/div[1]/div"
		  )) .getText(); System.out.println(price2);
		 
		

	}

}
