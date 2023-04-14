package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestCenterPage {
    // kullanici adi
    public SelenideElement kullaniciAdi = $(By.id("exampleInputEmail1"));

    // Kullanici sifresi
    public SelenideElement kullaniciSifresi = $("#exampleInputPassword1");

    // submit
    public SelenideElement submitButton = $(By.xpath("//button[@type='submit']"));

    //    giris mesaji
    public SelenideElement girisMesaji = $(By.xpath("//*[contains(text(),'You logged into a secure area!')]"));
}
