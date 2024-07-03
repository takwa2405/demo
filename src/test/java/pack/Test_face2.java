package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class Test_face2 extends Base{
	

	@Test
	 public void Test4() {
		
		Assert.assertEquals(driver.getTitle(), "Facebook - Connexion ou inscription");

}}
