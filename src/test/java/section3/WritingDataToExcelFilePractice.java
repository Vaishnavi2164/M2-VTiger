package section3;

import genericUtility.JavaUtility;

public class WritingDataToExcelFilePractice {
	public static void main(String[] args) throws Exception {
		/*
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Documents\\selenium3\\excelSelenium.xlsx");
		  Workbook wb=WorkbookFactory.create(fis); 
		  Sheet sh=wb.getSheet("animals");
		  Row r=sh.createRow(2);
		  Cell c=r.createCell(2);
		  c.setCellValue("hello");
		  FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Documents\\selenium3\\excelSelenium.xlsx");
	      wb.write(fos);
	      */
		//ExcelUtility eUtil=new ExcelUtility();
		//eUtil.writeDataToExcelFile("animals", 4, 3,"dolphin");
		
		/*Random r=new Random();
		int value=r.nextInt(1000);
		System.out.println(value);*/
		
		JavaUtility jUtil=new JavaUtility();
		int value=jUtil.generateRandomNumber(100);
		System.out.println(value);
		
		String dateStamp=jUtil.getCalendarDetails("dd-MMM-YYYY");
		System.out.println(dateStamp);
		
		String dateTimeStamp=jUtil.getCalendarDetails("dd-MMM-YYYY  hh:mm:ss");
		System.out.println(dateTimeStamp);
		
		String time=jUtil.getCalendarDetails("hh:mm:ss");
		System.out.println(time);
	}

}
