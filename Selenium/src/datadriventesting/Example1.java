package datadriventesting;

import java.io.FileInputStream;
import java.util.Properties;

public class Example1 {

	public static void main(String[] args) throws Throwable {
		//Give the path
		FileInputStream fis = new FileInputStream("./Data/dwscredentials.properties");
		//Create the object of properties class
		Properties pObj = new Properties();
		//load the properties
		pObj.load(fis);
		//fetch the data
		String url = pObj.getProperty("url");
		System.out.println(url);
		String un = pObj.getProperty("username");
		System.out.println(un);
		String pwd = pObj.getProperty("password");
		System.out.println(pwd);

	}

}
