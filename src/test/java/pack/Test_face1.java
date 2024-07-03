package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_face1 extends Base {
	
	
	
	
	@Test
	public void test1()  {
	
	// afficher le titre de la page dans le console 
	String titre = driver.getTitle();
	System.out.println(titre);
	
	WebElement inputEmail = driver.findElement(By.id("email"));
	inputEmail.sendKeys("foulenbenfo.com");
	
	WebElement inputPass = driver.findElement(By.id("pass"));
	inputPass.sendKeys("passssss");
	WebElement buttonSeConnecter = driver.findElement(By.name("login"));
	buttonSeConnecter.click();
	WebElement lienMotPasseOublie = driver.findElement(By.linkText("Mot de passe oublié ?"));
	lienMotPasseOublie.click();

}
	@Test
	public void test2() {
	
	// afficher le titre de la page dans le console 
	String titre = driver.getTitle();
	System.out.println(titre);
	
	WebElement inputEmail = driver.findElement(By.id("email"));
	inputEmail.sendKeys("foulenbenfo.com");
	
	WebElement inputPass = driver.findElement(By.id("pass"));
	inputPass.sendKeys("passssss");
	WebElement buttonSeConnecter = driver.findElement(By.name("login"));
	buttonSeConnecter.click();
	WebElement lienMotPasseOublie = driver.findElement(By.linkText("Mot de passe oublié ?"));
	lienMotPasseOublie.click();

}
	
	@Test
	public void test3() {
	
	// afficher le titre de la page dans le console 
	String titre = driver.getTitle();
	System.out.println(titre);
	
	WebElement inputEmail = driver.findElement(By.id("email"));
	inputEmail.sendKeys("foulenbenfo.com");
	
	WebElement inputPass = driver.findElement(By.id("pass"));
	inputPass.sendKeys("passssss");
	WebElement buttonSeConnecter = driver.findElement(By.name("login"));
	buttonSeConnecter.click();
	WebElement lienMotPasseOublie = driver.findElement(By.linkText("Mot de passe oublié ?"));
	lienMotPasseOublie.click();

}
	
	

}


