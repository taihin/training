package webdriverTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class KvKServiceEnContact {

	public static void main(String[] args) {

		String url = "https://www.kvk.nl/service-en-contact/stel-een-vraag-online/#/";
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.verboseLogging", "true");
		
		// Set capability
		// Create Instance of Chrome driver
		WebDriver driver = new ChromeDriver();

		// Go to https://www.jobbird.com/
		//driver.get("https://www.jobbird.com/");
		driver.get(url);
		

		WebElement rBtnMevrouw = driver.findElement(By.xpath("//span[text()='Mevrouw']"));
 		rBtnMevrouw.click();
		
		
		
	}

}
