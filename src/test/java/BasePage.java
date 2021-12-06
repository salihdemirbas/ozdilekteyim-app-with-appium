import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BasePage extends BaseTest {

    //-------------------------------------------------------------

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
    @Step("<id>'li elemente <text> degerini yaz")
    public void sendKeys(String id,String text){
        appiumDriver.findElement(By.id(id)).sendKeys(text);
        System.out.println("İlgili parametre yazıldı...");
    }
    @Step("Scroll Yap")
    public void scroll(){
        int startx =536;
        int starty=1616;
        int endx =536;
        int endy =359;
        TouchAction touchAction = new TouchAction(appiumDriver);
        touchAction.longPress(PointOption.point(startx, starty))
                .moveTo(PointOption.point(endx, endy))
                .release().perform();


    }
    @Step("<random> ürünü sec")
    public void random(String random){
        List<MobileElement> element=appiumDriver.findElementsByClassName(random);
        int size = element.size();
        Random rnd = new Random();
        int RandomNumber = rnd.nextInt(size);
        element.get(RandomNumber).click();
        System.out.println("*****************ürün secildi*************************");
        System.out.println(size + "element size *****************");

    }


    }


