import StepObject.RegistrationPageStep;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DataObject.RegistrationPageData.*;
import static com.codeborne.selenide.Selenide.$;

@Listeners
public class RegistrationPageTest extends ChromeRunner {
    SoftAssert soft = new SoftAssert();
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("ვრეგისტრირდებით საიტზე")
    public void RegistrationTest() {
        RegistrationPageStep step = new RegistrationPageStep();
        step.goToRegistrationPage();
                step.fullName(fullName);
                step.email(email);
                step.password(password);
                step.check(password);

                Assert.assertTrue($("#ap_customer_name").is(Condition.enabled)); // სახელი
                Assert.assertFalse($("#ap_email").is(Condition.empty)); // მეილი
                soft.assertAll();





    }
}
