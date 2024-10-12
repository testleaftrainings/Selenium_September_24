package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnMoveToElement {

	public static void main(String[] args) {
		ChromeOptions cp=new ChromeOptions();
		cp.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(cp);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		WebElement mouseOver = driver.findElement(By.xpath("//span[text()='MEN']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(mouseOver).perform();
		
		driver.findElement(By.linkText("Jackets & Coats")).click();
		driver.findElement(By.xpath("//label[contains(@Class,'facet')]")).click();

		
		
	}

}
