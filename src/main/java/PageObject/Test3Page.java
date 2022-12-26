package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Test3Page  {

    public SelenideElement
        languages = $(byXpath("/html/body/div[2]/nav/div[2]/div[6]/label/div")),
        spanish = $(byXpath("//*[@id=\"language-option-es-ES\"]/span[2]"));






}
