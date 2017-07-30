package rijksoverheidPO.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AanmeldenNieuwsbriefPage {

	final WebDriver driver;

	public AanmeldenNieuwsbriefPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(how = How.ID, using = "Afzender")
	private WebElement selectAfzender;

	@FindBy(how = How.ID, using = "Thema")
	private WebElement selectThema;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Verfijn']")
	private WebElement BtnVerfijn;


	@FindBy(how = How.ID, using = "checkbox_1042")
	private WebElement chkbLandBurBibob;
	
	@FindBy(how = How.ID, using = "checkbox_1096")
	private WebElement chkbUitnodigingVOGJongeren ;

	@FindBy(how = How.ID, using = "EmailAddress")
	private WebElement FieldEmail;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement btnAanmelden;
	
	
	
	
	public void SelectAfzender(String visbleText) {
		Select sAfzender = new Select(selectAfzender);
		sAfzender.selectByVisibleText(visbleText);
	}
	
	public void SelectThema(String visbleText) {
		Select sThema = new Select(selectThema);
		sThema.selectByVisibleText(visbleText);
	}
	
	public void ClickOnVerfijn() {
		BtnVerfijn.click();
	}

	public void ClickChkBoxNbLandelijkBurBibob() throws InterruptedException {
		Thread.sleep(5000); //DO NOT use Thread.Sleep(); Use Explicit Wait!
		chkbLandBurBibob.click();
	}
	
	public void ClickChkUitnodigingVOGJongeren() {
		chkbUitnodigingVOGJongeren.click();
	}
	
	public void EnterEmailAdres(String emailAdres) {
		FieldEmail.sendKeys(emailAdres);
	}
	
	public void ClickBtnAanmelden() {
		btnAanmelden.click();
	}
	
	
	
}
