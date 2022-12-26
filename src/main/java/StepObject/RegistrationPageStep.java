package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationPageStep extends RegistrationPage {

    @Step("რეგისტრაციის ღილაკს ვაკლიკებ")
    public RegistrationPageStep goToRegistrationPage() {
        signInBtn.click();
        NewAccount.click();
        return this;
    }

    @Step("ვწერ სახელს და გვარს")
    public RegistrationPageStep fullName(String fullName) {
        fullNameInput.setValue(fullName);
        return this;
    }
    @Step("ვწერ იმეილს")
    public RegistrationPageStep email(String email) {
        emailInput.setValue(email);
        return this;
    }
    @Step("შემყავს პაროლი")
    public RegistrationPageStep password(String password) {
        passwordInput.setValue(password);
        return this;
    }
    @Step("შემყავს ხელმეორედ პაროლი")
    public RegistrationPageStep check(String password) {
        passwordCheck.setValue(password).shouldBe(Condition.visible);
        return this;
    }
}












