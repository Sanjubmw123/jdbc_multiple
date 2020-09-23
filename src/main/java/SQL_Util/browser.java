package SQL_Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {
	static WebDriver driver;
	public static WebDriver startBrowser() {
		 System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 		driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 driver.get("http://www.techfios.com/ibilling/?ng=admin/");
		 	
		 return driver;
}
	public static void teardown() {
		driver.close();
		
	}
}