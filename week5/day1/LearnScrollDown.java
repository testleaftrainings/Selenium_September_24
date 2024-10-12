package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement se = driver.findElement(By.linkText("Facebook"));
		
		Actions act=new Actions(driver);
		act.scrollToElement(se).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sell on Amazon")).click();
		
		
		
	}

}
