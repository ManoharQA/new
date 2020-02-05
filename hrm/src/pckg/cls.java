package pckg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class cls {
	
	WebDriver bo;
	
	String bpath="http://apps.qaplanet.in/bugtracker/login_page.php";
  @Test(enabled=true,priority=1,groups="login")
  public void f() {
	  bo.findElement(By.xpath("//input[@name='username']")).sendKeys("edward");
	  bo.findElement(By.xpath("//input[@name='password']")).sendKeys("qwerty123");
	  bo.findElement(By.xpath("//input[@class='button']")).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	  bo=new FirefoxDriver();
	  bo.get(bpath);
  }

  @AfterMethod
  public void afterMethod() {
  }

}
