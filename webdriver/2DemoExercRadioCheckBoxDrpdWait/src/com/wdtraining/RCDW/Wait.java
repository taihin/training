package com.wdtraining.RCDW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.verboseLogging", "true"); // https://sites.google.com/a/chromium.org/chromedriver/logging

		WebDriver driver = new ChromeDriver(); // Create a new instance of the Chrome driver
		driver.get("https://www.coolblue.nl");
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println("----- Successfully open website Coolblue"); // Print a message to the screen

		
		WebElement lnkKlantenservice = driver.findElement(By.linkText("Klantenservice")) ;
		lnkKlantenservice.click();
		
		//Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(d -> d.findElement(By.linkText("Ik wil mijn product retourneren.")) != null );

		WebElement lnkIkWilMijnProductRetourneren =  driver.findElement(By.linkText("Ik wil mijn product retourneren."));
		lnkIkWilMijnProductRetourneren.click();

		
		Thread.sleep(10000); // this sleep is for informational purpose
		driver.quit();

		System.out.println("----- End ");
	}
}
