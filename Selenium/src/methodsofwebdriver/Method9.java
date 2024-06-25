package methodsofwebdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method9 {
	public static void main(String[] args) {
		
		//manage() method
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//method chaining
		
		  //Options opts = driver.manage(); 
		  //Window win=opts.window(); 
		  //win.maximize();
		 	
		driver.get("https://www.selenium.dev/downloads/");
		
	}
}
