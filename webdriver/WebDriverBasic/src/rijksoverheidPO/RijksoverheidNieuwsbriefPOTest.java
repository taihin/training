package rijksoverheidPO;

import org.testng.annotations.Test;
import rijksoverheidPO.pageObjects.AanmeldenNieuwsbriefPage;
import rijksoverheidPO.pageObjects.AanmeldenNieuwsbriefSuccesvolPage;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class RijksoverheidNieuwsbriefPOTest {

	ChromeDriver driver;

	@Test
	public void SuccesvolAanmeldenNieuwsbriefRijksoverheid() throws InterruptedException {
		AanmeldenNieuwsbriefPage aanmeledenNieuwsbriefPage = new AanmeldenNieuwsbriefPage(driver);
		aanmeledenNieuwsbriefPage.SelectAfzender("Dienst Justis");
		aanmeledenNieuwsbriefPage.SelectThema("Arbeidszaken Publieke Sector");
		aanmeledenNieuwsbriefPage.ClickOnVerfijn();
		aanmeledenNieuwsbriefPage.ClickChkBoxNbLandelijkBurBibob();
		aanmeledenNieuwsbriefPage.ClickChkUitnodigingVOGJongeren();
		aanmeledenNieuwsbriefPage.EnterEmailAdres("taihin@hotmail.com");
		aanmeledenNieuwsbriefPage.ClickBtnAanmelden();

		AanmeldenNieuwsbriefSuccesvolPage aanmeldenNieuwsbriefSuccesvolPage = new AanmeldenNieuwsbriefSuccesvolPage(
				driver);
		String expectedText = "Hartelijk dank voor uw aanmelding";
		String actualText = aanmeldenNieuwsbriefSuccesvolPage.getMelding();
		Assert.assertEquals(actualText, expectedText);

	}
	
	@Test
	public void NietSuccesvolAanmeldenNieuwsbriefRijksoverheidDoorOntbrekenEmailadres() throws InterruptedException {
		AanmeldenNieuwsbriefPage aanmeledenNieuwsbriefPage = new AanmeldenNieuwsbriefPage(driver);
		aanmeledenNieuwsbriefPage.SelectAfzender("Dienst Justis");
		aanmeledenNieuwsbriefPage.SelectThema("Arbeidszaken Publieke Sector");
		aanmeledenNieuwsbriefPage.ClickOnVerfijn();
		aanmeledenNieuwsbriefPage.ClickChkBoxNbLandelijkBurBibob();
		aanmeledenNieuwsbriefPage.ClickChkUitnodigingVOGJongeren();
		aanmeledenNieuwsbriefPage.ClickBtnAanmelden();

		//to do assert fout melding

	}

	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.verboseLogging", "true");

		// Set capability
		// Create Instance of Chrome driver
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// Go to https://www.jobbird.com/
		// driver.get("https://www.jobbird.com/");
		driver.get("https://abonneren.rijksoverheid.nl/nieuwsbrieven");

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
