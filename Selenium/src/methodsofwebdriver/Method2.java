package methodsofwebdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method2 {
	public static void main(String[] args) {
		
		//getTitle() method
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
	    String title = driver.getTitle();
	    System.out.println(title);
	}
}