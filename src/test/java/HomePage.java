import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage extends BasePage{
    @Step("Uygulamanin acildigi kontrol edilir")
    public void anaSayfaKontrol(){
       boolean kontrol=find(By.id("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore")).isDisplayed();
       if (kontrol=true){
           Assert.assertTrue("Anasayfadasiniz",true);
           System.out.println("anasayfadasiniz...");
           logger.info("Anasayfadasiniz....");
       }
       else {
           Assert.assertTrue("Hatali sayfa",false);
           System.out.println("hatali sayfa...");
           logger.info("hatali sayfadasiniz...");
       }

    }

    @Step("<id> id'li elemente tıkla")
    public void tikla(String locator){
        find(By.id(locator)).click();
        System.out.println(locator+" id elemente tiklandi");
        logger.info(locator+" id elemente tiklandi");
    }
}
