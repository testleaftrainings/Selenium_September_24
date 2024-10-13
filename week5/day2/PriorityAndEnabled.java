package week5.day2;

import org.testng.annotations.Test;

public class PriorityAndEnabled {

	@Test(priority = 2)
	public void createLead() {
 System.out.println("CreateLead");
	}
	
	@Test(priority = -1,enabled = false)
	public void editLead() {
		System.out.println("EditLead");
	}
	
	//0
	@Test(enabled = false)
	public void deleteLead() {	
System.out.println("DeleteLead");
	}
}
