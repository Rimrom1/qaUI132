package Selenium.intertop.page_factory.RemoveLike.PO;

import Selenium.decorator.ClickButtonElement;
import Selenium.intertop.paralel_run.BrowserFactory;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class RemoveLikePO extends LikePagePO {




    @FindBy(xpath = "//*[@class=\"one-item-fav\"]")
    private ClickButtonElement RemoveLikeButt;

    @Step("SelectItem")
    public RemoveLikePO removeLike() {
        WebDriverWait waiter= new WebDriverWait( BrowserFactory.getDriver(),2);
        WebElement ItemButt = waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"one-item-fav\"]")));
        ItemButt.click();
        RemoveLikeButt.click();
        return new RemoveLikePO();
    }



    @Step("goToUserPage")
    @Link("https://intertop.ua/ua/")
    public RemoveLikePO goToUserPage() {
        BrowserFactory.getDriver().get("https://intertop.ua/ua/?gclid=Cj0KCQjwyYKUBhDJARIsAMj9lkHWXABuHULKKHCoxvkpkT9tGiu6QlFTaig9P4eFGXZNAkMvxm5MiEQaAmt4EALw_wcB");
        return this;
    }



};

