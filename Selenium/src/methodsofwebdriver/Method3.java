package methodsofwebdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method3 {
	public static void main(String[] args) {
		
		//getCurrentUrl() method
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}
}
