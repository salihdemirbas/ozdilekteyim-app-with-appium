import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class BasePage extends BaseTest {
    private String selectorId;

   /* @Step("<selectorId> id'li elemente tıkla")
    public void clickById(String selectorId) {

    }*/


    @Step("<id> id'li elemente tıkla")
    public void tikla(String id) {
        appiumDriver.findElement(By.id(id)).click();
        //log4j gelmeli
        System.out.println(selectorId + " elementina tiklandi");

    }
    @Step("<zaman> saniye bekle")
    public void bekle(int zaman) throws InterruptedException {
        TimeUnit.SECONDS.sleep(zaman);
        System.out.println(zaman + " saniye beklendi.");
    }
}
