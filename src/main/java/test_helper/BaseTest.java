package test_helper;

import Selenium.intertop.paralel_run.BrowserFactory;
import com.automation.remarks.testng.UniversalVideoListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import testHelper.CustomAlure;


@Listeners({
        // BaseTestListener.class,
        UniversalVideoListener.class,
        CustomAlure.class
})

public class BaseTest {

        @AfterTest
        void quitBrowser(){
                BrowserFactory.getDriver().quit();
                BrowserFactory.getDriver().close();
        }
}