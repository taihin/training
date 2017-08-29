package webdriverTraining;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class Ex1CreateAccountInJobbird {

	public static void main(String[] args) throws InterruptedException {

		// Set System Property "webdriver.chrome.driver"
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.verboseLogging", "true");
		
		// Set capability
		// Create Instance of Chrome driver
		WebDriver driver = new ChromeDriver();

		// Go to https://www.jobbird.com/
		//driver.get("https://www.jobbird.com/");
		driver.get("https://www.google.nl");
		
		WebElement inputBox = driver.findElement(By.id("lst-ib"));
		inputBox.sendKeys("Job"+Keys.TAB);
		
		WebElement GoogleSearch = driver.findElement(By.name("btnK"));
		GoogleSearch.click();
		
		
		Select select = new Select(driver.findElement(By.xpath("//path_to_drop_down")));
		select.selectByVisibleText("text");
		select.deselectAll();
		select.selectByVisibleText("Value1");
		
		//WebElement JobZoetermeer = driver.findElement(By.partialLinkText("Werk.nl"));
		//JobZoetermeer.click();
		//java.util.List<WebElement> rows = driver.findElements(By.xpath("//table/tr"));
		
		List<WebElement> searchResults = driver.findElements(By.xpath(("//h3/a")));
		System.out.println(searchResults.size());
		// Click on link Inloggen
		WebElement LinkInloggen = driver.findElement(By.id("user-toggle"));
		LinkInloggen.click();

		// Enter email addres under 'Nieuw bij Jobbird.com?'
		WebElement InputNwGebrEmailaddress = driver.findElement(By.xpath("(//input[@name='email'])[2]"));
		InputNwGebrEmailaddress.sendKeys("taihin@hotmail.com");
		// Click on link 'Ga verder als nieuwe gebruiker'

		WebElement buttonNieuwGebruiker = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		buttonNieuwGebruiker.click();

		// Enter 'Gewenste wachtwoord'

		WebElement InputGewenstePsw = driver.findElement(By.xpath("//input[@name='Password']"));
		InputGewenstePsw.sendKeys("Test123test");
		// Click on 'Account aanmaken'
		WebElement BtnRegister = driver.findElement(By.id("btn-register"));
		BtnRegister.click();

		// Get success message, see "Welkom `email-address`"
		WebElement SuccessMessage = driver.findElement(By.xpath("//*[@id='subheader']//h1"));
		System.out.println(SuccessMessage.getText());

		// Close the Browser
		driver.quit();

		// Manually Remove account by going to `Icon` => Account => Account Verwijderen
	}

}
