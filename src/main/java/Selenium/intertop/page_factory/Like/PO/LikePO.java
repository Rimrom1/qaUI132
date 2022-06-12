package Selenium.intertop.page_factory.Like.PO;

import Selenium.decorator.ClickButtonElement;
import Selenium.intertop.paralel_run.BrowserFactory;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class LikePO extends ItemPO {


    @FindBy(xpath = "//*[@class=\"jsShowPrice btn  \"]")
    private ClickButtonElement SizeItemButton;

    @FindBy(xpath = "//*[@class=\"big-zoom product-fav prod-fav only-fav\"]")
    private ClickButtonElement LikeButt;

    @Step("SelectItem")
    public LikePO choseSize() {
        WebDriverWait waiter= new WebDriverWait( BrowserFactory.getDriver(),2);
        WebElement ItemButt = waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"jsShowPrice btn  \"]")));
        ItemButt.click();
        SizeItemButton.click();
        return new LikePO();
    }

    @Step("SelectItem")
    public LikePO likeItem() {
        LikeButt.click();
        return new LikePO();
    }

    @Step("goToUserPage")
    @Link("https://intertop.ua/ua/")
    public LikePO goToUserPage() {
        BrowserFactory.getDriver().get("https://intertop.ua/ua/?gclid=Cj0KCQjwyYKUBhDJARIsAMj9lkHWXABuHULKKHCoxvkpkT9tGiu6QlFTaig9P4eFGXZNAkMvxm5MiEQaAmt4EALw_wcB");
        return this;
    }



};

