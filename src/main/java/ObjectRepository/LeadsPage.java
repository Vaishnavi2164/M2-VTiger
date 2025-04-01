package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a Leads page POM class
 */
public class LeadsPage {
	
	@FindBy (xpath="//img[@title='Create Lead...']")
	private WebElement createNewLeadsIcon;
	
	public LeadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewLeadsIcon() {
		return createNewLeadsIcon;
	}

	/**
	 * This is a business library to click on create new leads icon
	 */
	public void clickOnCreateingNewLeadIcon()
	{
		getCreateNewLeadsIcon().click();
	}


}
