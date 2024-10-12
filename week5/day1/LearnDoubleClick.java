package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDoubleClick {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		
		//frame
		driver.switchTo().frame("iframeResult");
		
		WebElement dc = driver.findElement(By.xpath("//p[contains(text(),'Double-click')]"));
		
		//
		Actions act=new Actions(driver);
		
		act.doubleClick(dc).perform();
		
	
	}

}
