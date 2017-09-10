package proxy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Edge {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "drivers/MicrosoftWebDriver.exe");

		WebDriver driver = new EdgeDriver(); // Create a new instance of the FF driver

		driver.get("http://www.google.nl"); // Launch the Google Website
		System.out.println("----- Successfully opened the website http://www.google.nl"); // Print a message to the screen

		Thread.sleep(5000);
		
		driver.quit();
		System.out.println("----- End");
	}
}