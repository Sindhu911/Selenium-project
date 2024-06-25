package framehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFocusSwitchToFrame {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(3);
		//WebElement frame = driver.findElement(By.xpath("//div[@jsname='cyZGl']"));
		//driver.switchTo().frame(frame);
		
		WebElement textInFrame = driver.findElement(By.xpath("//p[text()='To leave a comment, click the button below to sign in with Google.']"));
		System.out.println(textInFrame.getText());
		
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame(); switches to main page, because here the parent frame is main web page only
		WebElement textInMainPage = driver.findElement(By.cssSelector("[datetime='2019-11-21T22:42:00-08:00']"));
		System.out.println(textInMainPage.getText());
		driver.quit();
	}
}
