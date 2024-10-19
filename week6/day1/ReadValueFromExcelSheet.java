package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadValueFromExcelSheet {

	public static void main(String[] args) throws IOException {
		
		//step 1-set path of the workbook
		XSSFWorkbook wb=new XSSFWorkbook("./dataSheet/CreateLead.xlsx");
		
		//step2 -get into the sheet
		XSSFSheet sheet = wb.getSheetAt(0);
		
		//step3 - row value or row count
		int rowCount = sheet.getLastRowNum();
		//it will give count how many rows is presented in excel sheet
		System.out.println("No of rows :"+rowCount);
		
		//count header value
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("include the header value :"+physicalNumberOfRows);
		
		//step4 cell count
		
		short cellCount = sheet.getRow(1).getLastCellNum();
		System.out.println(cellCount);
		
		
		String stringCellValue = sheet.getRow(4).getCell(1).getStringCellValue();
		System.out.println(stringCellValue);
		
		
		//print all value from excel sheet
		
		//nested for loop
		for (int i = 1; i <=rowCount; i++) {
			
			for (int j = 0; j < cellCount; j++) {
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
			}
			
		}
		
		
		//close your wb
		wb.close();
		
	}
}
