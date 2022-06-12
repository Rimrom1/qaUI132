package Selenium.intertop.page_factory.Login.BO;

import Selenium.intertop.page_factory.Login.PO.LoginInputPO;
import Tread.PropertyUtil;
import io.qameta.allure.Step;

public class LoginBO {
    @Step("isOpen")
    public boolean login() {

        LoginInputPO loginInputPO = new LoginInputPO()
                .goToUserPage();

        return loginInputPO.isOpen()
                &&
                loginInputPO
                        .goToLoginInput()
                        .inputLogin((String) new PropertyUtil().getProperty("login"))
                        .inputPass((String) new PropertyUtil().getProperty("pass"))
                        .login()
                        .isOpen();
    }
}
