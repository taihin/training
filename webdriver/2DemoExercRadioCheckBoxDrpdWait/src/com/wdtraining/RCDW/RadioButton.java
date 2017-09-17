package com.wdtraining.RCDW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.verboseLogging", "true"); // https://sites.google.com/a/chromium.org/chromedriver/logging

		WebDriver driver = new ChromeDriver(); // Create a new instance of the Chrome driver
	    
		// Go to Raboabank particulier contact afspraak
		driver.get(
				"https://www.rabobank.nl/particulieren/contact/afspraak/?intcamp=pa-contact-contactblok&inttype=link-afspraak.maken&intsource=particulieren.contact");
		System.out.println("----- Successfully opened the website Rabobank particulieren contact afspraak");   

		// Click away cookie message
		WebElement btnAcceptCookie = driver.findElement(By.cssSelector("button[class=primary-button]"));
		btnAcceptCookie.click();
		Thread.sleep(3000);// Using Thread.Sleep in test is bad practice, here only for Demo purpose

		// Click on radio button to select 
		
		
		Thread.sleep(5000); // this sleep is for information purpose
		driver.quit();

		System.out.println("----- End ");
	}

}
