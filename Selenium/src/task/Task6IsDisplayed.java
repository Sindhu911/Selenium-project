package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6IsDisplayed {

	public static void main(String[] args){

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Navigate to the Demo Web Shop application
		driver.get("https://demowebshop.tricentis.com/");
		WebElement register = driver.findElement(By.className("ico-register"));
		if(register.isDisplayed())
		{
			System.out.println("Welcome page is displayed");
		}
		else
		{
			System.out.println("Welcome page is not displayed");
		}
		
		//Login action
		driver.findElement(By.linkText("Log in")).click();
		WebElement forgetPassword= driver.findElement(By.xpath("//a[text()='Forgot password?']"));
		if(forgetPassword.isDisplayed())
		{
			System.out.println("Login page is displayed");
		}
		else
		{
			System.out.println("Login page is not displayed");
		}
		driver.findElement(By.id("Email")).sendKeys("sindhukuppusamy1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Passw0rd@99");
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		String homePageTitle = driver.getTitle();
		if(homePageTitle.contains("Demo Web Shop"))
		{
			System.out.println("Home page is displayed");
		}
		else
		{
			System.out.println("Home page is not displayed");
		}
		
		//Click on books link
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[1]/a")).click();
		String bookPageTitle = driver.getTitle();
		if(bookPageTitle.contains("Demo Web Shop. Books"))
		{
			System.out.println("Books page is displayed");
		}
		else
		{
			System.out.println("Books page is not displayed");
		}
		
		//Add to cart operation
		driver.findElement(By.xpath("//div[@data-productid='22']/descendant::div[2]/div[3]/div[2]/input")).click();
		
		//Click on shopping cart link
		driver.findElement(By.xpath("//span[@class='cart-label' and text()='Shopping cart']")).click();
		WebElement checkOutButton = driver.findElement(By.id("checkout"));
		if(checkOutButton.isDisplayed())
		{
			System.out.println("Shopping kart page is displayed");
		}
		else
		{
			System.out.println("Shopping cart page is not displayed");
		}
		
		//print the price of the product
		String price = driver.findElement(By.xpath("//span[text()='Sub-Total:']/../../td[2]/span/span")).getText();
		System.out.println(price);
		
		//logout action
		driver.findElement(By.linkText("Log out")).click();
		
		//close the browser
		driver.quit();

	}

}
