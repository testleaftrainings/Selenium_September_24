package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSnap {

	public static void main(String[] args) throws IOException, InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		
		Thread.sleep(5000);
		WebElement sc = driver.findElement(By.id("Login"));
		//step 1- create new Folder inside project
		
		//step2
		//File scr = driver.getScreenshotAs(OutputType.FILE);
		File scr = sc.getScreenshotAs(OutputType.FILE);
		
		//step3 
		File dst=new File("./Snaps/ts1.png");
		
		//step 4
		FileUtils.copyFile(scr, dst);
	}

}
