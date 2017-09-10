package com.wdtraining.search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex21GoogleWebDriverVacature {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.verboseLogging", "true"); // https://sites.google.com/a/chromium.org/chromedriver/logging

		WebDriver driver = new ChromeDriver(); // Create a new instance of the Chrome driver

		driver.get("http://www.google.nl");
		
		System.out.println("--- Successfully opened the website http://www.google.nl"); // Print a message to the screen
		
		//use id to find input element
		WebElement input = driver.findElement(By.id("lst-ib"));
		input.sendKeys("WebDriver vacature");
		
		//use name to find the button element 
		WebElement btnGoogleZoeken = driver.findElement(By.name("btnK"));
		//btnGoogleZoeken.click();   // Exception other Element will receive the click
		btnGoogleZoeken.sendKeys(Keys.ENTER);
		
		
		Thread.sleep(5000);
		driver.quit();
		System.out.println("--- End."); // Print a message to the screen
		
	}

}
