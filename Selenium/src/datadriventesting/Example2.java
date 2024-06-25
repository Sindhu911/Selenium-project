package datadriventesting;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) throws Throwable {
		
		// Give the path
		FileInputStream fis = new FileInputStream("./Data/dwscredentials.properties");
		// Create the object of properties class
		Properties pObj = new Properties();
		// load the properties
		pObj.load(fis);
		// fetch the data
		String url = pObj.getProperty("url");
		String un = pObj.getProperty("username");
		String pwd = pObj.getProperty("password");
		//Login operation
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(un);
		driver.findElement(By.id("Password")).sendKeys(pwd); 
		driver.findElement(By.cssSelector("[value='Log in']")).click();

	}

}
