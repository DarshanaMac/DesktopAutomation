package testcases;

import org.testng.annotations.Test;
import pageObjects.MainApp;
import testbase.TestBase;

public class BIR_7 extends TestBase {

    MainApp mainapp = new MainApp();
    @Test
    public void testcase_bir7() throws Exception
    {
        OpenDesktopApp("C:\\Program Files (x86)\\LRA\\WorkFlow.exe");
        Thread.sleep(80);
        FillDesktop(mainapp.loginUsername, "test.admin");
        FillDesktop(mainapp.loginPassword,"123");
        ClickDesktop(mainapp.loginOKButton);
        Thread.sleep(80);
        ClickDesktop(mainapp.menuItemTransaction);
        mainapp.PickTransactionMenuItem(mainapp.transactionReturnToEntry);
        Thread.sleep(3000);
        IsDisplayedDesktop(mainapp.returToEntryUnholdButton);

    }
}
