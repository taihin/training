package com.wdtraining.search;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex24Google_findElements {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		// System.setProperty("webdriver.chrome.verboseLogging", "true"); //
		// https://sites.google.com/a/chromium.org/chromedriver/logging

		WebDriver driver = new ChromeDriver(); // Create a new instance of the Chrome driver

		driver.get("http://www.google.nl");

		System.out.println("--- Successfully opened the website http://www.google.nl" + "\nUsing XPath"); // Print a message
																										// to the screen

		// use id to find input element


		// use name to find the button element
	
	
		// find a list of web element, which indicates the result. Print the nr of found results on the screen


		Thread.sleep(5000);
		driver.quit();
		System.out.println("--- End."); // Print a message to the screen
	}
}
