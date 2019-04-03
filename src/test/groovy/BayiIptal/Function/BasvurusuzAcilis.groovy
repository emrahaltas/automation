package BayiIptal.Function

import Resources.Resources

/**
 * Created by murat_PRM on 14.6.2017.
 */
class BasvurusuzAcilis extends Resources{
    void basvurusuzAcilis(){





        xpathload(tamamBtn)
        sleep(10000)
        //xpath(bayikodupopup).getText().substring(37,43).isNumber()
    }

    public void basvurusuzTab2() {
        idload(segment)
        if (id(jss(segment)).isEnabled()) {
            id(jss(segment)).click()
        }
        sleep(1000)
        if (xpath(segmentSecStandart).isEnabled()) {
            xpath(segmentSecStandart).click()
        }

        if (xpath(segmentBasTarih).isEnabled()) {
            xpath(segmentBasTarih).click()
        }
        if (xpath(segmentBasTarihSec).isEnabled()) {
            xpath(segmentBasTarihSec).click()
        }

        if (id(jss(segmentKiralayan)).isEnabled()) {
            id(jss(segmentKiralayan)).click()
        }
        sleep(2000)
        if (xpath(segmentKiralayanSec).isEnabled()) {
            xpath(segmentKiralayanSec).click()
        }
        if (xpath(ileriBtn).isEnabled()) {
            xpath(ileriBtn).click()
        }
    }

    public void basvurusuzTab3() {
        xpathload(bayiTransfer)
        sleep(2000)
        xpath(bayiTransferSec).click()
        sleep(1000)
        id(jss(magazaIsim)).sendKeys("testtt")
        id(jss(magazaUzaklik)).sendKeys("22")
        id(jss(magazaBuyukluk)).sendKeys("33")
        id(jss(cepheAdi)).click()
        xpathload(cepheAdiSec)
        sleep(1000)
        id(jss(yukseklikY)).sendKeys("5")
        id(jss(yukseklikX)).sendKeys("5")
        xpath(cepheEkle).click()
        sleep(1000)
        id(jss(sektorelTecrube)).click()
        sleep(1000)
        xpath(sektorelTecSec).click()
        sleep(1000)
        id(jss(bayiIl)).click()
        sleep(1000)
        xpath(bayiIlSec).click()
        sleep(1000)
        id(jss(bayiIlce)).click()
        sleep(1000)
        xpath(bayiIlceSec).click()
        sleep(1000)
        xpath(bayiIlIlceEkle).click()
        sleep(1000)
        xpath(banka).click()
        sleep(2000)
        xpath(bankaSec).click()
        xpathload(bankaSube)
        sleep(1000)
        xpath(bankaSubeSec).click()
        sleep(1000)
        xpath(bankaHspNo).sendKeys("2342343242")
        xpath(bankaIBAN).sendKeys("TR870001000034321841755002")
        xpath(kordinatX).sendKeys("4")
        xpath(kordinatY).sendKeys("5")
        xpath(SY).click()
        sleep(1000)
        xpath(SYSec).click()
        sleep(2000)
        xpath(SYDestek).click()
        sleep(2000)
        xpath(SYDestekSec).click()
        sleep(1000)
        xpath(sozTarih).click()
        sleep(1000)
        xpath(sozTarihSec).click()
        sleep(1000)
        xpath(ileri2Btn).click()
    }

    public void basvurusuzTab1(String partnerType) {



        idload(bayiTipi)
        if ((id(jss(bayiTipi)).isEnabled())) {
            id(jss(bayiTipi)).click()
        }
        sleep(2000)
       list_click(partnerType)
        sleep(1000)
        if ((id(jss(bayiTicUnvan)).isEnabled())) {
            id(jss(bayiTicUnvan)).sendKeys(isim())
        }
        if ((id(jss(bayiTabAdi)).isEnabled())) {
            id(jss(bayiTabAdi)).sendKeys(isim())
        }

        idload(bolge)
        if ((id(jss(bolge)).isEnabled())) {
            id(jss(bolge)).click()
            sleep(1000)
            list_click(bolgeIstAvr)
        }
        sleep(1000)
        //xpathload(bolgeSec)


        /*xpathload(bolgeIstAvr)
        if (xpath(bolgeIstAvr).isDisplayed()) {
            xpath(bolgeIstAvr).click()
        }*/
        idload(il)
        if ((id(jss(il)).isEnabled())) {
            id(jss(il)).click()
            sleep(1000)
            list_click(ilIstanbul)
        }
        //xpathload(ilSec)

        sleep(1000)
        idload(ilce)
        if ((id(jss(ilce)).isEnabled())) {
            id(jss(ilce)).click()
            sleep(1000)
            list_click(ilceAvc)
        }

        sleep(1000)
        if ((id(jss(adres)).isEnabled())) {
            id(jss(adres)).sendKeys("EDM Testttt adress")
        }
        if ((id(jss(binaNo)).isEnabled())) {
            id(jss(binaNo)).sendKeys("33")
        }
        if ((id(jss(kapiNo)).isEnabled())) {
            id(jss(kapiNo)).sendKeys("5")
        }
        if ((id(jss(postaKodu)).isEnabled())) {
            id(jss(postaKodu)).sendKeys("34444")
        }
        if ((id(jss(adresKodu)).isEnabled())) {
            id(jss(adresKodu)).sendKeys("123")
        }
        if ((id(jss(normKodu)).isEnabled())) {
            id(jss(normKodu)).sendKeys("1234")
        }

        if ((id(jss(distributorListbox)).isEnabled())) {
            id(jss(distributorListbox)).click()
            sleep(1000)
            list_click(distMobiltel)
        }
        //   xpath(distributorSec).click()

        sleep(1000)
        if ((id(jss(distEkleButon)).isEnabled())) {
            id(jss(distEkleButon)).click()
        }
       // xpath(distBtn).click()
        sleep(1000)
        if ((id(jss(bayiKontakTip)).isEnabled())) {
            id(jss(bayiKontakTip)).click()
            sleep(1000)
            list_click(bayiIletSecTel)
        }

        sleep(1000)
        if ((id(jss(bayiKontakNo)).isEnabled())) {
            id(jss(bayiKontakNo)).sendKeys(tel())
        }
        sleep(1000)
        if (xpath(bayiIletTelBtn).isEnabled()) {
            xpath(bayiIletTelBtn).click()
        }
         sleep(1000)
        if ((id(jss(sirketTipi)).isEnabled())) {
            id(jss(sirketTipi)).click()
            sleep(2000)
            list_click(sirketSahis)
        }

        /*
        if (xpath(sirketSermaye).isEnabled()) {
            xpath(sirketSermaye).click()
        }*/

        /*sleep(2000)
        if (id(jss(vergiNo)).isEnabled()) {
            id(jss(vergiNo)).sendKeys(TcOlustur())
        }

        if (xpath(sayfabostikla).isEnabled()) {
            xpath(sayfabostikla).click()
        }

        sleep(2000)
        if ((id(jss(vergiDaire)).isEnabled())) {
            id(jss(vergiDaire)).sendKeys(TcOlustur())
        }*/
        sleep(1000)
        if (xpath(sayfabostikla).isEnabled()) {
            xpath(sayfabostikla).click()
        }
        sleep(1000)
        if ((id(jss(bayiSahibiTC)).isEnabled())) {
            id(jss(bayiSahibiTC)).sendKeys(TcOlustur())
        }
        sleep(1000)
        if (xpath(sayfabostikla).isEnabled()) {
            xpath(sayfabostikla).click()
        }
        sleep(1000)
        xpathload(popupTamam)
        if (xpath(popupTamam).isEnabled()) {
            xpath(popupTamam).click()
        }
        sleep(2000)
        if ((id(jss(vergiDaire)).isEnabled())) {
            id(jss(vergiDaire)).sendKeys(TcOlustur())
        }
        if ((id(jss(bayiSahibiAd)).isEnabled())) {
            id(jss(bayiSahibiAd)).sendKeys(isim())
        }
        if ((id(jss(bayiSahibiSoyad)).isEnabled())) {
            id(jss(bayiSahibiSoyad)).sendKeys(isim())
        }
        sleep(2000)
      //  xpathload(bayiShbEmailSec)
       /* if (xpath(bayiShbEmailSec).isEnabled()) {
            xpath(bayiShbEmailSec).click()
        }*/
        if ((xpath(bayiShbEmailSec).isEnabled())) {
            xpath(bayiShbEmailSec).click()
            sleep(2000)
        }
        list_click(bayiSahibiTlkmMail)
        sleep(1000)
        xpathload(bayiSahibiTlkmMail)
        if (xpath(bayiSahibiTlkmMail).isEnabled()) {
            xpath(bayiSahibiTlkmMail).click()
        }

        sleep(2000)
        xpathload(bayiShbEmailSec)
        if (xpath(bayiShbEmailSec).isEnabled()) {
            xpath(bayiShbEmailSec).click()
        }
        sleep(2000)
        if (xpath(bayiSahibiDigerMail).isEnabled()) {
            xpath(bayiSahibiDigerMail).click()
        }
        sleep(2000)
        if (xpath(bayiSahibiDigerMailVal).isEnabled()) {
            xpath(bayiSahibiDigerMailVal).sendKeys(email())
        }
        sleep(2000)
        if (xpath(bayiSahibiDigerMailBtn).isEnabled()) {
            xpath(bayiSahibiDigerMailBtn).click()
        }
        sleep(2000)
        if ((id(jss(bayiSahibiTel)).isEnabled())) {
            id(jss(bayiSahibiTel)).sendKeys(tel())
        }
        sleep(1000)
        if ((id(jss(bayiEmailTip)).isEnabled())) {
            id(jss(bayiEmailTip)).click()
        }
        sleep(2000)
        if (xpath(bayiEmailTlkm).isEnabled()) {
            xpath(bayiEmailTlkm).click()
        }
        sleep(2000)
        if (xpath(bayiEmailTlkmVal).isEnabled()) {
            xpath(bayiEmailTlkmVal).sendKeys(emailtt())
        }
        sleep(2000)
        if (xpath(bayiEmailTlkmBtn).isEnabled()) {
            xpath(bayiEmailTlkmBtn).click()
        }
        xpathload(bayiEmailSec)
        if (xpath(bayiEmailSec).isEnabled()) {
            xpath(bayiEmailSec).click()
        }
        sleep(2000)
        if (xpath(bayiEmailDiger).isEnabled()) {
            xpath(bayiEmailDiger).click()
        }
        sleep(2000)
        if (xpath(bayiEmailDigerVal).isEnabled()) {
            xpath(bayiEmailDigerVal).sendKeys(email())
        }
        sleep(2000)
        if (xpath(bayiEmaildigerBtn).isEnabled()) {
            xpath(bayiEmaildigerBtn).click()
        }

        if ((id(jss(memoID)).isEnabled())) {
            id(jss(memoID)).sendKeys("12345")
        }
        sleep(2000)
        if (xpath(ileriBtn).isDisplayed()) {
            xpath(ileriBtn).click()
        }
    }

    public void basvurusuzTab11(String partnerType) {



        idload(bayiTipi)
        if ((id(jss(bayiTipi)).isEnabled())) {
            id(jss(bayiTipi)).click()
        }
        sleep(2000)
        list_click(partnerType)
        sleep(1000)
        if ((id(jss(bayiTicUnvan)).isEnabled())) {
            id(jss(bayiTicUnvan)).sendKeys(isim())
        }
        if ((id(jss(bayiTabAdi)).isEnabled())) {
            id(jss(bayiTabAdi)).sendKeys(isim())
        }

        idload(bolge)
        if ((id(jss(bolge)).isEnabled())) {
            id(jss(bolge)).click()
            sleep(1000)
            list_click(bolgeIstAvr)
        }
        sleep(1000)
        //xpathload(bolgeSec)


        /*xpathload(bolgeIstAvr)
        if (xpath(bolgeIstAvr).isDisplayed()) {
            xpath(bolgeIstAvr).click()
        }*/
        idload(il)
        if ((id(jss(il)).isEnabled())) {
            id(jss(il)).click()
            sleep(1000)
            list_click(ilIstanbul)
        }
        //xpathload(ilSec)

        sleep(1000)
        idload(ilce)
        if ((id(jss(ilce)).isEnabled())) {
            id(jss(ilce)).click()
            sleep(1000)
            list_click(ilceAvc)
        }

        sleep(1000)
        if ((id(jss(adres)).isEnabled())) {
            id(jss(adres)).sendKeys("EDM Testttt adress")
        }
        if ((id(jss(binaNo)).isEnabled())) {
            id(jss(binaNo)).sendKeys("33")
        }
        if ((id(jss(kapiNo)).isEnabled())) {
            id(jss(kapiNo)).sendKeys("5")
        }
        if ((id(jss(postaKodu)).isEnabled())) {
            id(jss(postaKodu)).sendKeys("34444")
        }
        if ((id(jss(adresKodu)).isEnabled())) {
            id(jss(adresKodu)).sendKeys("123")
        }
        if ((id(jss(normKodu)).isEnabled())) {
            id(jss(normKodu)).sendKeys("1234")
        }

        if ((id(jss(distributorListbox)).isEnabled())) {
            id(jss(distributorListbox)).click()
            sleep(1000)
            list_click(distMobiltel)
        }
        //   xpath(distributorSec).click()

        sleep(1000)
        if ((id(jss(distEkleButon)).isEnabled())) {
            id(jss(distEkleButon)).click()
        }
        // xpath(distBtn).click()
        sleep(1000)
        if ((id(jss(bayiKontakTip)).isEnabled())) {
            id(jss(bayiKontakTip)).click()
            sleep(1000)
            list_click(bayiIletSecTel)
        }

        sleep(1000)
        if ((id(jss(bayiKontakNo)).isEnabled())) {
            id(jss(bayiKontakNo)).sendKeys(tel())
        }
        sleep(1000)
        if (xpath(bayiIletTelBtn).isEnabled()) {
            xpath(bayiIletTelBtn).click()
        }
        sleep(1000)
        if ((id(jss(sirketTipi)).isEnabled())) {
            id(jss(sirketTipi)).click()
        }
        sleep(2000)
        list_click(sirketSermaye)
        xpathload(popupTamam)
        if (xpath(popupTamam).isEnabled()) {
            xpath(popupTamam).click()
        }

        sleep(2000)

        if (id(jss(vergiNo)).isEnabled()) {
            id(jss(vergiNo)).sendKeys(random_vergi_no())
        }
        sleep(2000)
        if (xpath(sayfabostikla).isEnabled()) {
            xpath(sayfabostikla).click()
        }
        xpathload(popupTamam)
        if (xpath(popupTamam).isEnabled()) {
            xpath(popupTamam).click()
        }


        sleep(2000)
        if ((id(jss(vergiDaire)).isEnabled())) {
            id(jss(vergiDaire)).sendKeys(TcOlustur())
        }
        sleep(2000)
        if (xpath(sayfabostikla).isEnabled()) {
            xpath(sayfabostikla).click()
        }
        sleep(1000)
        if ((id(jss(bayiSahibiTC)).isEnabled())) {
            id(jss(bayiSahibiTC)).sendKeys(TcOlustur())
        }
        sleep(1000)
        if (xpath(sayfabostikla).isEnabled()) {
            xpath(sayfabostikla).click()
        }
        xpathload(popupTamam)
        if (xpath(popupTamam).isEnabled()) {
            xpath(popupTamam).click()
        }

        /*sleep(2000)
        if ((id(jss(vergiDaire)).isEnabled())) {
            id(jss(vergiDaire)).sendKeys(TcOlustur())
        }*/
        if ((id(jss(bayiSahibiAd)).isEnabled())) {
            id(jss(bayiSahibiAd)).sendKeys(isim())
        }
        if ((id(jss(bayiSahibiSoyad)).isEnabled())) {
            id(jss(bayiSahibiSoyad)).sendKeys(isim())
        }
        sleep(2000)
        // xpathload(bayiShbEmailSec)
        if ((xpath(bayiShbEmailSec).isEnabled())) {
            xpath(bayiShbEmailSec).click()
            sleep(2000)
        }
        list_click(bayiSahibiTlkmMail)
        sleep(1000)
        xpathload(bayiSahibiTlkmMail)
        if (xpath(bayiSahibiTlkmMail).isEnabled()) {
            xpath(bayiSahibiTlkmMail).click()
        }

        sleep(2000)
        xpathload(bayiShbEmailSec)
        if (xpath(bayiShbEmailSec).isEnabled()) {
            xpath(bayiShbEmailSec).click()
        }
        sleep(2000)
        if (xpath(bayiSahibiDigerMail).isEnabled()) {
            xpath(bayiSahibiDigerMail).click()
        }
        sleep(2000)
        if (xpath(bayiSahibiDigerMailVal).isEnabled()) {
            xpath(bayiSahibiDigerMailVal).sendKeys(email())
        }
        sleep(2000)
        if (xpath(bayiSahibiDigerMailBtn).isEnabled()) {
            xpath(bayiSahibiDigerMailBtn).click()
        }
        sleep(2000)
        if ((id(jss(bayiSahibiTel)).isEnabled())) {
            id(jss(bayiSahibiTel)).sendKeys(tel())
        }
        sleep(1000)
        if ((id(jss(bayiEmailTip)).isEnabled())) {
            id(jss(bayiEmailTip)).click()
        }
        sleep(2000)
        if (xpath(bayiEmailTlkm).isEnabled()) {
            xpath(bayiEmailTlkm).click()
        }
        sleep(2000)
        if (xpath(bayiEmailTlkmVal).isEnabled()) {
            xpath(bayiEmailTlkmVal).sendKeys(emailtt())
        }
        sleep(2000)
        if (xpath(bayiEmailTlkmBtn).isEnabled()) {
            xpath(bayiEmailTlkmBtn).click()
        }
        xpathload(bayiEmailSec)
        if (xpath(bayiEmailSec).isEnabled()) {
            xpath(bayiEmailSec).click()
        }
        sleep(2000)
        if (xpath(bayiEmailDiger).isEnabled()) {
            xpath(bayiEmailDiger).click()
        }
        sleep(2000)
        if (xpath(bayiEmailDigerVal).isEnabled()) {
            xpath(bayiEmailDigerVal).sendKeys(email())
        }
        sleep(2000)
        if (xpath(bayiEmaildigerBtn).isEnabled()) {
            xpath(bayiEmaildigerBtn).click()
        }

        if ((id(jss(memoID)).isEnabled())) {
            id(jss(memoID)).sendKeys("12345")
        }
        sleep(2000)
        if (xpath(ileriBtn).isEnabled()) {
            xpath(ileriBtn).click()
        }
    }

    public void anaMenu(String menuSec) {
        xpathload(bayiyonetimi)
        if (xpath(bayiyonetimi).isEnabled()) {
            xpath(bayiyonetimi).click()
        }
        sleep(1000)
       menu_click(menuSec)
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

