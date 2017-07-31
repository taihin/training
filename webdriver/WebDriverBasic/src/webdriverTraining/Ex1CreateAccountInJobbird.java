package webdriverTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1CreateAccountInJobbird {

	public static void main(String[] args) throws InterruptedException {
		
		// Set System Property "webdriver.chrome.driver" 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\taihin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// Set capability
		// Create Instance of Chrome driver
	    WebDriver driver = new ChromeDriver();
		
		// Go to https://www.jobbird.com/
		driver.get("https://www.jobbird.com/");
		
		// Click on link  Inloggen
		WebElement LinkInloggen = driver.findElement(By.id("user-toggle"));
		LinkInloggen.click();

		// Enter email addres under 'Nieuw bij Jobbird.com?'
		WebElement InputNwGebrEmailaddress = driver.findElement(By.xpath("(//input[@name='email'])[2]"));
		InputNwGebrEmailaddress.sendKeys("taihin@hotmail.com");
		// Click on link 'Ga verder als nieuwe gebruiker'
		
		WebElement  buttonNieuwGebruiker = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		buttonNieuwGebruiker.click();
		
		// Enter 'Gewenste wachtwoord'
		
		WebElement  InputGewenstePsw = driver.findElement(By.xpath("//input[@name='Password']"));
		InputGewenstePsw.sendKeys("Test123test");
		// Click on 'Account aanmaken'
		//WebElement  BtnRegister = driver.findElement(By.id("btn-register"));
		//BtnRegister.click();
		
		// Success message, see "Welkom `email-address`"


	}

}
