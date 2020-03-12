package testcases;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pageObjects.MainApp;
import testbase.TestBase;

public class FullWorkFlow extends TestBase
{
    String EPEBno;
    MainApp mainapp = new MainApp();
    @Test
    public void fullWorkFlow() throws Exception
    {
        OpenDesktopApp("C:\\Program Files (x86)\\LRA\\WorkFlow.exe");
        Thread.sleep(80);
        FillDesktop(mainapp.loginUsername, "test.admin");
        FillDesktop(mainapp.loginPassword,"1");
        ClickDesktop(mainapp.loginOKButton);
        Thread.sleep(80);
        ClickDesktop(mainapp.menuItemEntryBook);
        ClickDesktop(mainapp.entryBookRegisterLand);
        Thread.sleep(50);
        //Start filling presenter tab
        ClickDesktop(mainapp.addNewEPEBButton);
        Thread.sleep(20);
        ClickDesktop(mainapp.createNewYESButton);
        ClickDesktop(mainapp.presenterTabType);

        FillDesktop(mainapp.presenterTabType, "OWNER");
        FillDesktop(mainapp.presenterTabPresenterName, "TESTER");
        FillDesktop(mainapp.presenterTabAddress, "QUEZON CITY");
        FillDesktop(mainapp.presenterTabPhoneNo, "444-4444");
        FillDesktop(mainapp.presenterTabRemarks, "SSS ID");
        ClickDesktop(mainapp.presenterTabDocumentBarCode);
        FillDesktop(mainapp.presenterTabDocumentBarCode, "*");
        ClickDesktop(mainapp.presenterTabOKButton);
        Thread.sleep(50);
        PressKeysDesktop(mainapp.createNewEPEBConfirmation, Keys.ENTER);
        IsDisplayedDesktop(mainapp.createNewEPEBRow1);

        //Web Tnregation

        OpenBrowser("<web url>");
        SwitchToIFrame("urIframe");
        Click(mainapp.eCarWebTransactionDate);
        Fill(mainapp.eCarWebTransactionDate,"5-15-2019");
        Fill(mainapp.eCarWebRdoCode,"421");
        Fill(mainapp.eCarWebRevenueOfficer,"Tester");
        Fill(mainapp.eCarWebAmount,"5,000,000");
        Fill(mainapp.eCarWebSellPrice,"25,000");
        Fill(mainapp.eCarWebCarNum,"C-2019-420-648951-M");
        Fill(mainapp.eCarWebTransactionNo,"T-2019-420-648951-M");
        Fill(mainapp.eCarWebTaxType,"DOC stamps");
        Fill(mainapp.eCarWebTaxDeclarationNo,"VGY2019420648951");
        Fill(mainapp.eCarWebOctTctCctNo,"CCT|FP-7404");
        Fill(mainapp.eCarWebFirstName,"Tester");
        Fill(mainapp.eCarWebBuyesSellType,"0001");
        Fill(mainapp.eCarWebTin,"213-879-465");
        Fill(mainapp.eCarWebAccTbl,"845895495");
        Fill(mainapp.eCarWebAreaSize,"12");
        Fill(mainapp.eCarWebBarcodeRefNo,"REF54085748570475");
        Fill(mainapp.eCarWebRodID,"3435454");
        Click(mainapp.eCarWebSubmit);
        Thread.sleep(50);
        String StatusMsg = GetText(mainapp.eCarWebStatusMsg);
        System.out.println(StatusMsg);
        Thread.sleep(50);

        //Desktop part
        ClickDesktop(mainapp.createNewEPEBTitleReferenceTab);
        FillDesktop(mainapp.titleReferenceTabTitleNo,"REF54085748570475");
        ClickDesktop(mainapp.btnVoidEntity);
        SwitchToWindow();
        FillDesktop(mainapp.textReason,StatusMsg);
        Thread.sleep(50);
        String EPEBID= GetTextDesktop(mainapp.EPEBID);
        OpenBrowser("<web url>");
        SwitchToIFrame("urIframe");
        Click(mainapp.eCarWebTransactionDate);
        Fill(mainapp.eCarWebTransactionDate,EPEBID);

    }
}
