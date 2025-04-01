package section3;


import java.util.List;

import genericUtility.ExcelUtility;

public class FetchingMultileDataFromExcelFile {
	public static void main(String[] args) throws Exception {
		
		 /* FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Documents\\selenium3\\excelSelenium.xlsx");
		  Workbook wb=WorkbookFactory.create(fis); 
		  Sheet sh=wb.getSheet("fruits");
		  DataFormatter df=new DataFormatter(); 
		  for(int i=1;i<=sh.getLastRowNum();i++)
		  { 
			  Row r=sh.getRow(i); 
			  for(int j=0;j<r.getLastCellNum();j++) 
			  { 
				  Cell c=r.getCell(j); 
				  String value=df.formatCellValue(c);
		  System.out.print(value+" "); 
		  }
			  System.out.println();
			  }
		  */
		 
		ExcelUtility eUtil = new ExcelUtility();
		List<String> a1 = eUtil.getMultipleDataFromExcelFile("animals", 1, 0);
		System.out.println(a1);
	}
}
