package StepObject;

import PageObject.Test2Page;
import io.qameta.allure.Step;
import org.testng.Assert;

public class Test2PageStep extends Test2Page {


    @Step("შესვლის ღილაკი")
    public Test2PageStep gotoTest2Page() {
        SignIn.click();
        ImdbOpen.click();
        return this;

    }

    @Step("შესვლა IMDb-დან")
    public Test2PageStep email(String login) {
        logInInput.setValue(login);
        return this;

    }

    @Step("პაროლის ჩაწერა")
    public Test2PageStep password(String password) {
        passwordInput.setValue(password);
        return this;

    }

    @Step("პროფილის გახსნა")
    public Test2Page open() {
        openProfile.click();
        return this;
    }

    @Step("ძიება")
    public Test2Page search(String name) {
        searchInput.setValue(name);
        return this;

    }

    @Step("პროდუქტის გახსნა")
    public Test2Page find() {
        openProduct.pressEnter();
        return this;
    }

    @Step("კალათაში დამატება")
    public Test2Page box() {
        WatchListAdd.click();
        return this;

    }

    @Step("კალათის გახსნა")

    public Test2Page watchcList() {


        WatchListOpen.click();
        return this;

    }
}