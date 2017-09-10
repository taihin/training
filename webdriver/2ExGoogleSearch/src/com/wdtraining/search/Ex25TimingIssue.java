package com.wdtraining.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex25TimingIssue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		// System.setProperty("webdriver.chrome.verboseLogging", "true"); //
		// https://sites.google.com/a/chromium.org/chromedriver/logging

		WebDriver driver =  new ChromeDriver(); // Create a new instance of the Chrome driver

		// Go to Raboabank particulier contact afspraak
		driver.get("https://www.coolblue.nl");
		System.out.println("----- Successfully opened the website Coolblue");

		// Click link "Bekijk hele assortiment"
		WebElement lnkBekijkHeleAssort = driver.findElement(By.xpath("//span[text()='Bekijk hele']"));
		lnkBekijkHeleAssort.click();

		// Click submenu "TV & Audio"
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(d -> d.findElement(By.xpath("(//span[@class='collapsible-panel--header-text'])[3]")).isDisplayed());
		WebElement catTvAudio = driver.findElement(By.xpath("(//span[@class='collapsible-panel--header-text'])[3]"));
		catTvAudio.click();

		// By byTvAudio = By.xpath("(//span[@class='collapsible-panel--header-text'])[3]");
		// wait.until(d -> d.findElement(byTvAudio).isDisplayed());
		// WebElement catTvAudio = driver.findElement(byTvAudio);
		// catTvAudio.click();

		Thread.sleep(5000); // this sleep is for information purpose
		driver.quit();

		System.out.println("----- End ");
	}

}
