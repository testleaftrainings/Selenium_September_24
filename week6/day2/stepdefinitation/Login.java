package stepdefinitation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	public ChromeDriver driver;
	
	
	@Given("Launch the browser and Load the url")
	public void launch_the_browser_and_load_the_url() {
		 driver  = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   
	}

	@When("Enter the username as {string}")
	public void enter_the_username_as_demo_csr(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}

	@When("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}

	@When("Click on loginbutton")
	public void click_on_loginbutton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	
	}

	@Then("Verify the title")
	public void verify_the_title() {
	 String title = driver.getTitle();
	 
	 if(title.contains("Leaftaps")) {
		 System.out.println("Login is successfull");
	 }else {
		 System.out.println("Login is not succesfull");
	 }
	}
	
	
	@But("Verify the title login is not")
	public void negativeCase() {
		String text = driver.findElement(By.tagName("h2")).getText();
		
		if(text.contains("Login")) {
			System.out.println("Login is not successful");
		}else {
			System.out.println("Login is successful");
		}
	}

	

}
