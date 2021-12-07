import com.thoughtworks.gauge.Step;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class ScrollPage extends BasePage{

    @Step("Scroll Yap")
    public void scroll(){
        //Dimenson kullanılabilir

        int startx =558;
        int starty=1967;
        int endx =554;
        int endy =398;
        TouchAction touchAction = new TouchAction(appiumDriver);
        touchAction.longPress(PointOption.point(startx, starty))
                .moveTo(PointOption.point(endx, endy))
                .release().perform();
        System.out.println("--------------------------------------");
        System.out.println("IKINCI SCROLL YAPILIYOR.....");
        System.out.println("--------------------------------------");
        int startx_new =546;
        int starty_new=1963;
        int endx_new =546;
        int endy_new =273;
        touchAction.longPress(PointOption.point(startx_new, starty_new))
                .moveTo(PointOption.point(endx_new, endy_new))
                .release().perform();


    }
}
