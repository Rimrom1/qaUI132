package Selenium.intertop.page_factory.RemoveLike.BO;

import Selenium.intertop.page_factory.RemoveLike.PO.RemoveLikePO;
import io.qameta.allure.Step;

public class RemoveLikeBO {
    @Step("isOpen")
    public boolean removeFromCart() {

        RemoveLikePO removeLike = new RemoveLikePO()
                .goToUserPage();

        return removeLike.isOpen()
                &&
                removeLike
                        .openLikes()
                        .removeLike()

                        .isOpen();
    }
}
