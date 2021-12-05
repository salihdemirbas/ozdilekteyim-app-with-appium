import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class BasePage extends BaseTest {

    @Step("<id> id'li elemente tıkla")
    public void tikla(String id) {
        appiumDriver.findElement(By.id(id)).click();
        //log4j gelmeli
        System.out.println(id + " elementina tiklandi");

    }
    @Step("<zaman> saniye bekle")
    public void bekle(int zaman) throws InterruptedException {
        TimeUnit.SECONDS.sleep(zaman);
        System.out.println(zaman + " saniye beklendi.");
    }
    @Step("<xpath> xpath elementine tıkla")
    public void xpathTikla(String xpath){
        appiumDriver.findElement(By.xpath(xpath)).click();
        System.out.println(xpath + "xpath elementine tiklandi");
    }
    @Step("<xpath> ile random ürün seç")
    public void xpathRandom(String xpath){
        appiumDriver.findElement(By.xpath(xpath)).click();
        System.out.println("Random ürün seçildi...");
    }
}
