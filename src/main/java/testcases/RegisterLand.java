package testcases;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import testbase.TestBase;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class RegisterLand extends TestBase {


    private static WindowsDriver Session = null;

    @Test
    public void RegisterLand() throws InterruptedException, MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "C:\\Program Files (x86)\\LRA\\WorkFlow.exe");
        Session = new WindowsDriver(new URL("<url>"), capabilities);
        Session.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Set handles = Session.getWindowHandles();
        System.out.println(handles);
        for (String handle1 : Session.getWindowHandles()) {
            System.out.println(handle1);
            Session.switchTo().window(handle1);
        }
        Session.findElementByAccessibilityId("txtUserName").sendKeys("test.admin");
        Session.findElementByAccessibilityId("txtUserName").sendKeys(Keys.TAB);
        Thread.sleep(7000);

        Session.findElementByAccessibilityId("txtPassword").sendKeys("123");
        Session.findElementByAccessibilityId("btnOK").click();
        Thread.sleep(7000);
        Session.findElementByName("Entry Book").click();
        Session.findElementByName("Registered Land").click();
        Thread.sleep(7000);
       
        Session.quit();

    }
}
