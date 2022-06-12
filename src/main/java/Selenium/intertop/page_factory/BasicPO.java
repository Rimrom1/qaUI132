package Selenium.intertop.page_factory;

import Selenium.decorator.CustomDecorator;
import Selenium.intertop.paralel_run.BrowserFactory;
import org.openqa.selenium.support.PageFactory;

public abstract class BasicPO {

        public BasicPO() {
            PageFactory.initElements(new CustomDecorator(BrowserFactory.getDriver()),this);
        }

        public boolean isOpen(){
            //TODO
            return true;
        };
    public boolean isSubscribed(){
        //TODO
        return true;
    };
    public boolean isUnsubscribed(){
        //TODO
        return true;
    };



}
