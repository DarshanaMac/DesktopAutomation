package pageObjects;

import org.openqa.selenium.Keys;
import testbase.TestBase;

public class MainApp extends TestBase
{
    public static String appString = "C:\\Program Files (x86)\\LRA\\PHILARIS RD\\WorkFlow.exe";
    //Login Screen
    public static String loginUsername = "txtUserName";
    public static String loginPassword = "txtPassword";
    public static String loginOKButton ="btnOK";

    //Home Screen
    public static String menuItemEntryBook = "Entry Book";
    public static String entryBookRegisterLand = "Registered Land";
    public static String menuItemTransaction = "Transaction";
    public static String transactionReturnToEntry = "Return To Entry";
    public static String returToEntryUnholdButton = "Unhold EPEB";

    //Register Land Screen
    public static String LinkEPEBTab = "Link EPEB";
    public static String addNewEPEBButton = "Add New EPEB";
    public static String createNewYESButton = "Yes";
    public static String presenterTabType = "cmb_UcP_PType";
    public static String presenterTabAddress = "Txt_UcP_PAddress";
    public static String presenterTabRemarks = "Txt_UcP_PRemarks";
    public static String presenterTabPresenterName = "1001";
    public static String presenterTabPhoneNo = "txt_UcP_PPhoneNo";
    public static String presenterTabOKButton = "btnInsPresenter";
    public static String presenterTabDocumentBarCode = "txt_barcode";
    public static String createNewEPEBConfirmation = "OK";
    public static String createNewEPEBRow1 = "Presenter Fill Row 0";
    public static String EPEBNo = "EPEB No. Row 0";

    //Transaction tab
    public static String createNewEPEBTransactionTab = "Transaction";
    public static String transactionTabMajorTransaction = "cmb_UcT_MajorTransaction";
    public static String transactionTabMinorTrans = "cmb_UcT_MinorTrans";
    public static String transactionTabCurrency = "cmbCurrency";
    public static String transactionTabConsideration = "txt_UcT_Consideration";
    public static String transactionTabAssessedValue = "txt_UcT_AssessedValue";
    public static String transactionTabButtonOk = "btnInsTransaction";
    public static String transactionTabConfirmation = "OK";
    public static String transactionTabRow1 = "Major Transaction Row 0";

    //Title Reference Tab
    public static String createNewEPEBTitleReferenceTab = "Title Reference";
    public static String btnVoidEntity ="toolStripButton2";
    public static String titleReferenceTabTitleType = "cmb_UCTR_TitleType";
    public static String titleReferenceTabTitleNo = "txt_UcTRTitleNo";
    public static String titleReferenceTabTitleDate = "txt_UCTR_TitleDate";
    public static String titleReferenceTabOwnerInfo = "Reason For Void Entry";
    public static String titleReferenceTabPopUp = "title bar";
    public static String titleReferenceTabOk = "btnInsTitleRef";
    public static String titleReferenceTabConfirmation = "OK";
    public static String titleReferenceOwnerInfo = "txtOwnerInfo";

    //Executed By Tab
    public static String createNewEPEBExecutedByTab = "Executed By";
    public static String executedByTabOwnerType = "cmb_UcIn_OwnerType";
    public static String executedByTabTxtExecutedBy = "1001";
    public static String executedByTabOk = "btnInsExecBy";
    public static String executedByTabConfirmation = "OK";

    //In Favor OF Tab
    public static String createNewEPEBInFavorOfTab = "In Favor Of";
    public static String inFavorOfTabOwnerType = "cmb_UcIn_OwnerType";
    public static String inFavorOfTabTxtExecutedBy = "1001";
    public static String inFavorOfTabOk = "btnInsInFavOf";
    public static String inFavorOfTabConfirmation = "OK";

    //Documents Tab
    public static String createNewEPEBDocumentsTab = "Documents";
    public static String documentsTabchkAllDocs = "chkAllDocs";
    public static String documentsTabCARInput = "btnCARInput";
    public static String documentsTabDocumentDate = "Document Date (mm/dd/yyyy) Row 0";
    public static String documentsTabDocumentDateEdit = "1050130";
    public static String documentsTabDocumentTxtRefNo = "txt_ref_No";
    public static String documentsTabDocumentTxtSerialNo = "txt_Serial_No";
    public static String documentsTabDocumentSave = "Save";
    public static String documentsTabDocumentBtnOK = "btn_OK";
    public static String dataNotExistPopupOK ="2";
    public static String documentsTabDocumentClose = "Close";
    public static String documentsTabConfirmation = "65535";

    //Documents Notarial
    public static  String createNewDocumentNotarialTab = "Document Notarial";
    public static  String documentNo = "txtNotDocNo";
    public static  String pageNo = "txtNotPageNo";
    public static  String bookNo = "txtNotBookNo";
    public static  String seriesOf = "txtNotSeriesNo";
    public static  String nameOfNotaryPublic = "txtNotaryName";
    public static  String notaryDate = "txtNotaryDate";
    public static  String placeOfNotary = "txtNotaryPlace";

    //Fees Tab
    public static  String feesTab = "Fees";
    public static  String addFeesButton = "btnAddRow";

    //Print process
    public static  String PrintBtn01 = "Preview";
    public static String  CarDetailsCloseButton="Close";
    public static  String PrintBtn02 = "Print";
    public static  String PrintBtn03 = "Print";
    public static  String FileSaveName ="File name:";
    public static  String FileSaveButton ="Save";
    public static  String InfoPopUpYes ="Yes";
    public static  String InfoPopUpOK ="OK";
    public static String TransXPATH="\"//Pane[@Name=\\\"Desktop 1\\\"][@ClassName=\\\"#32769\\\"]/Window[@AutomationId=\\\"frmMainMenuLatest\\\"][@Name=\\\"PHILARIS - Integrated Workflow [San Fernando, La Union]\\\"]/Pane[starts-with(@ClassName,\\\"WindowsForms10\\\")]/Window[@AutomationId=\\\"frmEPEBEntry\\\"][@Name=\\\"Registered Land\\\"]/Pane[@AutomationId=\\\"tlpMain\\\"]/Tab[@AutomationId=\\\"tabDetails\\\"][@Name=\\\"Presenter Name\\\"]/TabItem[@Name=\\\"Transaction\\\"]\"\n";
    //Trace Transaction
    public static String createNewEPEBRIOTab = "RIO";
    public static String executedByTabTraceTransaction = "Trace Transaction";
    public static String executedByTabEPEBNo = "txtEPEBNo";
    public static String executedByTabBtnSearch = "btnSearch";
    public static String executedByTabTrace = "Trace";

    //Web System
    public static String eCarWebTransactionDate = "//input[@name='Txt_TRANSACTION_DATE']";
    public static String eCarWebRdoCode = "//input[@name='txt_lbl_RDO_CODE']";
    public static String eCarWebRevenueOfficer = "//input[@name='txt_rev_off']";
    public static String eCarWebAmount = "//input[@name='txt_amt']";
    public static String eCarWebSellPrice = "//input[@name='txt_sell_price']";
    public static String eCarWebCarNum = "//input[@name='txt_car_num']";
    public static String eCarWebTransactionNo = "//input[@name='txt_Trans_no']";
    public static String eCarWebTaxType = "//input[@name='txt_Tax_Type']";
    public static String eCarWebTaxDeclarationNo = "//input[@name='txt_tax_dec_type']";
    public static String eCarWebOctTctCctNo = "//input[@name='txt_num']";
    public static String eCarWebFirstName = "//input[@name='txt_first_name']";
    public static String eCarWebBuyesSellType = "//input[@name='txt_buyes_sell_type']";
    public static String eCarWebTin = "//input[@name='txt_tin']";
    public static String eCarWebAccTbl = "//input[@name='txt_form_num']";
    public static String eCarWebAreaSize = "//input[@name='txt_areasize']";
    public static String eCarWebBarcodeRefNo = "//input[@name='txt_bar_ref_num']";
    public static String eCarWebRodID = "//input[@name='txt_RoD_ID']";
    public static String eCarWebSubmit = "//input[@name='btn_Submit']";
    public static String eCarWebStatusMsg = "//span[@id='lbl_Status']";
    public static String textReason ="txtReason";
    public static String EPEBID="EPEB ID Row 0";
    public void PickTransactionMenuItem(String menuItemName)
    {
        if(menuItemName.equalsIgnoreCase("Return To Entry")){
            PressKeysDesktop("Transaction", Keys.ARROW_DOWN);
            PressKeysDesktop("Transaction", Keys.ARROW_DOWN);
            PressKeysDesktop("Transaction", Keys.ARROW_DOWN);
            PressKeysDesktop("Transaction", Keys.ARROW_DOWN);
            PressKeysDesktop("Transaction", Keys.ARROW_DOWN);
            PressKeysDesktop("Transaction", Keys.ARROW_DOWN);
            PressKeysDesktop("Transaction", Keys.ARROW_DOWN);
            PressKeysDesktop("Transaction", Keys.ENTER);
        }
    }

    //POS System
    public static  String enterChangeFund = "Enter Change Fund";
    public static  String passwordPOS = "1008";
    public static  String usernamePOS = "1007";
    public static  String signInPOS = "1003";
    public static  String startUpMsgPOS = "Auto End of Day Operation";
    public static  String startUpMsgPOSOkButton = "OK";
    public static  String startDayPopUp = "1001";
    public static  String startDayPopUpOk = "1003";
    public static  String amountDisplayOk = "[2A.7C0596]";
    public static  String optionButton = "Option";
    public static  String reprintLastTransaction = "Reprint Last Transaction";
    public static  String cancelType = "11";
    public static  String epebId = "12";
    public static  String secondPopupCancelButton = "Cancel";
}
