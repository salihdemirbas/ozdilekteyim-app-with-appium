import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class KategoriPage extends BasePage{
    @Step("Alisveris sayfasi kontrol")
    public void kontrolAlisverisPage(){
        boolean kontrol= find(By.id("com.ozdilek.ozdilekteyim:id/nav_categories")).isDisplayed();
        if(kontrol=true){
            Assert.assertTrue("1-Alisveris sayfasindasiniz",true);
            System.out.println("Alisveris sayfasindasiniz");
            logger.info("Alisveris sayfasindasiniz");
        }
        else {
            Assert.assertTrue("Hatali sayfa",false);
            System.out.println("hatali sayfa...");
            logger.info("Hatali sayfa");
        }
    }
    @Step("<xpath> xpath elementine tıkla")
    public void xpathTikla(String xpath){
        find(By.xpath(xpath)).click();
        System.out.println(xpath + " xpath elementine tiklandi");
        logger.info(xpath+ " xpath elementine tiklandi");
    }
}
