package Selenium.intertop.page_factory.addToCart.BO;

import Selenium.intertop.page_factory.addToCart.PO.AddToCartPO;
import io.qameta.allure.Step;

public class AddToCatrBO {
    @Step("isOpen")
    public boolean addToCart() {

        AddToCartPO addToCatrPO = new AddToCartPO()
                .goToUserPage();

        return addToCatrPO.isOpen()
                &&
                addToCatrPO
                        .selectSex()
                        .selectItem()
                        .choseSize()
                        .addToCartItem()
                        .isOpen();
    }
}
