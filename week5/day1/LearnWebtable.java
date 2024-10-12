package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/table.xhtml");
		String data = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
		System.out.println("Print 1st value :"+data);
		
		
		String countryName = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[2]/td[2]")).getText();
		System.out.println("Value get from 2row 2col :"+countryName);
		
		//row Count
		List<WebElement> rowSize = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		int rowCount = rowSize.size();
		System.out.println("Row  count :"+rowCount);
		
		//Col Count
		List<WebElement> colSize = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
		int colCount = colSize.size();
		System.out.println("Col Count : "+colCount);
		//to print all the data from table
		
		//index value start with 1
		//outer for loop is for rowcount
	for (int i = 1; i <=rowCount; i++) {
		
		//inner for loop
		for (int j = 1; j <=colCount ; j++) {
			
			String allData = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.println(allData);
		}
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
