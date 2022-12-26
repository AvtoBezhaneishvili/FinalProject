package StepObject;

import PageObject.Test3Page;
import io.qameta.allure.Step;

import static DataObject.Test3PageData.word;

public class Test3PageStep extends Test3Page {

    @Step("ენის შეცვლა")
    public Test3Page goToTest3Page() {
        languages.click();
        return this;
    }

    @Step("ესპანურის არჩევა")
    public Test3Page language () {
        spanish.click();
        spanish.setValue(word);
        return this;
    }

}
