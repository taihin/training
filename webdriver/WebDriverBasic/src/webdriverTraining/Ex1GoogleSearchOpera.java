package webdriverTraining;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Ex1GoogleSearchOpera {

	public static void main(String[] args) {
		//OperaOptions options = new OperaOptions();
		//options.setBinary(new File("C:\\Program Files\\Opera"));
		
	
		System.setProperty("webdriver.opera.driver", "drivers\\operadriver.exe");
		System.setProperty("opera.binary", "C:\\Program Files\\Opera\\");
		WebDriver driver = new OperaDriver();
		
		driver.get("http://www.google.nl");

	}

}
