package task;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Task7ScreenshotOfStarReview {

	public static void main(String[] args) throws IOException{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Navigate to the Demo Web Shop application
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[1]/a")).click();
		WebElement review = driver.findElement(By.cssSelector("[title='1043 review(s)']"));
		File image = review.getScreenshotAs(OutputType.FILE);
		File path = new File("./ScreenShots/StarReview.png");
		FileHandler.copy(image, path);
		
		
		//close the browser
		driver.quit();

	}

}
