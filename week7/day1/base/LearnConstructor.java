package base;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnConstructor {
//this (keyword) - refer the current class variable,method and constructor
//super(keyword) - refer the parent class variable ,methods and constructor	
	String url;
	
	//default 
	public LearnConstructor() {
		ChromeDriver driver=new ChromeDriver();
		System.out.println("Default");
	}
	
	public LearnConstructor(String url) {
		//default constructor call
		this();
		System.out.println("Parameterization");
		ChromeDriver driver=new ChromeDriver();
		driver.get(url);
		this.url=url;
		
	}
	public static void main(String[] args) {
		/*
		 * LearnConstructor lc=new LearnConstructor();
		 * System.out.println("Default value :"+lc.url);
		 */
		LearnConstructor lc2=new LearnConstructor("https://testleaf.com");
	System.out.println(lc2.url);
	}
	
}
