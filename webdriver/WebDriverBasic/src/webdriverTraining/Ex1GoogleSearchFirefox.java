package webdriverTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex1GoogleSearchFirefox {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.nl");

	}

}
