package com.wdtraining.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex25TimingIssue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		// System.setProperty("webdriver.chrome.verboseLogging", "true"); //
		// https://sites.google.com/a/chromium.org/chromedriver/logging

		WebDriver driver = new ChromeDriver(); // Create a new instance of the Chrome driver

		// Go to Raboabank particulier contact afspraak
		driver.get("https://www.coolblue.nl");
		System.out.println("----- Successfully opened the website Coolblue");

		// Click link "Bekijk hele assortiment"
		
		// Click submenu "TV & Audio"
		
		Thread.sleep(5000); // this sleep is for information purpose
		driver.quit();

		System.out.println("----- End ");
	}
}
