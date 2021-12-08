# Ozdilekteyim Android Mobil Uygulamasını Appium ile Test Senaryosu

## Test Ortamı
* Uygulama Android ortamında Emulator telefon kullanılarak gerçekleştirilmiştir.
* Telefon olarak Pixel 5, Android sürümü olarak Oreo 8.0 (API 26) tercih edilmiştir.
* Telefon çözünürlüğü 1080x2340 olarak seçilmiştir.
* Özdilekteyim Android Mobil App Versiyon : 1.1.13

## Kullanılan Teknolojiler
* Proje Java programlama dili ile yazılmış olup, Appium ve Gauge kullanılmıştır.
* OOP prensiplerine uyulmuş ve POM'a uygun olarak geliştirilmiştir.
* Assertion ve Log kullanılmıştır.


## Test Senaryosu
* Özdilekteyim uygulaması açılır.
* Uygulamanın açılıp açılmadığı kontrol edilir.
* Alışverişe başla butonuna tıklanır
* Alışveriş sayfasının açıldıgı doğrulanır
* Katogiriler Sayfası Açılır
* Katogoriler Sayfasının açıldıgı dogrulanır
* menüden “Kadın” Seçeneğine tıklanır
* “pantolon” kategorisi açılır
* Sayfanın en aşagasına doğru iki kere scrol edilir.
* Ürünlerden rasgele bir ürün seçilir.
* Ürün detay sayfası açıldığı kontrol edilir.
* favoriler butonuna tıklanır.
* Giriş yapma sayfasının açıldığı dogrulanır.
* Kullanıcı adı alanına “text” bilgisi girilir
* Password alanına şifre yazılır
* geri butonuna 2 kere tıklanır.
* rasgele bir ürün seçilir.
* Seçilen ürün sepete eklenir


