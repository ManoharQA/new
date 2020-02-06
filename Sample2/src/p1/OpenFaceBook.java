package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.get("https://www.facebook.com/");
		Thread.sleep(1000);
		bo.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("Manohar");
		
		
		bo.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("Naguru");
		bo.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("manoharjcnaguru910@gmail.com");
		bo.findElement(By.xpath("//input[@id='u_0_u']")).sendKeys("manoharjcnaguru910@gmail.com");
		bo.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("Virat910");
	
	}

}
