@locators
  Feature:
    Scenario: TC01 locators
      Given kullanici "https://testcenter.techproeducation.com/index.php?page=form-authentication" adresine gider
      And kullanici adini gir
      And kullanici sifresini gir
      And 3 saniye bekler
      When submit buttonuna tikla
      Then giris yapildigini test et

#      1. feature file olustur
#      2. test caseleri yaz
#      3. yeni test adimlari icin yeni bir step definition class olustur ve step definitions(java metotlari) olustur
#      4. Page class olustur pages klasorunun altinda
#      5. kullaniciAdi, sifresi ve submit butonunu o sayfada bul
#