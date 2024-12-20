package week6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {

	public RemoteWebDriver driver;
	//step3 -create variable
	public String data;
	
	@Parameters({"url","pass","user","browser"})
	//order can be change from xml file
	
	@BeforeMethod
	public void preCondition(String Url,String passWord,String uName,String browser) {
		//what order you given inside the @Parameters the same order should be maintain in method level
	
		
		if(browser.equalsIgnoreCase("chrome")) {
		driver  = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(passWord);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();

	}
	
	//step1 cut the dataprovider code from createlead class and paste inside PSM
	@DataProvider(name="getName")
	public String[][] fetchData() throws IOException{
		//step4- pass inside that method
		return IntegrationWithTC.readExcel(data);

	}	
	
}
