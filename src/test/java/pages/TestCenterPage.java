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

    //    CHECKBOX ELEMENTLERI
    public SelenideElement checkbox1 = $(By.id("box1"));
    public SelenideElement checkbox2 = $(By.id("box2"));

    //    RADIO ELEMENTLERI
    public SelenideElement red = $(By.id("red"));
    public SelenideElement football = $(By.id("football"));

    //    DROPDOWN ELEMENTLERI
    public SelenideElement yil = $(By.id("year"));
    public SelenideElement ay = $(By.id("month"));
    public SelenideElement gun = $(By.id("day"));

    //    ALERT ELEMENTLERI
    public SelenideElement promptButton = $(By.xpath("//button[@onclick='jsPrompt()']"));
    public SelenideElement sonuc = $("#result");

    //    FRAME ELEMENTLERI
    public SelenideElement techProLink = $(By.xpath("//a[@type='button']"));




}
