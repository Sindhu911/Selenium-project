package methodsofwebdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method7 {
	public static void main(String[] args) {
		
		//getWindowHandle() method
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		String sessionId=driver.getWindowHandle();
		System.out.println(sessionId);
		//driver.close();
		
	}
}
