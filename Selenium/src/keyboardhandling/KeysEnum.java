package keyboardhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysEnum {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//click on login link
		driver.findElement(By.linkText("Log in")).click();
		//keyboard handling using keys enum
		driver.findElement(By.id("Email")).sendKeys("sindhukuppusamy1@gmail.com",Keys.TAB,"Passw0rd@99",Keys.TAB,Keys.SPACE,Keys.TAB,Keys.TAB,Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
	}

}
