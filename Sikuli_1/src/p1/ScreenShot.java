package p1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class ScreenShot {

	public static void main(String[] args) throws FindFailed, IOException {

		Screen scr = new Screen();

		Pattern image1 = new Pattern("‪C:\\Users\\jc\\Pictures\\gmail.logo.png");
		Pattern image2 = new Pattern("‪C:\\Users\\jc\\Pictures\\emailnum.1.png");
		Pattern image3 = new Pattern("‪C:\\Users\\jc\\Pictures\\pswrd.1.png");
		Pattern image4 = new Pattern("‪C:\\Users\\jc\\Pictures\\nextclick1.png");

		WebDriver bo = new FirefoxDriver();
		bo.manage().window().maximize();

		bo.get("http://www.google.com");

		scr.click(image1);
		scr.type(image2, "manohar010697@gmail.com");
		scr.type(image3, "6281172887");
		scr.click(image4);

	}

}
