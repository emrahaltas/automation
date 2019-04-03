package KullaniciGoruntuleme.Function

import Resources.Resources


class KullaniciGoruntuleme extends Resources {
    void KullaniciGoruntulemee() {
    }


    public void anaMenu(String menuSec) {
        xpathload(calisanYonetimi)
        if (xpath(calisanYonetimi).isEnabled()) {
            xpath(calisanYonetimi).click()
        }
        sleep(1000)
        if (xpath(menuSec).isEnabled()) {
            xpath(menuSec).click()
        }
    }

    public void kullGoruntule(String kull) {
        sleep(2000)

        if (xpath(kullaniciKoduTextbox).isEnabled()) {
            xpath(kullaniciKoduTextbox).sendKeys(kull)
        }
        sleep(3000)
        if (xpath(cyAraButon).isEnabled()) {
            xpath(cyAraButon).click()
        }

        sleep(3000)
        user_click(kull) //user_click("Aktif")
        sleep(6000)
        id(jss(onLinkIleri)).click()
        sleep(6000)
        //scrollPageDown(xpath(kgOkButonXpath))
        if ((id(jss(tamamButon)).isEnabled())) {
            id(jss(tamamButon)).click()

        }
    }

    public void login(String pozisyonSecim) {

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
        if ((xpath(pozisyonSecim)).isEnabled()) {
            xpath(pozisyonSecim).click()
        }
        if ((id(jss(loginButon)).isEnabled())) {
            id(jss(loginButon)).click()
        }
    }


}




