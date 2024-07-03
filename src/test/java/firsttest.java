import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class firsttest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
// defenir chemin de pilote dans le pc 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NG\\Desktop\\takwa\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		// ouvrir le navigateur 
		WebDriver driver = new ChromeDriver();
		
		//maximase window
		driver.manage().window().maximize();
		
		//open url
		
		driver.get("https://www.facebook.com/");
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
		
		
		/*Thread.sleep(3000);
		driver.navigate().to("https://fr.wikomobile.com/");
		Thread.sleep(1000);
		//bch yrja3 b tweli
		driver.navigate().back();
		Thread.sleep(1000);
		// bch yrja3 l page lokhra
		driver.navigate().forward();
		
		//fermer le navigateur
		driver.quit();
		//driver.close(); */
	}

}
