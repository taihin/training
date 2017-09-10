package com.wdtraining.pageobject;

import org.testng.annotations.Test;

import com.wdtraining.pageobject.pageObjects.*;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AanmeldenNieuwsbriefTestPO {
	ChromeDriver driver;

	@Test
	public void NietSuccesvolAanmeldenNieuwsbriefRijksoverheidDoorOntbrekenEmailadres() throws InterruptedException {

		AanmeldenNieuwsbriefPage aanmeledenNieuwsbriefPage = new AanmeldenNieuwsbriefPage(driver);

		aanmeledenNieuwsbriefPage.SelectAfzender("Dienst Justis");
		aanmeledenNieuwsbriefPage.ClickOnVerfijn();
		aanmeledenNieuwsbriefPage.ClickChkBoxNbLandelijkBurBibob();
		aanmeledenNieuwsbriefPage.ClickChkUitnodigingVOGJongeren();
		aanmeledenNieuwsbriefPage.ClickBtnAanmelden();

		// Assert without email Error message
		String expectedText = "U dient een geldig e-mailadres in te vullen.";
		String actualText = aanmeledenNieuwsbriefPage.GetErrMsgNoEmailAddress();
		Assert.assertEquals(actualText, expectedText);
	}

	@Test
	public void SuccesvolAanmeldenNieuwsbriefRijksoverheid() throws InterruptedException {
		AanmeldenNieuwsbriefPage aanmeledenNieuwsbriefPage = new AanmeldenNieuwsbriefPage(driver);
		aanmeledenNieuwsbriefPage.SelectAfzender("Dienst Justis");
		//aanmeledenNieuwsbriefPage.SelectThema("Arbeidszaken Publieke Sector");
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

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.verboseLogging", "true");

		// Set capability

		// Create Instance of Chrome driver
		driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// Go to website https://abonneren.rijksoverheid.nl/nieuwsbrieven
		driver.get("https://abonneren.rijksoverheid.nl/nieuwsbrieven");

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
