package com.wdtraining.assertion;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AanmeldenNieuwsbriefTest_TestNG {
	WebDriver driver;

	@Test
	public void NietSuccesvolAanmeldenNieuwsbriefRijksoverheidDoorOntbrekenEmailadres() throws InterruptedException {

		Select selectAfzender = new Select(driver.findElement(By.id("Afzender")));
		selectAfzender.selectByVisibleText("Dienst Justis");

		//Select selectThema = new Select(driver.findElement(By.id("Thema")));
		//selectThema.selectByVisibleText("Arbeidszaken Publieke Sector");

		WebElement BtnVerfijn = driver.findElement(By.xpath("//input[@value='Verfijn']"));
		BtnVerfijn.click();

		WebElement chkbLandBurBibob = driver.findElement(By.id("checkbox_1042"));
		chkbLandBurBibob.click();

		WebElement chkbUitnodigingVOGJongeren = driver.findElement(By.id("checkbox_1096"));
		chkbUitnodigingVOGJongeren.click();

		WebElement btnAanmelden = driver.findElement(By.xpath("//button[@type='submit']"));
		btnAanmelden.click();

		String expectedText = "U dient een geldig e-mailadres in te vullen.";
		String actualText = driver.findElement(By.xpath("//span[@class='field-validation-error']")).getText();
		Assert.assertEquals(actualText, expectedText);
	}

	@Test
	public void SuccessvolAanmeldenNieuwsbriefRijksoverheid() throws InterruptedException {

		Select selectAfzender = new Select(driver.findElement(By.id("Afzender")));
		selectAfzender.selectByVisibleText("Dienst Justis");

		//Select selectThema = new Select(driver.findElement(By.id("Thema")));
		//selectThema.selectByVisibleText("Arbeidszaken Publieke Sector");

		WebElement BtnVerfijn = driver.findElement(By.xpath("//input[@value='Verfijn']"));
		BtnVerfijn.click();

		//Thread.sleep(5000);

		WebElement chkbLandBurBibob = driver.findElement(By.id("checkbox_1042"));
		chkbLandBurBibob.click();

		WebElement chkbUitnodigingVOGJongeren = driver.findElement(By.id("checkbox_1096"));
		chkbUitnodigingVOGJongeren.click();

		WebElement FieldEmail = driver.findElement(By.id("EmailAddress"));
		FieldEmail.sendKeys("taihin@hotmail.com");

		WebElement btnAanmelden = driver.findElement(By.xpath("//button[@type='submit']"));
		btnAanmelden.click();

		String expectedText = "Hartelijk dank voor uw aanmelding";
		String actualText = driver.findElement(By.xpath("//div[@id='content']//h1")).getText();
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
