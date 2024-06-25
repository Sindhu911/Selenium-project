package methodsofwebelement;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetScreenshotAsWebPage {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//Explicit Type casting
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//Take screenshot
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		
		//Give path 
		File path = new File("./ScreenShots/DemoWebShop.png");
		
		//Copy from variable to path 
		FileHandler.copy(screenshot, path);
	}

}
