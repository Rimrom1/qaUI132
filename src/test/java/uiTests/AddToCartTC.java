package uiTests;

import Selenium.intertop.page_factory.Login.BO.LoginBO;
import Selenium.intertop.page_factory.addToCart.BO.AddToCatrBO;
import Selenium.intertop.paralel_run.BrowserFactory;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test_helper.BaseTest;

@Test
public class AddToCartTC extends BaseTest {

    @DataProvider(parallel = true)
    public static Object[][] browserDataProvider() {
        return new Object[][]{
                {"chrome"}
                //,{"firefox"}
                //,{"Opera"}
                //,{"IE"}
                //,{"Safari"}
        };
    }

    @Test(dataProvider = "browserDataProvider")
    @Severity(SeverityLevel.CRITICAL)
    public void AddToCartTest(String browserName) {
        BrowserFactory.initDriver(browserName);



        LoginBO loginBO = new LoginBO();
        //Step2
        Assert.assertTrue(loginBO.login(),"login Failed!");


        AddToCatrBO addToCatrBO = new AddToCatrBO();
        //Step2
        Assert.assertTrue(addToCatrBO.addToCart(),"add to cart Failed!");
    }
}


