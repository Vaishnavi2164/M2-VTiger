package testCaseRepo;

import org.testng.annotations.Test;

import ObjectRepository.ContactsPage;
import ObjectRepository.CreatingNewContactsPage;
import ObjectRepository.HomePage;
import genericUtility.BaseClass;

public class TC_006 extends BaseClass{
	@Test(groups = {"Smoke"})
	public void CON_002() throws Exception 
	{
		HomePage hp=new HomePage(driver);
		hp.clickOncontactsMenu();
		
		ContactsPage cp=new ContactsPage(driver);
		cp.clickOnCreateingNewContactIcon();
		
		
		String lName=eUtil.getDataFromExcelFile("Contacts", 8, 1);
		String mobile=eUtil.getDataFromExcelFile("Contacts", 8, 2);
		String email=eUtil.getDataFromExcelFile("Contacts", 8, 3);
		String mailingCity=eUtil.getDataFromExcelFile("Contacts", 8, 4);
		String mailingState=eUtil.getDataFromExcelFile("Contacts", 8, 5);
		String mailingCountryy=eUtil.getDataFromExcelFile("Contacts", 8, 6);
		CreatingNewContactsPage cnp=new CreatingNewContactsPage(driver);
		cnp.createNewContacts(lName, email, mobile, mailingCity, mailingCountryy, mailingState);
		}

}
