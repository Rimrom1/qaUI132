package uiTests;

import Selenium.intertop.page_factory.Like.BO.LikeBO;
import Selenium.intertop.page_factory.Login.BO.LoginBO;
import Selenium.intertop.paralel_run.BrowserFactory;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test_helper.BaseTest;

@Test
public class LikeTC extends BaseTest {

    @DataProvider(parallel = true)
    public static Object[][] browserDataProvider() {
        return new Object[][]{
                {"chrome"},
                //,{"firefox"}
                {"Opera"}
                //,{"IE"}
                //,{"Safari"}
        };
    }

    @Test(dataProvider = "browserDataProvider")
    @Severity(SeverityLevel.CRITICAL)
    public void LikeTest(String browserName) {
        BrowserFactory.initDriver(browserName);



        LoginBO loginBO = new LoginBO();
        //Step2
        Assert.assertTrue(loginBO.login(),"login Failed!");


        LikeBO likeBO = new LikeBO();
        //Step2
        Assert.assertTrue(likeBO.like(),"like Failed!");
    }
}


