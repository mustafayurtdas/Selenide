package stepdefinitions;


import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TestCenterPage;
import static com.codeborne.selenide.Condition.visible;

public class TestCenterStepDefinitions {
    TestCenterPage testCenterPage = new TestCenterPage();
    @Given("kullanici adini gir")
    public void kullanici_adini_gir() {
        testCenterPage.kullaniciAdi.setValue("techproed");
    }
    @Given("kullanici sifresini gir")
    public void kullanici_sifresini_gir() {
        testCenterPage.kullaniciSifresi.setValue("SuperSecretPassword");
    }
    @When("submit buttonuna tikla")
    public void submit_buttonuna_tikla() {
        testCenterPage.submitButton.click();
    }
    @Then("giris yapildigini test et")
    public void giris_yapildigini_test_et() {
//        Assert.assertTrue(testCenterPage.girisMesaji.isDisplayed());//JUNIT
//        testCenterPage.girisMesaji.shouldBe(Condition.visible);
        testCenterPage.girisMesaji.shouldBe(visible);// SELENIDE ASSERTION

    }
}
