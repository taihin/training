package proxy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.verboseLogging", "true"); // https://sites.google.com/a/chromium.org/chromedriver/logging

		WebDriver driver = new ChromeDriver(); // Create a new instance of the Chrome driver

		driver.get("http://www.google.nl");
		System.out.println("Successfully opened the website http://www.google.nl"); // Print a message to the screen

		Thread.sleep(5000);
		driver.quit();
		System.out.println("----- End"); // Print a message 
	}

}
