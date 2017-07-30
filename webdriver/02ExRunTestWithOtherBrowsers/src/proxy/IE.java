package proxy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
		System.setProperty("ie.driver.loglevel","INFO");
		System.setProperty("webdriver.ie.driver.logfile","C:\\temp\\IEServerlog.log");
		
		WebDriver driver = new InternetExplorerDriver(); // Create a new instance of the FF driver

		driver.get("http://www.google.nl"); // Launch the Google Website

		System.out.println("Successfully opened the website http://www.google.nl"); // Print a message to the screen
		Thread.sleep(5000);

		//driver.close();
		//driver.quit(); // Not working ! Bug!


	}
}
