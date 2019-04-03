package BayiIptal.Function

import Resources.Resources
import org.openqa.selenium.By
import org.openqa.selenium.WebElement


/**
 * Created by murat_PRM on 14.6.2017.
 */
class BayiIptal extends Resources {

    public void login() {

        if ((id(jss(username)).isEnabled())) {
            id(jss(username)).sendKeys("002464")
        }
        if ((id(jss(password)).isEnabled())) {
            id(jss(password)).sendKeys("*102938Ab")
        }
        if ((id(jss(onaylaButon)).isEnabled())) {
            id(jss(onaylaButon)).click()
        }
        idload(pozisyonSec)

        if ((id(jss(pozisyonSec)).isEnabled())) {
            id(jss(pozisyonSec)).click()
            sleep(5000)
            String randSonuc = RandGiris(1, 2)
            if (randSonuc == "1") {
                list_click(pozisyonSYAvrupa)
            } else if (randSonuc == "2") {
                list_click(pozisyonSYAvrupa)
            }
        }

        if ((id(jss(loginButon)).isEnabled())) {
            id(jss(loginButon)).click()
        }
    }

    public void anaMenu(String menuSec) {

        xpathload(bayiyonetimi)
        if (xpath(bayiyonetimi).isEnabled()) {
            xpath(bayiyonetimi).click()

        }
        if (xpath(menuSec).isEnabled()) {
            xpath(menuSec).click()
        }
    }


    public void bayiIptal(String anaBayiKodDeger2, String bayiTicUnvanDeg, String bayiGrupDeger, String bayiTipiSecim, String satisNoktaDeger, String bolgeSecilen, String iptalSecimDeger, String iptalSecimDeger2, String belgeSec, String aciklamatext) {
        sleep(2000)
        idload(anaBayiKodu2)
        if ((id(jss(anaBayiKodu2)).isEnabled())) {
            id(jss(anaBayiKodu2)).sendKeys(anaBayiKodDeger2)
        }
        sleep(2000)
        if ((id(jss(bayiTicariUnvani)).isEnabled())) {
            id(jss(bayiTicariUnvani)).sendKeys(bayiTicUnvanDeg)
        }
        sleep(2000)
        idload(bayiGrubu)
        if ((id(jss(bayiGrubu)).isEnabled())) {
            id(jss(bayiGrubu)).click()
        }
        sleep(3000)
        list_click(bayiGrupDeger)

        sleep(2000)
        if (xpath(bayiTip2).isEnabled()) {
            xpath(bayiTip2).click()
        }
        sleep(2000)
        list_click2(bayiTipiSecim)

        if ((id(jss(satisNoktasiKodu2)).isEnabled())) {
            id(jss(satisNoktasiKodu2)).sendKeys(satisNoktaDeger)
        }
        sleep(2000)
        /*if ((id(jss(anaBolge2)).isEnabled())){  //combobox şuan disable açılan bayi tür vs de seçim yapılacak.
                id(jss(anaBolge2)).click()
            }
            if (xpath(anaBolge2).isEnabled()) {
                xpath(anaBolge2).click()
            }*/
        if ((id(jss(bolge)).isEnabled())) {
            id(jss(bolge)).click()
        }
        sleep(3000)
        list_click(bolgeSecilen)

        sleep(2000)
        if ((id(jss(bayiAraButton)).isEnabled())) {
            id(jss(bayiAraButton)).click()

        }
        sleep(3000)

        try {
                checkbox_click("")
            xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/table[1]/tbody[2]/tr[1]/td[9]/div[1]/div[1]/button[1]").click()
            name(gozat2).sendKeys(file)
            xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/div[3]/button[1]").click()

            }

        catch (Exception e)
        {

        }


        idload(iptalTip)
        sleep(2000)
        if ((id(jss(iptalTip)).isEnabled())) {
            id(jss(iptalTip)).click()
        }
        sleep(2000)
        list_click(iptalSecimDeger)
        sleep(2000)

        if ((id(jss(iptalNeden)).isEnabled())) {
            id(jss(iptalNeden)).click()
        }
        idload(iptalNeden)
        list_click(iptalSecimDeger2)
        sleep(2000)

        try {
            idload(kapanisBelgesiSec)
            id(jss(kapanisBelgesiSec)).click()
            sleep(2000)
            list_click(belgeSec)

        }
        //xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/span[3]/form[1]/input[1]").click()
        catch (Exception e){}
        sleep(5000)

        id(jss(gozat)).click()
        sleep(3000)
        try {
            name(gozat2).sendKeys(file)
            xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/div[3]/button[1]").click()
        }

        catch (Exception e)
        {

        }


        if ((id(jss(iptalAciklama)).isEnabled())) {
            id(jss(iptalAciklama)).sendKeys(aciklamatext)
        }
        if ((id(jss(tamam)).isEnabled())) {
            id(jss(tamam)).click()
        }

        xpathload("/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/button[1]")
        xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/button[1]").click()
        sleep(10000)
        String txt="/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]"
       // String bayiKodu = xpath(txt).getText().substring(0, 7).toString()
        System.out.println(xpath(txt).getText().substring(0, 7).toString())


        /*String[] options = driver.findElement(By.id("dropdown")).getText().split("\n");
        options.length;*/



       /* WebElement El = driver.findElement(By.id(dosyaSec));
        El.sendKeys("C:\\Users\\hakan.tektas\\IdeaProjects\\dosyalar");

        id(jss(dosyaSec)).click()*/
      /*  if ((id(jss(tamam)).isEnabled())) {
            id(jss(tamam)).click()
        }

        xpathload("/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/button[1]")
        xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/button[1]").click()*/



        /*if ((id(jss(iptalCheckBox)).isEnabled())) {
            id(jss(iptalCheckBox)).click()
        }*/    // TTBN ise ESN olarak devam etsin:  checkbox  'ı işaretleyen kod bloğu




      /* xpathload(popupTamam)
        if (xpath(popupTamam).isDisplayed()) {
            xpath(popupTamam).click()
        }
      */



    }

}