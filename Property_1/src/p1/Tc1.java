package p1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Properties obj=new Properties();
FileInputStream objfile=new FileInputStream(System.getProperty("user.dir")+"/src/p1/ss.properties");
obj.load(objfile);
String bpaths=obj.getProperty("bpath");
String uids=obj.getProperty("uid");
String pds=obj.getProperty("pd");
String lgs=obj.getProperty("lg");
System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
WebDriver bo=new FirefoxDriver();
bo.get(bpaths);
bo.findElement(By.xpath(uids)).sendKeys("edward");
bo.findElement(By.xpath(pds)).sendKeys("qwerty123");
bo.findElement(By.xpath(lgs)).click();
bo.close();



	}

}
