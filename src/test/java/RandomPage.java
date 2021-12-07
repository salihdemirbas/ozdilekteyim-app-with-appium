import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

public class RandomPage extends BasePage {


    @Step("<random> ürünü sec")
    public void random(String random) {
        List<MobileElement> element = appiumDriver.findElementsById(random);
        int size = element.size();
        Random rnd = new Random();
        int RandomNumber = rnd.nextInt(size);
        element.get(RandomNumber).click();
        System.out.println("Pantolon random olarak secildi...");
        logger.info("pantolon random olarak secildi");
    }
    @Step("Urun detay kontrol")
    public void urunDetay(){
        boolean kosul = find(By.id("com.ozdilek.ozdilekteyim:id/tvInSizeItem")).isDisplayed();
        if(kosul=true){
            Assert.assertTrue("Urun detay sayfasindasiniz...",true);
            System.out.println("Urun detay sayfasındasiniz");
            logger.info("Urun detay sayfasindasiniz...");
        }
        else {
            Assert.assertTrue("Hatali sayfadasiniz",false);
            System.out.println("hatali sayfadasiniz...");
            logger.info("hatali sayfa");
        }
    }

    @Step("<random> beden sec")
    public void randomBedenSec(String random){
        List<MobileElement> element=appiumDriver.findElementsById(random);
        int size = element.size();
        Random rnd = new Random();
        int RandomNumber = rnd.nextInt(size);
        element.get(RandomNumber).click();
        System.out.println("Pantolon bedeni basariyla random olarak secildi....");
        logger.info("pantolon bedeni basariyla random olarak secildi...");
    }
}