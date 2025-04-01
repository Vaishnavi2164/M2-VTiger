package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a creating new contacts page POM class
 * @author Admin
 * @version 25.03.12
 */
public class CreatingNewContactsPage {
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstNameTextField;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameTextField;
	
	@FindBy(xpath="//input[@id='title']")
	private WebElement titleTextField;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement mobileTextField;
	
	@FindBy(xpath="//input[@id='mailingcity']")
	private WebElement mailingCityTextField;
	
	@FindBy(xpath="//input[@id='mailingstate']")
	private WebElement mailingStateTextField;
	
	@FindBy(xpath="//input[@id='mailingcountry']")
	private WebElement mailingCountryTextField;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getMailingCityTextField() {
		return mailingCityTextField;
	}

	public WebElement getMailingStateTextField() {
		return mailingStateTextField;
	}

	public WebElement getMailingCountryTextField() {
		return mailingCountryTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/**
	 * This is a business library to create a new contacts
	 * @param firstName
	 * @param lastName
	 * @param title
	 */
	public void createNewContacts(String firstName,String lastName,String title)
	{
		getFirstNameTextField().sendKeys(firstName);
		getLastNameTextField().sendKeys(lastName);
		getTitleTextField().sendKeys(title);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new contacts
	 * @param lastName
	 * @param title
	 * @param email
	 * @param mobile
	 */
	public void createNewContacts(String lastName,String title,String email,String mobile)
	{
		getLastNameTextField().sendKeys(lastName);
		getTitleTextField().sendKeys(title);
		getEmailTextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new contacts
	 * @param lastName
	 * @param title
	 * @param email
	 * @param mobile
	 * @param mailingCity
	 * @param mailingCountry
	 * @param mailingState
	 */
	public void createNewContacts(String lastName,String email,String mobile,String mailingCity,String mailingCountry,String mailingState)
	{
		getLastNameTextField().sendKeys(lastName);
		getEmailTextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getMailingCityTextField().sendKeys(mailingCity);
		getMailingCountryTextField().sendKeys(mailingCountry);
		getMailingStateTextField().sendKeys(mailingState);
		getSaveButton().click();
	}

}
