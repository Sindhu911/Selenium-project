package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {

	public static void main(String[] args){

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Navigate to the Demo Web Shop application
		driver.get("https://demowebshop.tricentis.com/");
		
		//Login action
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("sindhukuppusamy1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Passw0rd@99");
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		
		//Click on books link
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[1]/a")).click();
		
		//Add to cart operation
		//driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[5]/div[1]/div[2]/div[3]/div[2]/input")).click();
		//driver.findElement(By.xpath("(//input[@type='button' and @value='Add to cart' and @class='button-2 product-box-add-to-cart-button'])[3]")).click();
		//driver.findElement(By.xpath("//input[contains(@fdprocessedid,'xbhtvq')]")).click();
		driver.findElement(By.xpath("//div[@data-productid='22']/descendant::div[2]/div[3]/div[2]/input")).click();
		
		//Click on shopping cart link
		driver.findElement(By.xpath("//span[@class='cart-label' and text()='Shopping cart']")).click();
		
		//print the price of the product
		String price = driver.findElement(By.xpath("//span[text()='Sub-Total:']/../../td[2]/span/span")).getText();
		System.out.println(price);
		
		//logout action
		driver.findElement(By.linkText("Log out")).click();
		
		//close the browser
		driver.quit();

	}

}
