package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Svc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
WebDriver bo=new FirefoxDriver();
bo.get("https://www.facebook.com/");

String t=bo.getTitle();
System.out.println(t);

String ps=bo.getPageSource();
System.out.println(ps);

String curl=bo.getCurrentUrl();
System.out.println(curl);

bo.navigate().refresh();
bo.navigate().to("https://www.flipkart.com/?gclid=Cj0KCQiA6IHwBRCJARIsALNjViUg-0r6ACbhZrqgvW1OPcc09tarejoqtyaW2cR46Ib451wj_fG61JwaAswZEALw_wcB&ef_id=Cj0KCQiA6IHwBRCJAR");
bo.navigate().back();

bo.close();



	}

}
