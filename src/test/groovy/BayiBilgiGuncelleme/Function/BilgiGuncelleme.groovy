package BayiBilgiGuncelleme.Function

import Login.Function.GirisBasarili
import Resources.Resources
import org.testng.Assert

class BilgiGuncelleme extends  GirisBasarili {

    String telNo =tel()



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

    public String bayiIletisimGuncelleme(String satisNoktasiKod, String anahtarKartNo, String guncelllemeNedenGir) {
        sleep(2000)
        idload(iletisimSatKodu)
        if ((id(jss(iletisimSatKodu)).isEnabled())) {
            id(jss(iletisimSatKodu)).sendKeys(satisNoktasiKod)
        }

        if ((id(jss(iletisimAnahtarNo)).isEnabled())) {
            id(jss(iletisimAnahtarNo)).sendKeys(anahtarKartNo)
        }
        if ((id(jss(iletisimAraButton)).isEnabled())) {
            id(jss(iletisimAraButton)).click()
        }
        idload(iletisimGuncNeden)
        if ((id(jss(iletisimGuncNeden)).isEnabled())) {
            id(jss(iletisimGuncNeden)).click()
            sleep(1500)
          list_click(guncelllemeNedenGir)
        }

        if (xpath(iletisimTelSil).isEnabled()) {
            xpath(iletisimTelSil).click()
        }

        if ((id(jss(bayiKontakTip)).isEnabled())) {
            id(jss(bayiKontakTip)).click()
            sleep(1000)
            list_click("Tel No")
        }


        sleep(1000)
        if ((id(jss(bayiKontakNo)).isEnabled())) {
            id(jss(bayiKontakNo)).sendKeys(telNo)
        }
        sleep(1000)
        if (xpath(bayiIletTelBtn).isEnabled()) {
            xpath(bayiIletTelBtn).click()
        }
     /*   sleep(1000)
        if ((id(jss(bayiEmailTip)).isEnabled())) {
            id(jss(bayiEmailTip)).click()
            sleep(1000)
            list_click("Diğer")
        }

        sleep(2000)
        if (id(jss(iletisimBayiEmail)).isEnabled()) {
            id(jss(iletisimBayiEmail)).sendKeys(email())
        }
        sleep(2000)
        if (id(jss(iletisimBayiEmailEkle)).isEnabled()) {
            id(jss(iletisimBayiEmailEkle)).click()
        }

        */
        idload(tamamButton)
        if ((id(jss(tamamButton)).isEnabled())) {
            id(jss(tamamButton)).click()
        }

        xpathload(PopupOnayEvet)
        if (xpath(PopupOnayEvet).isEnabled()) {
            xpath(PopupOnayEvet).click()
        }
        xpathload(PopupTamam)
        String takipNo= xpath(PopupTamam).getText().substring(0, 8).toString()
        xpath(PopupOnayEvet).click()
        return takipNo
    }

    public String bayiIletisimKontrol(){
        String bayiGorTel=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[2]/td[2]/div[1]/input[1]").getAttribute("value").toString()
        Assert.assertEquals(telNo,bayiGorTel)
    }

}

