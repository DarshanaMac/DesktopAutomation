package testcases;

import io.appium.java_client.windows.WindowsDriver;
import org.apache.poi.hssf.record.TableRecord;
import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import pageObjects.MainApp;
import testbase.TestBase;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class FullWorkFlow_POC extends TestBase {
    String EPEBno;
    MainApp mainapp = new MainApp();
    private static WindowsDriver CalculatorSession = null;

    @Test
    public void fullWorkFlowPOC() throws Exception {

        OpenDesktopApp("C:\\Program Files (x86)\\LRA\\PHILARIS RD\\WorkFlow.exe");
        Thread.sleep(80);
        FillDesktop(mainapp.loginUsername, "test.admin");
        FillDesktop(mainapp.loginPassword, "1");
        ClickDesktop(mainapp.loginOKButton);
        Thread.sleep(80);
        ClickDesktop(mainapp.menuItemEntryBook);
        ClickDesktop(mainapp.entryBookRegisterLand);
        Thread.sleep(50);

        //Start filling presenter tab
        ClickDesktop(mainapp.addNewEPEBButton);
        Thread.sleep(20);
        ClickDesktop(mainapp.createNewYESButton);
        EPEBno = GetTextDesktop(mainapp.EPEBNo);
        System.out.println("EPEBno:--------" + EPEBno);
        ClickDesktop(mainapp.presenterTabType);

        //Auto fill
        //FillDesktop(mainapp.presenterTabType, "OWNER");
        FillDesktop(mainapp.presenterTabPresenterName, "ABCTESTER");
        FillDesktop(mainapp.presenterTabAddress, "QUEZON CITY");
        FillDesktop(mainapp.presenterTabPhoneNo, "444-4444");
        FillDesktop(mainapp.presenterTabRemarks, "SSS ID");
        ClickDesktop(mainapp.presenterTabDocumentBarCode);
        //  FillDesktop(mainapp.presenterTabDocumentBarCode, "*");
        ClickDesktop(mainapp.presenterTabOKButton);
        Thread.sleep(50);
        PressKeysDesktop(mainapp.createNewEPEBConfirmation, Keys.ENTER);
        Thread.sleep(5000);

        // Transaction Tab
        Runtime.getRuntime().exec("C:\\Users\\Administrator\\Desktop\\ClickTab.exe");
        //Click_ByImage("C:\\Users\\Administrator\\Desktop\\techone\\");
        FillDesktop(mainapp.transactionTabMajorTransaction, "Annotation on Certificate");
        FillDesktop(mainapp.transactionTabMinorTrans, "Sale (Annotation)");
        FillDesktop(mainapp.transactionTabConsideration, "2,000,000");
        FillDesktop(mainapp.transactionTabAssessedValue, "5,000,000");
        ClickDesktop(mainapp.transactionTabButtonOk);
        PressKeysDesktop(mainapp.createNewEPEBConfirmation, Keys.ENTER);

        //Title Referance Tab
        ClickDesktop(mainapp.createNewEPEBTitleReferenceTab);
        Thread.sleep(1000);
        FillDesktop(mainapp.titleReferenceTabTitleType, "Original");
        String titleNo = "FP-5515";
        FillDesktop(mainapp.titleReferenceTabTitleNo, titleNo);

        //Doesnot respond to the keys click
        ClickDesktop(mainapp.titleReferenceOwnerInfo);
        Thread.sleep(3000);
        PressKeysDesktop(mainapp.titleReferenceTabTitleNo, Keys.TAB);
        ClickDesktop(mainapp.titleReferenceTabOk);
        Thread.sleep(3000);
        PressKeysDesktop(mainapp.createNewEPEBConfirmation, Keys.ENTER);

        //Executed By Tab
        ClickDesktop(mainapp.createNewEPEBExecutedByTab);
        Thread.sleep(1000);
        ClickDesktop(mainapp.executedByTabOk);

        //In Favor Of Tab
        ClickDesktop(mainapp.createNewEPEBInFavorOfTab);
        Thread.sleep(1000);
        FillDesktop(mainapp.inFavorOfTabTxtExecutedBy, "TESTER");
        ClickDesktop(mainapp.inFavorOfTabOk);

        //Web Tnregation
        OpenBrowser("<localhsot_url>");
        SwitchToIFrame("urIframe");
        Click(mainapp.eCarWebTransactionDate);
        Fill(mainapp.eCarWebTransactionDate, "5-15-2019");
        Fill(mainapp.eCarWebRdoCode, "421");
        Fill(mainapp.eCarWebRevenueOfficer, "Tester");
        Fill(mainapp.eCarWebAmount, "5,000,000");
        Fill(mainapp.eCarWebSellPrice, "25,000");
        Fill(mainapp.eCarWebCarNum, "C-2019-420-648951-M");
        Fill(mainapp.eCarWebTransactionNo, "T-2019-420-648951-M");
        Fill(mainapp.eCarWebTaxType, "DOC stamps");
        Fill(mainapp.eCarWebTaxDeclarationNo, "VGY2019420648951");
        Fill(mainapp.eCarWebOctTctCctNo, "CCT|" + titleNo);
        Fill(mainapp.eCarWebFirstName, "Tester");
        Fill(mainapp.eCarWebBuyesSellType, "0001");
        Fill(mainapp.eCarWebTin, "213-879-465");
        Fill(mainapp.eCarWebAccTbl, "845895495");
        Fill(mainapp.eCarWebAreaSize, "12");
        Fill(mainapp.eCarWebBarcodeRefNo, "54085748570475");
        Fill(mainapp.eCarWebRodID, "3435454");
        Click(mainapp.eCarWebSubmit);
        Thread.sleep(50);
        String StatusMsg = GetText(mainapp.eCarWebStatusMsg);
        System.out.println(StatusMsg);
        Thread.sleep(50);
        BrowserQuit();

        //Documents Tab
        ClickDesktop(mainapp.createNewEPEBDocumentsTab);
        Thread.sleep(2000);
        ClickDesktop(mainapp.documentsTabchkAllDocs);
        Runtime.getRuntime().exec("C:\\Users\\Administrator\\Desktop\\Date.exe");
        Thread.sleep(7000);
        ClickDesktop(mainapp.documentsTabCARInput);
        ClickDesktop(mainapp.documentsTabCARInput);
        Thread.sleep(5000);
        FillDesktop(mainapp.documentsTabDocumentTxtRefNo, "54085748570475");
        FillDesktop(mainapp.documentsTabDocumentTxtSerialNo, "54085748570475");
        //replace with fire event enter
        ClickDesktop(mainapp.documentsTabDocumentBtnOK);
        Thread.sleep(2000);
        ClickDesktop(mainapp.dataNotExistPopupOK);
        Thread.sleep(4000);
        Robot_Enter(); //Need to command handle unexpected popup
        Thread.sleep(4000);
        Robot_Enter();
        Runtime.getRuntime().exec("C:\\Users\\Administrator\\Desktop\\SaveConfirm.exe");
        Thread.sleep(2000);
        Robot_Enter();
        Thread.sleep(4000);
        Robot_Enter();
        Thread.sleep(4000);
        Robot_Enter();
        Thread.sleep(4000);
        Robot_Enter();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\Administrator\\Desktop\\Close.exe");
        Thread.sleep(2000);


        //Document Notarial
        ClickDesktop(mainapp.createNewDocumentNotarialTab);
        Thread.sleep(1000);
        FillDesktop(mainapp.documentNo, "A1");
        FillDesktop(mainapp.pageNo, "A2");
        FillDesktop(mainapp.bookNo, "A3");
        FillDesktop(mainapp.seriesOf, "2019");
        FillDesktop(mainapp.nameOfNotaryPublic, "NOTARIAL");
        FillDesktop(mainapp.notaryDate, "08/04/2019");
        FillDesktop(mainapp.placeOfNotary, "MARSDNA CITY");

        //Fees Tab
        ClickDesktop(mainapp.feesTab);
        ClickDesktop(mainapp.addFeesButton);
        ClickDesktop(mainapp.addFeesButton);
        ClickDesktop(mainapp.documentsTabDocumentSave);
        Thread.sleep(10000);
        Robot_Enter();
        Robot_Enter();
        System.out.println("###########");

        Thread.sleep(4000);
        Robot_Enter();
        Thread.sleep(3000);
        Robot_Enter();
        //Print Process
        System.out.println("^^^^^^");
        //Thread.sleep(5000);
        Runtime.getRuntime().exec("C:\\Users\\Administrator\\Desktop\\PrintOneandTwoandYes.exe"); //Need to click print 1 manually
         Thread.sleep(600000);
        Thread.sleep(4000);
        Robot_Enter();
        Thread.sleep(2000);
        Robot_Enter();

        System.out.println("****Print1*****");
        // Robot_Enter();
        Thread.sleep(5000);
        ClickDesktop(mainapp.PrintBtn02); // need to improve
        ClickDesktop(mainapp.PrintBtn02);
        ClickDesktop(mainapp.PrintBtn02);
        System.out.println("***** Print2 *******");
        Thread.sleep(10000);
        Robot_Enter();
        Thread.sleep(3000);
        Thread.sleep(3000);
        Robot_Enter();
        Thread.sleep(5000);
        Robot_Enter();
        //POS System
        POS_Operation();
    }
}
