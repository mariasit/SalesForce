package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class CreateSalesForceAccountTest extends BaseWithFactoryTest{

    @Test
    public void createAccountTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToSalesforce();
        System.out.println("");
    }
    
}
