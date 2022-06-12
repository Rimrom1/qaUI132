package Selenium.intertop.page_factory.Login.PO;

import Selenium.decorator.ClickButtonElement;
import Selenium.intertop.page_factory.BasicPO;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class MainPagePO extends BasicPO {


    @FindBy(xpath = "//*[@class=\"auth-ico\"]")
    private ClickButtonElement selectLoginForInputButton;



    @Step("SelectLoginForInputButton")
    public LoginInputPO goToLoginInput() {
        selectLoginForInputButton.click();
        return new LoginInputPO();
    }

    @Override
    @Step("isOpen")
    public boolean isOpen() {
        return selectLoginForInputButton.waitForMeVisible(10000);
    }


};

