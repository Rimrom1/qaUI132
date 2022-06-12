package uiTests;

import Selenium.intertop.page_factory.Login.BO.LoginBO;
import Selenium.intertop.page_factory.RemoveLike.BO.RemoveLikeBO;
import Selenium.intertop.page_factory.removeFromCart.BO.RemoveItemCartBO;
import Selenium.intertop.page_factory.removeFromCart.PO.RemoveItemPO;
import Selenium.intertop.paralel_run.BrowserFactory;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test_helper.BaseTest;

@Test
public class RemoveFromCartTC  extends BaseTest{



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
        public void RemoveFromCartTest(String browserName) {
            BrowserFactory.initDriver(browserName);



            LoginBO loginBO = new LoginBO();
            //Step2
            Assert.assertTrue(loginBO.login(),"login Failed!");


            RemoveItemCartBO removeBO = new RemoveItemCartBO();
            Assert.assertTrue(removeBO.removeItemCart(), "remove failed");
        }
    }

