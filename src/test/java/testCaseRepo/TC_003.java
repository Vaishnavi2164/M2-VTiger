package testCaseRepo;

import org.testng.annotations.Test;

import ObjectRepository.CreatingNewLeadPage;
import ObjectRepository.HomePage;
import ObjectRepository.LeadsPage;
import genericUtility.BaseClass;

public class TC_003 extends BaseClass{
	@Test(groups = {"Sanity"})
	public void LE_003() throws Exception 
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPage lep=new LeadsPage(driver);
		lep.clickOnCreateingNewLeadIcon();
		
		String lName=eUtil.getDataFromExcelFile("Leads", 8, 1);
		String mobile=eUtil.getDataFromExcelFile("Leads", 8, 2);
		String email=eUtil.getDataFromExcelFile("Leads", 8, 3);
		String mailingCity=eUtil.getDataFromExcelFile("Leads", 8, 4);
		String mailingCountry=eUtil.getDataFromExcelFile("Leads", 8, 5);
		String mailingState=eUtil.getDataFromExcelFile("Leads", 8, 6);
		
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.createNewLead(lName, mailingState, lName, email, mobile, mailingCity, mailingCountry, mailingState);
	}

}
