package com.wdtraining.RCDW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.verboseLogging", "true"); // https://sites.google.com/a/chromium.org/chromedriver/logging

		WebDriver driver = new ChromeDriver(); // Create a new instance of the Chrome driver

		driver.get("https://abonneren.rijksoverheid.nl/nieuwsbrieven");
		
		
		System.out.println("----- Successfully opened the website https://abonneren.rijksoverheid.nl/nieuwsbrieven"); // Print a message to the screen

		Select selectAfzender = new Select(driver.findElement(By.id("Afzender")));
		selectAfzender.selectByVisibleText("Dienst Justis");

		
		//WebElement chkbLandBurBibob = driver.findElement(By.id("checkbox_1042"));
		//chkbLandBurBibob.click();
		
		Thread.sleep(5000); // this sleep is for information purpose
		driver.quit();

		System.out.println("----- End ");
	}

}
