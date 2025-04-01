package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * This is a create new Lead Page POM class
 * @author Admin
 * @version 25.03.10
 */
public class CreatingNewLeadPage {
	@FindBy (xpath="//input[@name='firstname']")
	private WebElement firstNameTextField;
	
	@FindBy (xpath="//input[@name='lastname']")
	private WebElement lastNameTextField;
	
	@FindBy (xpath="//input[@name='company']")
	private WebElement companyTextField;
	
	@FindBy (xpath="//select[@name='leadsource']")
	private WebElement leadSourceDropdown;
	
	@FindBy (xpath="//input[@id='noofemployees']")
	private WebElement noOfEmployeesTextField;
	
	@FindBy (xpath="//input[@id='mobile']")
	private WebElement mobileTextField;
	
	@FindBy (xpath="//input[@id='email']")
	private WebElement emailTextField;
	
	@FindBy (xpath="//input[@id='city']")
	private WebElement cityTextField;
	
	@FindBy (xpath="//input[@id='country']")
	private WebElement countryTextField;
	
	@FindBy (xpath="//input[@id='state']")
	private WebElement stateTextField;
	
	@FindBy (xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;

	public CreatingNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getCompanyTextField() {
		return companyTextField;
	}

	public WebElement getLeadSourceDropdown() {
		return leadSourceDropdown;
	}

	public WebElement getNoOfEmployeesTextField() {
		return noOfEmployeesTextField;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	public WebElement getCountryTextField() {
		return countryTextField;
	}

	public WebElement getStateTextField() {
		return stateTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/**
	 * This is a business library to create a new lead
	 * @param firstName
	 * @param lastName
	 * @param company
	 */
	public void createNewLead(String firstName,String lastName,String company)
	{
		getFirstNameTextField().sendKeys(firstName);
		getLastNameTextField().sendKeys(lastName);
		getCompanyTextField().sendKeys(company);
	}
	
	/**
	 * This is a business library to create a new lead
	 * @param lastName
	 * @param company
	 * @param leadSource
	 * @param noOfEmployees
	 * @param mobile
	 */
	public void createNewLead(String lastName,String company,String leadSource,String noOfEmployees,String mobile)
	{
		getLastNameTextField().sendKeys(lastName);
		getCompanyTextField().sendKeys(company);
		
		Select sel=new Select(getLeadSourceDropdown());
		sel.selectByValue(leadSource);
		
		getNoOfEmployeesTextField().sendKeys(noOfEmployees);
		getMobileTextField().sendKeys(mobile);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new lead
	 * @param lastName
	 * @param company
	 * @param leadSource
	 * @param noOfEmployees
	 * @param mobile
	 * @param city
	 * @param country
	 * @param state
	 */
	public void createNewLead(String lastName,String company,String leadSource,String noOfEmployees,String mobile,String city,String country,String state)
	{
		getLastNameTextField().sendKeys(lastName);
		getCompanyTextField().sendKeys(company);
		getLeadSourceDropdown().sendKeys(leadSource);
		getNoOfEmployeesTextField().sendKeys(noOfEmployees);
		getMobileTextField().sendKeys(mobile);
		getCityTextField().sendKeys(city);
		getCountryTextField().sendKeys(country);
		getStateTextField().sendKeys(state);
	}

     
}
