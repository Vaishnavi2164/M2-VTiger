package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * /**
 * This is a contacts page POM class
 */
public class ContactsPage {

	@FindBy (xpath="//img[@title='Create Contact...']")
	private WebElement createNewContactsIcon;
	
	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewContactsIcon() {
		return createNewContactsIcon;
	}
	
	/**
	 * This is a business library to cick on create new contacts icon
	 */
	public void clickOnCreateingNewContactIcon()
	{
		getCreateNewContactsIcon().click();
	}
}
