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

		driver.get("https://www.kvk.nl/service-en-contact/stel-een-vraag-online/#/");
		System.out.println("----- Successfully opened the website https://www.kvk.nl/service-en-contact/stel-een-vraag-online/"); // Print a message to the screen

		
		WebElement rBtnMevrouw = driver.findElement(By.xpath("//span[text()='Mevrouw']"));
		rBtnMevrouw.click();
		
		Thread.sleep(5000); // this sleep is for information purpose
		driver.quit();

		System.out.println("----- End ");
	}

}
