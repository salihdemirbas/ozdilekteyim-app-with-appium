import com.thoughtworks.gauge.Step;

import java.util.concurrent.TimeUnit;

public class ZamanPage extends BasePage {
    @Step("<zaman> saniye bekle")
    public void bekle(int zaman) throws InterruptedException {
        TimeUnit.SECONDS.sleep(zaman);
        // logger.info(zaman + "saniye beklendi******");
        System.out.println(zaman + " saniye beklendi.");
    }
}

