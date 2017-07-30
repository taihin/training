package rijksoverheidPO.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AanmeldenNieuwsbriefSuccesvolPage {
	final WebDriver driver;

	public AanmeldenNieuwsbriefSuccesvolPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(how = How.XPATH, using = "//div[@id='content']//h1")
	private WebElement melding;
	
	
	public String getMelding() {
		return melding.getText();
		
	}
	
	
	
	
	
}
