package testcases;

import org.testng.annotations.Test;
import pageObjects.BIR_App;
import testbase.TestBase;

public class BIR_1 extends TestBase
{
    BIR_App birApp = new BIR_App();

    @Test
    public void BIR_TestCase_1()
    {
        OpenBrowser(birApp.appURL);
        SwitchToIFrame(birApp.iFrame);
        Fill(birApp.transactionDate,"10/10/2016");
        Fill(birApp.rdoCode,"123");
        Fill("//input[@name='txt_rev_off']"," JOY R. BALUYOT");
        Fill("//input[@name='txt_amt']","10000");
        Fill("//input[@name='txt_sell_price']","2000");
        Fill("//input[@name='txt_car_num']","12-888");
        Fill("//input[@name='txt_Trans_no']"," T-2013-048-1234567-M");
        Fill("//input[@name='txt_Tax_Type']","CGT");
        Fill("//input[@name='txt_tax_dec_type']","JUAN DELA");
        Fill("//input[@name='txt_num']","111-000-12345-001");
        Fill("//input[@name='txt_first_name']","Test");
        Fill("//input[@name='txt_buyes_sell_type']","SELLER:0002");
        Fill("//input[@name='txt_tin']","111-000-12345-001");
        Fill("//input[@name='txt_form_num']","202012");
        Fill("//input[@name='txt_areasize']","20");
        Fill("//input[@name='txt_bar_ref_num']","10203405689203451032");
        Fill("//input[@name='txt_RoD_ID']","22255");
        Click("//input[@type='submit']");
    }
}