package testcases;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import com.sun.deploy.security.SessionCertStore;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.util.Set;
import testbase.TestBase;

public class LinkTest extends TestBase{

	private static WindowsDriver Session = null;

	@Test
	public void logintest() throws InterruptedException, MalformedURLException {
//

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app", "C:\\Program Files (x86)\\LRA\\PHILARIS RD\\WorkFlow.exe");
		Session = new WindowsDriver(new URL("<url>"), capabilities);
		Session.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		String parentHandle = Session.getWindowHandle();
//		for (String winHandle : Session.getWindowHandles()) {
//			Session.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
//		}

		Set handles = Session.getWindowHandles();
		System.out.println(handles);
		for (String handle1 : Session.getWindowHandles()) {

			System.out.println(handle1);

			Session.switchTo().window(handle1);

		}


		//OpenDesktopApp("C:\\Program Files (x86)\\LRA\\PHILARIS RD\\WorkFlow.exe");
		Thread.sleep(80);
		Session.findElementByAccessibilityId("txtUserName").sendKeys("test.admin");
	Session.findElementByAccessibilityId("txtUserName").sendKeys(Keys.TAB);
		Thread.sleep(7000);

		Session.findElementByAccessibilityId("txtPassword").sendKeys("1");
		Session.findElementByAccessibilityId("btnOK").click();
		Thread.sleep(4000);
		Session.findElementByName("Transaction").click();
		Session.findElementByName("Transaction").sendKeys(Keys.ARROW_DOWN);
		Session.findElementByName("Transaction").sendKeys(Keys.ARROW_DOWN);
		Session.findElementByName("Transaction").sendKeys(Keys.ARROW_DOWN);
		Session.findElementByName("Transaction").sendKeys(Keys.ARROW_DOWN);
		Session.findElementByName("Transaction").sendKeys(Keys.ARROW_DOWN);
		Session.findElementByName("Transaction").sendKeys(Keys.ARROW_DOWN);
		Session.findElementByName("Transaction").sendKeys(Keys.ARROW_DOWN);
		Session.findElementByName("Transaction").sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	
}
