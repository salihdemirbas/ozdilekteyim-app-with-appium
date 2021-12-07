import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class HomePage extends BasePage{

    @Step("<id> id'li elemente tıkla")
    public void tikla(String locator){
        find(By.id(locator)).click();
        System.out.println("id elemente tiklandi");
    }
}
