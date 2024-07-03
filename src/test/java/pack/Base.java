package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	public static WebDriver driver;
	@BeforeMethod
	public void avantTest() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\NG\\Desktop\\takwa\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	// ouvrir le navigateur 
	 driver = new ChromeDriver();
	
	//maximase window
	driver.manage().window().maximize();
	
	//open url
	
	driver.get("https://www.facebook.com/");
	}
	@AfterMethod
	public void AFtetTest() {
		driver.quit();
}

}
