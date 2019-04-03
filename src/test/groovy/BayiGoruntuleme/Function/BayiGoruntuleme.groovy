package BayiGoruntuleme.Function

import Resources.Resources
import org.testng.Assert

/**
 * Created by murat_PRM on 14.6.2017.
 */
class BayiGoruntuleme extends Resources{

      public void anaMenu(String menuSec) {
        xpathload(bayiyonetimi)
          if (xpath(bayiyonetimi).isEnabled()) {
              xpath(bayiyonetimi).click()
          }
        sleep(1000)
          if (xpath(menuSec).isEnabled()) {
              xpath(menuSec).click()
          }
         }

    public void bayiGoruntule(String anaBayiKodDeger, String bayiDurumAraDeger,String satisNoktaDeger, String bayiGrupDeger,String bayiTicUnvanDeg, String bayiVergiDeg, String bayiAnahtarDeg,String bayiTipiSecim,String bayiGorBolgeSec,String bayiGorIlSec,String bayiGorIlceSec) {
        sleep(2000)
        idload(anaBayiKodu)
        if ((id(jss(anaBayiKodu)).isEnabled())) {
            id(jss(anaBayiKodu)).sendKeys(anaBayiKodDeger)
        }
        if ((id(jss(bayiDurumAra)).isEnabled())) {
            id(jss(bayiDurumAra)).click()
        }

        if (!bayiDurumAraDeger.isEmpty()) {
        if (xpath(bayiDurumAraDeger).isEnabled()) {
            xpath(bayiDurumAraDeger).click()
        }
        }
        else
        { id(jss(bayiDurumAra)).click()
        }


        if ((id(jss(satisNoktasiKodu)).isEnabled())) {
            id(jss(satisNoktasiKodu)).sendKeys(satisNoktaDeger)
        }


        if ((id(jss(bayiGrubuAra)).isEnabled())) {
            id(jss(bayiGrubuAra)).click()
        }

        if (!bayiGrupDeger.isEmpty()){
        if (xpath(bayiGrupDeger).isEnabled()) {
            xpath(bayiGrupDeger).click()
        }}
        else { id(jss(bayiGrubuAra)).click()}

        if ((id(jss(bayiTicUnvanAra)).isEnabled())) {
            id(jss(bayiTicUnvanAra)).sendKeys(bayiTicUnvanDeg)
        }

        if ((id(jss(bayiVergiNoAra)).isEnabled())) {
            id(jss(bayiVergiNoAra)).sendKeys(bayiVergiDeg)
        }

        if ((id(jss(bayiAnahtarKartNo)).isEnabled())) {
            id(jss(bayiAnahtarKartNo)).sendKeys(bayiAnahtarDeg)
        }

        if (xpath(bayiTipiAra).isEnabled()) {
            xpath(bayiTipiAra).click()
        }
         sleep(1500)
        if (!bayiTipiSecim.isEmpty()){
        list_click2(bayiTipiSecim)}
        else {  id(jss(bayiTicUnvanAra)).click()}

         if (!bayiGorBolgeSec.isEmpty()) {
        if ((id(jss(bayiGorBolge)).isEnabled())){
            id(jss(bayiGorBolge)).click()
            sleep(1000)
            list_click(bayiGorBolgeSec)
        }}
         else {  id(jss(bayiTicUnvanAra)).click()}

        if (!bayiGorIlSec.isEmpty()){
        if ((id(jss(bayiGorIl)).isEnabled())){
            id(jss(bayiGorIl)).click()
            sleep(1000)
            list_click(bayiGorIlSec)
        }}
        else {  id(jss(bayiTicUnvanAra)).click()}

        if (!bayiGorIlceSec.isEmpty()){
        if ((id(jss(bayiGorIlce)).isEnabled())){
            id(jss(bayiGorIlce)).click()
            sleep(1000)
            list_click(bayiGorIlceSec)
        }}
        else {  id(jss(bayiTicUnvanAra)).click()}

        if ((id(jss(bayiAraButton)).isEnabled())) {
            id(jss(bayiAraButton)).click()
        }


        xpathload(bayiSonucSatisKodu)
        String baySon1= xpath(bayiSonucSatisKodu).getText()
        String baySon2= xpath(bayiSonucTicUnvan).getText()
        String baySon3= xpath(bayiSonucBayiTip).getText()
        baySon3=dbconnect("select lov_display_value from cf_lov_Value where lov_code='"+baySon3+"'")
        String baySon4= xpath(bayiSonucAnaBolge).getText()
        String baySon5= xpath(bayiSonucBolge).getText()
        String baySon6= xpath(bayiSonucStatu).getText()
        String baySon7= xpath(bayiSonucAnahtar).getText()
        String baySon8= xpath(bayiSonucIl).getText()
        String baySon9= xpath(bayiSonucIlce).getText()
        sleep(1000)
        xpath(bayiSonucSatisKodu).click()
        xpathload("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
        sleep(2000)
        String bay1=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]").getAttribute("value").toString()
        String bay2=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]").getAttribute("value").toString()
        String bay3=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/i[1]/input[1]").getAttribute("value").toString()
        String bay4=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/i[1]/input[1]").getAttribute("value").toString()
        String bay5=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/i[1]/input[1]").getAttribute("value").toString()
        String bay6=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/i[1]/input[1]").getAttribute("value").toString()
        String bay7=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/input[1]").getAttribute("value").toString()
        String bay8=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/i[1]/input[1]").getAttribute("value").toString()
        String bay9=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/i[1]/input[1]").getAttribute("value").toString()

        Assert.assertEquals(baySon1,bay1)
        Assert.assertEquals(baySon2,bay2)
        Assert.assertEquals(baySon3,bay3)
        Assert.assertEquals(baySon4,bay4)
        Assert.assertEquals(baySon5,bay5)
        Assert.assertEquals(baySon6,bay6)
        Assert.assertEquals(baySon7,bay7)
        Assert.assertEquals(baySon8,bay8)
        Assert.assertEquals(baySon9,bay9)
    }

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
        }
        sleep(2000)
        if ((xpath(pozisyonSD)).isEnabled()) {
            xpath(pozisyonSD).click()
        }
        if ((id(jss(loginButon)).isEnabled())) {
            id(jss(loginButon)).click()
        }
    }
}

