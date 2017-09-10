package com.wdtraining.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex26CaptureText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.verboseLogging", "true"); // https://sites.google.com/a/chromium.org/chromedriver/logging

		WebDriver driver = new ChromeDriver(); // Create a new instance of the Chrome driver
		driver.get("https://www.coolblue.nl");
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println("----- Successfully open website Coolblue"); // Print a message to the screen

		
		WebElement lnkKlantenservice = driver.findElement(By.linkText("Klantenservice")) ;
		lnkKlantenservice.click();
		
		WebElement kltServNrLijn = driver.findElement(By.cssSelector(".customer-service-footer--phone"));
		String kltServNr = kltServNrLijn.getText().substring(7);
		System.out.println("Klantenservicenummer van Coolblue is: "+kltServNr);


		System.out.println("----- End ");
	}
}
