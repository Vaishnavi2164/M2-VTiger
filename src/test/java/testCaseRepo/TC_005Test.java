package testCaseRepo;

import org.testng.annotations.Test;

import ObjectRepository.ContactsPage;
import ObjectRepository.CreatingNewContactsPage;
import ObjectRepository.HomePage;
import genericUtility.BaseClass;

public class TC_005Test extends BaseClass {
	@Test(groups = {"Sanity"})
	public void CON_002() throws Exception 
	{
		HomePage hp=new HomePage(driver);
		hp.clickOncontactsMenu();
		
		ContactsPage cp=new ContactsPage(driver);
		cp.clickOnCreateingNewContactIcon();
		
		
		String lName=eUtil.getDataFromExcelFile("Contacts", 5, 1);
		String title=eUtil.getDataFromExcelFile("Contacts", 5, 2);
		String email=eUtil.getDataFromExcelFile("Contacts", 5, 3);
		String mobile=eUtil.getDataFromExcelFile("Contacts", 5, 4);
		CreatingNewContactsPage cnp=new CreatingNewContactsPage(driver);
		cnp.createNewContacts(lName, title, email, mobile);
		}

}
