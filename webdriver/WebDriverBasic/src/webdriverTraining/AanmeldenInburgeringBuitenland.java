package webdriverTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AanmeldenInburgeringBuitenland {

	public static void main(String[] args) {
		String url = "https://apps.duo.nl/aib-gui/";
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.verboseLogging", "true");
		
		// Set capability
		// Create Instance of Chrome driver
		WebDriver driver = new ChromeDriver();

		// Go to https://www.jobbird.com/
		//driver.get("https://www.jobbird.com/");
		driver.get(url);
		
		WebDriverWait wait = new WebDriverWait(driver,10) ;
		WebElement chkbGeheimhv = wait.until( d -> d.findElement(By.id("geheimhouding")) );
 		//WebElement chkbGeheimhv = driver.findElement(By.id("geheimhouding"));
		chkbGeheimhv.click();
		
		WebElement chkbemail = driver.findElement(By.id("email"));
		chkbemail.click();
		
		Select ambassade = new Select( wait.until( d -> d.findElement(By.xpath("//select[@id='ambassade']"))));
		ambassade.selectByVisibleText("Angola, Luanda");
		
	}

}
