package proxy;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;


public class Opera {

	// Opera will NOT work, due to bug!!
	
	public static void main(String[] args) {
		//OperaOptions options = new OperaOptions();
		//options.setBinary(new File("C:\\Program Files\\Opera"));
		
	
		System.setProperty("webdriver.opera.driver", "drivers\\operadriver.exe");
		System.setProperty("opera.binary", "C:\\Program Files\\Opera\\");
		WebDriver driver = new OperaDriver();
		//Exception in thread "main" org.openqa.selenium.WebDriverException: unknown error: cannot find Opera binary
		
		driver.get("http://www.google.nl");
		System.out.println("----- End");

	}

}
