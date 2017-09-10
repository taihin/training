package proxy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

		WebDriver driver = new FirefoxDriver(); // Create a new instance of the FF driver

		driver.get("http://www.google.nl"); // Launch the Google Website

		System.out.println("Successfully opened the website http://www.google.nl"); // Print a message to the screen

		Thread.sleep(5000);
		driver.quit();
		System.out.println("----- End");
	}
}