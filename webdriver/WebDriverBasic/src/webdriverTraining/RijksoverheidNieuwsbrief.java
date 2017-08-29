package webdriverTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class RijksoverheidNieuwsbrief {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.verboseLogging", "true");
		
		// Set capability
		// Create Instance of Chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// Go to https://www.jobbird.com/
		//driver.get("https://www.jobbird.com/");
		driver.get("https://abonneren.rijksoverheid.nl/nieuwsbrieven");
		
		Select selectAfzender = new Select(driver.findElement(By.id("Afzender")));
		selectAfzender.selectByVisibleText("Dienst Justis");
		
		Select selectThema = new Select(driver.findElement(By.id("Thema")));
		selectThema.selectByVisibleText("Arbeidszaken Publieke Sector");
	
		WebElement BtnVerfijn = driver.findElement(By.xpath("//input[@value='Verfijn']"));
		BtnVerfijn.click();	
		
			
		WebElement chkbLandBurBibob = driver.findElement(By.id("checkbox_1042"));
		chkbLandBurBibob.click();

		
		
	}

}
