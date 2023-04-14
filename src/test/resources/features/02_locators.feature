@locators
  Feature:
    Scenario: TC01 locators
      Given kullanici "https://testcenter.techproeducation.com/index.php?page=form-authentication" adresine gider
      And kullanici adini gir
      And kullanici sifresini gir
      And 3 saniye bekler
      When submit buttonuna tikla
      Then giris yapildigini test et

