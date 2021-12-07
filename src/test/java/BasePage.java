import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import java.util.List;

public class BasePage extends BaseTest {

    public MobileElement find(By locator){
        return appiumDriver.findElement(locator);
    }
    public void click(By locator){
        find(locator).click();
    }
    public List<MobileElement> findAll(By locator) {
        return appiumDriver.findElements(locator);
    }


    }


