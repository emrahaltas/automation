package BayiIptal.Function
/**
 * Created by murat_PRM on 14.6.2017.
 */
class EDMBasvurusuzAcilis extends BayiIptal.Function.BasvurusuzAcilis{
    void eDMBasvurusuzAcilis(){


        login()
        anaMenu()
        if (sirketSahis)
        {
            basvurusuzTab1(bayiEDM)
        }
        else
        {
            basvurusuzTab11(bayiEDM)
        }
        //basvurusuzTab1(bayiEDM)
        basvurusuzTab2()
        basvurusuzTab3()
      /*  xpathload(bayiyonetimi)
        sleep(1000)
        xpath(basvurusuzAcilis).click()
        //xpathload(bayiTipSec)
        idload(bayiTipi)
        xpathload(bayiEDM)
        sleep(1000)
        id(jss(bayiTicUnvan)).sendKeys(isim())
        id(jss(bayiTabAdi)).sendKeys(isim())
        idload(bolge)
        //xpathload(bolgeSec)
        xpathload(bolgeIstAvr)
        idload(il)
        //xpathload(ilSec)
        sleep(1000)
        xpath(ilIstanbul).click()
        sleep(1000)
        idload(ilce)
        sleep(1000)
        xpath(ilceAvc).click()
        sleep(1000)
        id(jss(adres)).sendKeys("EDM Testttt adress")
        id(jss(binaNo)).sendKeys("33")
        id(jss(kapiNo)).sendKeys("5")
        id(jss(postaKodu)).sendKeys("34444")
        id(jss(adresKodu)).sendKeys("123")
        id(jss(normKodu)).sendKeys("1234")
        id(jss(distributorListbox)).click()
        id(jss(teminatMektup)).click()
     //   xpath(distributorSec).click()
        sleep(1000)
        xpath(distMobiltel).click()
        sleep(1000)
        id(jss(distEkleButon)).click()
       // xpath(distBtn).click()
        sleep(1000)
        id(jss(bayiKontakTip)).click()
        sleep(1000)
        xpath(bayiIletSecTel).click()
        sleep(1000)
        id(jss(bayiKontakNo)).sendKeys(tel())
        sleep(1000)
        xpath(bayiIletTelBtn).click()
        sleep(1000)
        id(jss(sirketTipi)).click()
        sleep(2000)
        xpath(sirketSahis).click()
        sleep(1000)
        id(jss(bayiSahibiTC)).sendKeys(TcOlustur())
        sleep(1000)
        xpath(sayfabostikla).click()
        xpathload(popupTamam)
        sleep(2000)
        if ( (id(jss(vergiDaire)).isEnabled())){
            id(jss(vergiDaire)).sendKeys(TcOlustur())
        }

        sleep(1000)
        id(jss(vergiDaire)).getText()
        id(jss(bayiSahibiAd)).sendKeys(isim())
        id(jss(bayiSahibiSoyad)).sendKeys(isim())
        sleep(2000)
        xpathload(bayiShbEmailSec)
        sleep(1000)
        xpathload(bayiSahibiTlkmMail)
        sleep(2000)
        xpathload(bayiShbEmailSec)
        sleep(2000)
        xpath(bayiSahibiDigerMail).click()
        sleep(2000)
        xpath(bayiSahibiDigerMailVal).sendKeys(email())
        sleep(2000)
        xpath(bayiSahibiDigerMailBtn).click()
        sleep(2000)
        id(jss(bayiSahibiTel)).sendKeys(tel())
         sleep(1000)
        id(jss(bayiEmailTip)).click()
         sleep(2000)
        xpath(bayiEmailTlkm).click()
        sleep(3000)
        xpath(bayiEmailTlkmVal).sendKeys(emailtt())
        sleep(3000)
        xpath(bayiEmailTlkmBtn).click()
        sleep(4000)
        xpath(bayiEmailSec).click()
        sleep(3000)
        xpath(bayiEmailDiger).click()
        sleep(3000)
        xpath(bayiEmailDigerVal).sendKeys(email())
        sleep(3000)
        xpath(bayiEmaildigerBtn).click()
        sleep(3000)
        xpath(ileriBtn)click()
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
        xpathload(tamamBtn)
        sleep(10000)
        //xpath(bayikodupopup).getText().substring(37,43).isNumber()*/
    }

}

