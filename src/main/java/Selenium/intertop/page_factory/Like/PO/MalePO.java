package Selenium.intertop.page_factory.Like.PO;

import Selenium.decorator.ClickButtonElement;
import Selenium.intertop.page_factory.BasicPO;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public  class MalePO extends BasicPO {


    @FindBy(xpath = "//*[@href=\"/ua/muzhchinam/\"]")
    private ClickButtonElement SelectTypeSexButton;



    @Step("SelectPhoto")
    public LikePO selectSex() {
        SelectTypeSexButton.click();
        return new LikePO();
    }

    @Override
    @Step("isOpen")
    public boolean isOpen() {
        return SelectTypeSexButton.waitForMeVisible(10000);
    }


};

