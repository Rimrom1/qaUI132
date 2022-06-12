package Selenium.intertop.page_factory.addToCart.PO;

import Selenium.decorator.ClickButtonElement;
import Selenium.intertop.page_factory.BasicPO;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public  class Male1PO extends BasicPO {


    @FindBy(xpath = "//*[@href=\"/ua/muzhchinam/\"]")
    private ClickButtonElement SelectTypeSexButton;



    @Step("SelectPhoto")
    public AddToCartPO selectSex() {
        SelectTypeSexButton.click();
        return new AddToCartPO();
    }

    @Override
    @Step("isOpen")
    public boolean isOpen() {
        return SelectTypeSexButton.waitForMeVisible(10000);
    }


};

