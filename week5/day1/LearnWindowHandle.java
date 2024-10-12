package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		String title = driver.getTitle();
		System.out.println("Title of parentWindow :"+title);
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		
		//convert set into list
		List<String> childWindow =new ArrayList<String>(allWindows);
		driver.switchTo().window(childWindow.get(1));
		
		String title2 = driver.getTitle();
		System.out.println("ChildWindow title :"+title2);
		
		driver.findElement(By.id("email")).sendKeys("dilip@testleaf.com");
		
		//close child window -its close only current window
		driver.close();
		
		//it will switch back to parent window
		driver.switchTo().window(childWindow.get(0));
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		//going to convert set into list
		
		//quit- it will close all opened window in the browser
		//driver.quit();
		
	}

}
