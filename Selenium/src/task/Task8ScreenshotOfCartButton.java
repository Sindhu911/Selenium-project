package task;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Task8ScreenshotOfCartButton {

	public static void main(String[] args) throws IOException{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Navigate to the Demo Web Shop application
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[1]/a")).click();
		WebElement cartButton = driver.findElement(By.xpath("//div[@data-productid='22']/descendant::div[2]/div[3]/div[2]/input"));
		File image = cartButton.getScreenshotAs(OutputType.FILE);
		File path = new File("./ScreenShots/AddToCart.png");
		FileHandler.copy(image, path);
		
		
		//close the browser
		driver.quit();

	}

}
