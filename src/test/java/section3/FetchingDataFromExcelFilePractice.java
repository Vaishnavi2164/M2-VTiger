package section3;

import genericUtility.ExcelUtility;

public class FetchingDataFromExcelFilePractice {
	public static void main(String[] args) throws Exception {
		ExcelUtility eUtil=new ExcelUtility();
		String value=eUtil.getDataFromExcelFile("Leads", 2, 1);
		String value1=eUtil.getDataFromExcelFile("Contacts",5,3);
		System.out.println(value);
		System.out.println(value1);
	}

}
