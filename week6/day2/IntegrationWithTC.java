package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IntegrationWithTC {

	//step 2 -create variable inside method and pass into filepath
	public static String[][] readExcel(String filedata) throws IOException {
		
		//./dataSheet/createlead.xlsx
		//./dataSheet/editlead.xlsx
		XSSFWorkbook wb=new XSSFWorkbook("./dataSheet/"+filedata+".xlsx");
		
		
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
