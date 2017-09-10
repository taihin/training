package proxy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
		System.setProperty("ie.driver.loglevel","INFO");
		System.setProperty("webdriver.ie.driver.logfile","C:\\temp\\IEServerlog.log");
		
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability("ignoreZoomSetting", true);
		WebDriver driver = new InternetExplorerDriver(caps); // Create a new instance of the FF driver, use caps to avoid Exception 

		driver.get("http://www.google.nl"); // Launch the Google Website

		System.out.println("Successfully opened the website http://www.google.nl"); // Print a message to the screen
		Thread.sleep(5000);

		//driver.close();
		driver.quit(); // Not working ! Bug!
		System.out.println("----- End");

	}
}
