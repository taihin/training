package com.wdtraining.RCDW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class DropdownList {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.verboseLogging", "true"); // https://sites.google.com/a/chromium.org/chromedriver/logging

		WebDriver driver = new ChromeDriver(); // Create a new instance of the Chrome driver
        
		// Go to Raboabank particulier contact afspraak 
		driver.get("https://www.rabobank.nl/particulieren/contact/afspraak/?intcamp=pa-contact-contactblok&inttype=link-afspraak.maken&intsource=particulieren.contact");
		
		System.out.println("----- Successfully opened the website Rabobank particulieren contact afspraak"); // Print a message to the screen
		
		// Click away cookie message
		WebElement btnAcceptCookie = driver.findElement(By.cssSelector("button[class=primary-button]"));
		btnAcceptCookie.click();
		Thread.sleep(3000);// Using Thread.Sleep in test is bad practice, here only for Demo purpose
		
		// In dropdownlist, select the option you want
		WebElement ddlOnderwerp = driver.findElement(By.id("qfs_IF7425_21806"));
		Select selectElementOnderwerp = new Select(ddlOnderwerp);
		selectElementOnderwerp.selectByVisibleText("Hypotheken");

		Thread.sleep(5000); // this sleep is for information purpose
		driver.quit();

		System.out.println("----- End ");
	}

}
