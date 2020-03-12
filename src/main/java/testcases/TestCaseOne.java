package testcases;

import org.testng.annotations.Test;
import pageObjects.MainApp;
import testbase.TestBase;

public class TestCaseOne extends TestBase
{
    MainApp mainapp = new MainApp();
    @Test
    public void login() throws Exception
    {
        OpenDesktopApp(mainapp.appString);
        Thread.sleep(250);
       // IsDisplayedDesktop(mainapp.loginUsername);
        FillDesktop(mainapp.loginUsername, "test.admin");
    }
}
