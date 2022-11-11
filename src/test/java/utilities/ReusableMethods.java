package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static utilities.Driver.driver;

public class ReusableMethods {
    public static void bekle(int saniye){

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public void tumSayfaResimCek() throws IOException {
        // 1- TakesScreenShot objesi olusturup
        //    deger olarak cast ettigimiz driver'i atayalim
        TakesScreenshot tss= (TakesScreenshot) driver;
        // 2- resmi kaydedecegimiz bir dosya olusturulur
        //    resim isimlerini dinamik yapmak ve resmin tarihini eklemek icin
        //    resim dosya yoluna tarih ekleyelim
        LocalDateTime ldt=LocalDateTime.now();
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("YYMMddHHmmss");

        File tumSayfaSShot= new File("target/ScreenShot/tumSayfaScrenshot"+ldt.format(dtf)+".jpeg");

        // 3- screenshot objesi kullanarak fotografi cekip, gecici dosyaya kaydet
        File geciciResim= tss.getScreenshotAs(OutputType.FILE);
        // 4- gecici dosyayi hazirladigim file'a kopyalayalim
        FileUtils.copyFile(geciciResim,tumSayfaSShot);
    }

    public void webelementScreenshot(WebElement target) throws IOException {
        LocalDateTime ldt=LocalDateTime.now();
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("YYMMddHHmmss");

        File tumSayfaSShot= new File("target/ScreenShot/webelementScrenshot"+ldt.format(dtf)+".jpeg");
        File geciciResim= target.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciResim,tumSayfaSShot);
    }
}
