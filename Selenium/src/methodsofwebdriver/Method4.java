package methodsofwebdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method4 {
	public static void main(String[] args) {
		
		//getPageSource() method
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		String sourceCode=driver.getPageSource();
		System.out.println(sourceCode);
	
	}
}
