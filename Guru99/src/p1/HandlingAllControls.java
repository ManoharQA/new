package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandlingAllControls {
	static WebDriver driver;

	@Test(priority = 0)
	public void EdurekaProfile() throws InterruptedException {
		System.setProperty("webdriver.gecko.drivcer", "‪D:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.edureka.co/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[@class='signin top-signup register-user giTrackElementHeader hidden-xs']"))
				.click();
		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Actions acr = new Actions(driver);
		acr.moveToElement(driver.findElement(By.xpath("//input[@id='sg_popup_email']")));
		Thread.sleep(2000);
		acr.click();
		acr.sendKeys("Manohar010697@gmail.com");
		Thread.sleep(2000);
		acr.build().perform();
		acr.moveToElement(driver.findElement(By.xpath("//input[@id='sg_popup_phone_no']")));
		Thread.sleep(2000);
		acr.click();
		acr.sendKeys("6281172887");
		Thread.sleep(2000);
		acr.build().perform();
		acr.moveToElement(driver.findElement(By.xpath("//span[@class='login-vd']")));
		Thread.sleep(2000);
		acr.click();
		acr.build().perform();
		acr.moveToElement((driver.findElement(By.xpath("//input[@id='si_popup_email']"))));
		acr.click();
		acr.sendKeys("Manoharjcnaguru910@gmail.com");
		acr.build().perform();
		acr.moveToElement(driver.findElement(By.xpath("//input[@id='si_popup_passwd']")));
		Thread.sleep(2000);
		acr.click();
		acr.sendKeys("Virat910");
		acr.moveToElement(driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")));
		Thread.sleep(2000);
		acr.click();
		acr.build().perform();
		acr.moveToElement(driver.findElement(By.xpath("//a[@class='dropdown-toggle trackButton']//img[@class='img30']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='professional_details']//i[@class='icon-pr-edit']")).click();
		acr.click();
	    acr.build().perform();
	
	
	}
}
