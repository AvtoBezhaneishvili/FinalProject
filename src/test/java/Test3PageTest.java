import StepObject.Test3PageStep;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.$;

public class Test3PageTest extends ChromeRunner {
    SoftAssert soft = new SoftAssert();
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description()

    public void Test3() {
        Test3PageStep step = new Test3PageStep();
        step.goToTest3Page();
        step.language();



        Assert.assertTrue($(".hUAeOc").is(Condition.visible)); // ვამოწმებ შეცვალა ენა თუ არა
        Assert.assertEquals("Próximamente", $(".hUAeOc")); // პოულობს მაგრამ განსხვავება აქვსო
        soft.assertAll();

    }
}
