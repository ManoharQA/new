package rDb;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Newtest {
	WebDriver bo;
	String bpath = "https://www.redbus.in/";

	@Test(enabled = true, priority = 1, groups = "login")
	public void f() {
		bo.findElement(By.xpath("//a[contains(text(),'BUS TICKETS')]")).click();
		bo.findElement(By.xpath("//input[@id='txtSource']")).sendKeys("Nellore (All Locations)");
		bo.findElement(By.xpath("//input[@id='txtDestination']")).sendKeys("Hyderabad (All Locations)");
		bo.findElement(By.xpath("//input[@id='txtOnwardCalendar']")).sendKeys("28-Jan-2020");
		bo.findElement(By.xpath("//input[@id='txtReturnCalendar']")).sendKeys("30-Jan--2020");
		bo.findElement(By.xpath("//button[@class='search-btn searchBuses']")).click();
		//Assert.assertEquals(bo.getTitle(),"Online Bus Tickets Booking" );
	}
	@Test(enabled=true,priority=2,groups="NextPage")
	public void f2() {
		bo.findElement(By.xpath("//a[@id='redBus Bus Hire']")).click();
		
	}

	@BeforeMethod
	public void beforeMethod() {
		//System.setProperty("webdriver.gecko.driver", "‪D:\\geckodriver.exe");
		bo = new FirefoxDriver();
		bo.get(bpath);
	}

	@AfterMethod
	public void afterMethod() {
		bo.close();
	}

}
