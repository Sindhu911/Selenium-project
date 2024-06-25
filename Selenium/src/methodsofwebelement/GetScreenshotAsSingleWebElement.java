package methodsofwebelement;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetScreenshotAsSingleWebElement {

	public static void main(String[] args) throws IOException  {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//save the web element
		WebElement logo = driver.findElement(By.cssSelector("[alt='Tricentis Demo Web Shop']"));
		
		//Take screenshot
		File screenshot = logo.getScreenshotAs(OutputType.FILE);
		
		//Give path 
		File path = new File("./ScreenShots/Logo.png");
		
		//Copy from variable to path 
		FileHandler.copy(screenshot, path);
	}

}
