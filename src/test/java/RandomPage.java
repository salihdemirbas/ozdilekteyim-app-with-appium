import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
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
        System.out.println("Pantalon random olarak secildi...");
    }

    @Step("<random> beden sec")
    public void randomBedenSec(String random){
        List<MobileElement> element=appiumDriver.findElementsById(random);
        int size = element.size();
        Random rnd = new Random();
        int RandomNumber = rnd.nextInt(size);
        element.get(RandomNumber).click();
        System.out.println("Pantolon bedeni basariyla random olarak secildi....");
    }
}