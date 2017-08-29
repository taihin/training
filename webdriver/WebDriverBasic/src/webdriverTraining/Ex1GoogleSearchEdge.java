package webdriverTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex1GoogleSearchEdge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "drivers/MicrosoftWebDriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://www.google.nl");

	}

}
