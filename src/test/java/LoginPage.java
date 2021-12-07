import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    @Step("Login page kontrol")
    public void loginPageKontrol(){
        boolean kosul=find(By.id("com.ozdilek.ozdilekteyim:id/etEposta")).isDisplayed();
        if(kosul=true){
            Assert.assertTrue("Login sayfasındasiniz",true);
            System.out.println("Login sayfasindasiniz");
            logger.info("login sayfasindasiniz...");
        }
        else {
            Assert.assertTrue("Hatali sayfadasiniz",false);
            System.out.println("Hatali sayfadasiniz");
            logger.info("hatali sayfa");
        }
    }
    @Step("<id>'li elemente <text> degerini yaz")
    public void sendKeys(String id,String text){
        find(By.id(id)).sendKeys(text);
        System.out.println("parametreler yazildi...");
        logger.info("parametreler yazildi...");
    }
}
