import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    @Step("<id>'li elemente <text> degerini yaz")
    public void sendKeys(String id,String text){
        find(By.id(id)).sendKeys(text);
        System.out.println("parametreler yazildi...");
    }
}
