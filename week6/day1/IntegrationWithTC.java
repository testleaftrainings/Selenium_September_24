package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IntegrationWithTC {

	//step 4 change normal method and retain the static keyword
	public static String[][] readExcel() throws IOException {
		
		
		XSSFWorkbook wb=new XSSFWorkbook("./dataSheet/CreateLead.xlsx");
		
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		
		int rowCount = sheet.getLastRowNum();
		
		short cellCount = sheet.getRow(1).getLastCellNum();
		
		//step 1
		String[][] data=new String[rowCount][cellCount];

		for (int i = 1; i <=rowCount; i++) {
			
			for (int j = 0; j < cellCount; j++) {
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(value);
				
				//step2
				data[i-1][j]=value;
			}
			
		}
		
		
		//close your wb
		wb.close();
		
		//step3 return data
		return data;
	}
}
