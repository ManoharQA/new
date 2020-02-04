package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dprov {
  @Test(dataProvider="LoginCredentials")
  public void Tc1(String uId,String pd) {
	  WebDriver bo=new FirefoxDriver();
	  bo.get("http://apps.qaplanet.in/bugtracker/login_page.php");
	  bo.findElement(By.xpath("//input[@name='username']")).sendKeys("edward");
	  bo.findElement(By.xpath("//input[@name='password']")).sendKeys("qwerty123");
	  bo.findElement(By.xpath("//input[@class='button']")).click();
	  bo.close();
  }
  @DataProvider
  public Object[][] LoginCredentials(){
	  Object[][]Cred=new Object[4][2];
	  Cred[0][0]="qaplanet1";
	  Cred[0][1]="lab1";
	  
	  Cred[1][0]="qaplanet1";
	  Cred[1][1]="lab1";
	  
	  Cred[2][0]="qaplanet";
	  Cred[2][1]="lab1";
	  
	  Cred[3][0]="qaplanet";
	  Cred[3][1]="lab1";
	  return Cred;
	  
	  
  }
}
