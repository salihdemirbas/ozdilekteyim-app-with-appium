import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class KategoriPage extends BasePage{
    @Step("<xpath> xpath elementine tıkla")
    public void xpathTikla(String xpath){
        find(By.xpath(xpath)).click();
        System.out.println(xpath + " xpath elementine tiklandi");
    }
}
