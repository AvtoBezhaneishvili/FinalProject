import StepObject.Test2PageStep;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DataObject.RegistrationPageData.email;
import static DataObject.RegistrationPageData.password;
import static DataObject.Test2PageData.movie;
import static com.codeborne.selenide.Selenide.$;

public class Test2PageTest extends ChromeRunner {
    SoftAssert soft= new SoftAssert();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("")
    public void Test2() {
        Test2PageStep step = new Test2PageStep();
        step.gotoTest2Page();
        step.email(email);
        step.password(password);
        step.open();
        step.search(movie);
        step.find();
        step.box();
        step.watchcList();


        Assert.assertTrue($(".lister-item-header").is(Condition.visible)); // ბაგია, ზოგჯერ კალათა ცარიელია
        soft.assertAll();
    }
}
