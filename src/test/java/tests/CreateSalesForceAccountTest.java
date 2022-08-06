package tests;

import models.NewAccountModel;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.LoginPage;
import testdata.PrepareNewAccountData;

public class CreateSalesForceAccountTest extends BaseWithFactoryTest{

    @Test
    public void createAccountTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToSalesforce();
        AccountsPage accountsPage = new AccountsPage(driver);
        NewAccountModel accountModel = PrepareNewAccountData.getValidData();
        accountsPage
                .openAccountPage()
                .openAccountModalPage()
                .fillInAccountForm(accountModel);

        System.out.println("");
    }
    
}
