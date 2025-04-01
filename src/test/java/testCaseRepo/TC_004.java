package testCaseRepo;

import org.testng.annotations.Test;

import ObjectRepository.ContactsPage;
import ObjectRepository.CreatingNewContactsPage;
import ObjectRepository.HomePage;
import genericUtility.BaseClass;

public class TC_004 extends BaseClass{
	@Test(groups = {"Regression","Smoke"})
	public void CON_001() throws Exception 
	{
		HomePage hp=new HomePage(driver);
		hp.clickOncontactsMenu();
		
		ContactsPage cp=new ContactsPage(driver);
		cp.clickOnCreateingNewContactIcon();
		
		String fName=eUtil.getDataFromExcelFile("Contacts", 2, 1);
		String lName=eUtil.getDataFromExcelFile("Contacts", 2, 2);
		String title=eUtil.getDataFromExcelFile("Contacts", 2, 3);
		CreatingNewContactsPage cnp=new CreatingNewContactsPage(driver);
		cnp.createNewContacts(fName, lName, title);
	}
} 
