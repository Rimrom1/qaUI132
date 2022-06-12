package Selenium.intertop.page_factory.Like.BO;

import Selenium.intertop.page_factory.Like.PO.LikePO;
import io.qameta.allure.Step;

public class LikeBO {
    @Step("isOpen")
    public boolean like() {

        LikePO likePO = new LikePO()
                .goToUserPage();

        return likePO.isOpen()
                &&
                likePO
                        .selectSex()
                        .selectItem()
                        .choseSize()
                        .likeItem()
                        .isOpen();
    }
}
