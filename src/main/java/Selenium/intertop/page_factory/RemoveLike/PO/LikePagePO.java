package Selenium.intertop.page_factory.RemoveLike.PO;

import Selenium.decorator.ClickButtonElement;
import Selenium.intertop.page_factory.BasicPO;
import Selenium.intertop.paralel_run.BrowserFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class LikePagePO extends BasicPO {


    @FindBy(xpath = "//*[@href=\"/ua/account/wishlist/\"]")
    private ClickButtonElement LikesButton;

    @FindBy(xpath = "//*[@data-count]")
    private ClickButtonElement Cart;




    @Step("SelectPhoto")
    public RemoveLikePO openLikes() {
        WebDriverWait waiter= new WebDriverWait( BrowserFactory.getDriver(),2);
        WebElement ItemButt = waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"user-menu-item item_cart\"]")));
        ItemButt.click();
        LikesButton.click();
        return new RemoveLikePO();
    }

    @Override
    @Step("isOpen")
    public boolean isOpen() {
        return Cart.waitForMeVisible(10000);
    }


};

