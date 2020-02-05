package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LogIn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.drievr", "‪D:\\geckodriver.exe");
WebDriver bo=new FirefoxDriver();





bo.get("https://www.hdfcbank.com/");
Actions acr= new Actions(bo);


Thread.sleep(3000);
acr.moveToElement(bo.findElement(By.xpath("//a[@id='popupBoxClose']"))).perform();
bo.findElement(By.xpath("//a[@id='popupBoxClose']")).click();
Thread.sleep(3000);
acr.moveToElement(bo.findElement((By.xpath("//button[@class='btn btn-primary login-btn ng-scope']")))).perform();
Thread.sleep(3000);
bo.findElement(By.xpath("//button[@class='btn btn-primary login-btn ng-scope']")).click();
Thread.sleep(3000);
bo.close();



	}

}
