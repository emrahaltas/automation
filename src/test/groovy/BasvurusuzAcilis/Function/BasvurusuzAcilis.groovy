package BasvurusuzAcilis.Function

import Login.Function.GirisBasarili
import Resources.Resources

/**
 * Created by murat_PRM on 14.6.2017.
 */
class BasvurusuzAcilis extends GirisBasarili {


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

        /* SECILNS 21.11.2018 */

        sleep(1000)
        if ((id(jss(ksbkbText)).isEnabled())) {
            id(jss(ksbkbText)).sendKeys(randomSayi())
        }
        if (id(jss(ksbkbCombo)).isEnabled()) {
            id(jss(ksbkbCombo)).click()
            sleep(1000)
            list_click("TRY")
        }


        sleep(1000)
        if ((id(jss(netKiraTutari)).isEnabled())) {
            id(jss(netKiraTutari)).sendKeys(randomSayi())
        }
        if (id(jss(netKiraTutariBirim)).isEnabled()) {
            id(jss(netKiraTutariBirim)).click()
        }
        xpathload(paraBirimi)
        if (xpath(paraBirimi).isEnabled()) {
            xpath(paraBirimi).click()

        }
        if (id(jss(vergiKategorisi)).isEnabled()) {
            id(jss(vergiKategorisi)).click()
        }
        if (xpath(vergiKategorisiSec).isEnabled()) {
            //vergi kategorisi secince mal sahibini otomatik secer (Firma - Sahıs)
            xpath(vergiKategorisiSec).click()

        }


        if (id(jss(havaParasi)).isEnabled()) {
            id(jss(havaParasi)).sendKeys(randomSayi())
        }

        if (id(jss(havaParasiBirim)).isEnabled()) {
            id(jss(havaParasiBirim)).click()
        }
        sleep(1000)

        if (xpath(paraBirimi).isEnabled()) {
            xpath(paraBirimi).click()
        }

        if (id(jss(depozito)).isEnabled()) {
            id(jss(depozito)).sendKeys(randomSayi())
        }

        if (id(jss(depozitoBirim)).isEnabled()) {
            id(jss(depozitoBirim)).click()
        }
        sleep(1000)

        if (xpath(paraBirimi).isEnabled()) {
            xpath(paraBirimi).click()
        }

        if (id(jss(emlakciKomisyonu)).isEnabled()) {
            id(jss(emlakciKomisyonu)).sendKeys(randomSayi())
        }
        if (id(jss(emlakciKomisyonuBirim)).isEnabled()) {
            id(jss(emlakciKomisyonuBirim)).click()
        }

        sleep(1000)

        if (xpath(paraBirimi).isEnabled()) {
            xpath(paraBirimi).click()
        }

        if (xpath(kiraSozlesmeTarihi).isEnabled()) {
            xpath(kiraSozlesmeTarihi).click()
        }
        if (xpath(tarihSec).isEnabled()) {
            xpath(tarihSec).click()
        }
        if (id(jss(kiraSozlesmeSuresi)).isEnabled()) {
            id(jss(kiraSozlesmeSuresi)).sendKeys(randomSayi())
        }
        if (id(jss(kiraSozlesmeSuresiCombo)).isEnabled()) {
            id(jss(kiraSozlesmeSuresiCombo)).click()
        }
        if (xpath(kiraSozlesmeSuresiSec).isEnabled()) {
            xpath(kiraSozlesmeSuresiSec).click()
        }

        if (id(jss(lokasyon)).isEnabled()) {
            id(jss(lokasyon)).click()
        }
        if (xpath(lokasyonSec).isEnabled()) {
            xpath(lokasyonSec).click()
        }
        if (xpath(avmAcilisTarihi).isEnabled()) {
            xpath(avmAcilisTarihi).click()
        }
        if (xpath(tarihSec).isEnabled()) {
            xpath(tarihSec).click()
        }
        if (id(jss(magazaLokasyonTipi)).isEnabled()) {
            id(jss(magazaLokasyonTipi)).click()
        }
        xpathload(lokTipSec)
        if (xpath(lokTipSec).isEnabled()) {
            xpath(lokTipSec).click()
        }
        /* xpathload(malSahibiTipi)
             if (id(jss(malSahibiTipi)).isEnabled()) {
                 id(jss(malSahibiTipi)).click()
             }
             xpathload(malSahibiTipiSec)
             if (xpath(malSahibiTipiSec).isEnabled()) {
                 xpath(malSahibiTipiSec).click()
             }*/
        if (id(jss(malSahibiFirmaAdi)).isEnabled()) {
            id(jss(malSahibiFirmaAdi)).sendKeys(isim())
        }

        if (id(jss(malSahibiTC)).isEnabled()) {
            id(jss(malSahibiTC)).sendKeys(TcOlustur())
        }
        if (id(jss(malSahibiVergiNo)).isEnabled()) {
            id(jss(malSahibiVergiNo)).sendKeys(tel())
        }
        if (id(jss(malSahibiHesap)).isEnabled()) {
            id(jss(malSahibiHesap)).sendKeys(TcOlustur())
        }
        if (id(jss(malSahibiTel)).isEnabled()) {
            id(jss(malSahibiTel)).sendKeys(tel())
        }
        if (id(jss(malSahibiIbanNo)).isEnabled()) {
            id(jss(malSahibiIbanNo)).sendKeys("TR840001000033566099835001")
        }
        if (id(jss(ekspertizDegeri)).isEnabled()) {
            id(jss(ekspertizDegeri)).sendKeys(randomSayi())
        }
        if (id(jss(ekspertizDegeriBirim)).isEnabled()) {
            id(jss(ekspertizDegeriBirim)).click()
        }

        sleep(1000)

        if (xpath(paraBirimi).isEnabled()) {
            xpath(paraBirimi).click()
        }
        xpathload(expertizTarihi)
        if (xpath(expertizTarihi).isEnabled()) {
            xpath(expertizTarihi).click()
        }
        if (xpath(tarihSec).isEnabled()) {
            xpath(tarihSec).click()
        }
        if (id(jss(expertizRefNo)).isEnabled()) {
            id(jss(expertizRefNo)).sendKeys(TcOlustur())
        }
        if (xpath(ileriBtn).isEnabled()) {
            xpath(ileriBtn).click()
        }

    }

    public void basvurusuzTab3() {


        xpathload(bayiTransfer)
        xpath(bayiTransfer).click()
        sleep(1000)
        if (xpath(bayiTransferSec).isEnabled()) {
            xpath(bayiTransferSec).click()
        }
        sleep(1000)

      /*xpathload(rakipMevcutTipi)
        xpath(rakipMevcutTipi).click()


        sleep(1000)
        if (xpath(rakipMevcutTipiSec).isEnabled()){
            xpath(rakipMevcutTipiSec).click()
        }*/



        id(jss(magazaIsim)).sendKeys("testtt")
        id(jss(magazaUzaklik)).sendKeys("22")

        if (id(jss(magazaBuyukluk)).isEnabled()) {
            id(jss(magazaBuyukluk)).sendKeys("33")
        }

        if (id(jss(cepheAdi)).isEnabled()) {
            id(jss(cepheAdi)).click()
            sleep(1000)
            list_click(cepheAdiSec)
        }
        sleep(1000)
        id(jss(yukseklikY)).sendKeys("5")
        id(jss(genislikX)).sendKeys("5")
        sleep(1000)
        if (xpath(cepheEkle).isEnabled()) {
            xpath(cepheEkle).click()
        }
        sleep(1000)
        if (xpath(dekorasyon).isEnabled()) {
            xpath(dekorasyon).click()
            sleep(1000)
            xpath(dekorasyonSec).click()
        }



        sleep(1000)
      try {
          if (id(jss(dekorasyonMaliyeti)).isEnabled()) {
              id(jss(dekorasyonMaliyeti)).sendKeys("5000")
          }
          if (id(jss(dekorasyonParaBirimi)).isEnabled()) {
              id(jss(dekorasyonParaBirimi)).click()
          }
          if (xpath(dekorasyonParaBirimiSec).isEnabled()) {
              xpath(dekorasyonParaBirimiSec).click()
          }

      }
      catch (Exception e){}

        sleep(1000)


        if (xpath(tabelaIstegi).isEnabled()) {
            xpath(tabelaIstegi).click()
            sleep(1500)
            xpath(tabelaIstegiSec).click()
        }


        sleep(1000)
        if (id(jss(sektorelTec)).isEnabled()) {
            id(jss(sektorelTec)).click()
        }

        sleep(1000)
        if (xpath(sektorelTecSec).isEnabled()) {
            xpath(sektorelTecSec).click()
        }

        if (id(jss(yakindakiTurkcell)).isEnabled()) {
            id(jss(yakindakiTurkcell)).sendKeys("5")
        }

        if (id(jss(yakindakiVodafone)).isEnabled()) {
            id(jss(yakindakiVodafone)).sendKeys("5")
        }

        if (id(jss(yakindakiTTNet)).isEnabled()) {
            id(jss(yakindakiTTNet)).sendKeys("5")
        }


        sleep(1000)
        if (xpath(bayiIl).isEnabled()) {
            xpath(bayiIl).click()
            sleep(1000)
            list_click(bayiIlSec)
        }

        sleep(1000)
        if (xpath(bayiIlce).isEnabled()) {
            xpath(bayiIlce).click()
            sleep(1000)
            xpath(bayiIlceSec).click()
            sleep(1000)
            xpath(bayiIlIlceEkle).click()
        }

        sleep(1000)
        xpathload(banka)
        if (xpath(banka).isEnabled()) {
            xpath(banka).click()
            //xpath(bankaSec).click()
        }
        sleep(2000)
        xpathload(banka)
        list_click(bankaAdiSec)


        sleep(2000)
        xpathload(bankaSube)
        if (xpath(bankaSube).isEnabled()) {
            xpath(bankaSube).click()

            //xpath(bankaSubeSec).click()
        }
        sleep(2000)
        xpathload(bankaSube)
        list_click(bankaSubeAdi)


        sleep(1000)
        if (id(jss(bankaHspNo)).isEnabled()) {
            id(jss(bankaHspNo)).sendKeys("2342343242")
        }
        if (id(jss(bankaIBAN)).isEnabled()) {
            id(jss(bankaIBAN)).sendKeys("TR870001000034321841755002")
        }
        if (id(jss(kordinatX)).isEnabled()) {
            id(jss(kordinatX)).sendKeys("4")
        }
        if (id(jss(kordinatY)).isEnabled()) {
            id(jss(kordinatY)).sendKeys("4")
        }
        sleep(1000)
        if (id(jss(SY)).isEnabled()) {
            id(jss(SY)).click()
        }
        sleep(1000)

        if (xpath(SYSec).isEnabled()) {
            xpath(SYSec).click()
        }

        sleep(2000)
        idload(SYDestek)
        if (id(jss(SYDestek)).isEnabled()) {
            id(jss(SYDestek)).click()
        }

        sleep(2000)
        if (xpath(SYDestekSec).isEnabled()) {
            xpath(SYDestekSec).click()
        }
        /* sleep(1000)
         if (id(jss(kaliteYon)).isEnabled()){
             id(jss(kaliteYon)).click()
         }
         sleep(2000)
         if (xpath(kaliteYonSec).isEnabled()){
             xpath(kaliteYonSec).click()
         }

         sleep(1000)
         if (id(jss(ttnetYetki)).isEnabled()){
             id(jss(ttnetYetki)).click()
         }
         if (xpath(ttnetYetkiSec).isEnabled()) {
             xpath(ttnetYetkiSec).click()
         }
         */
        sleep(1000)
        if (id(jss(donanimAdi)).isEnabled()) {
            id(jss(donanimAdi)).click()
        }
        if (xpath(donanimAdiSec).isEnabled()) {
            xpath(donanimAdiSec).click()
        }
        sleep(1000)
        if (id(jss(tedarikciAdi)).isEnabled()) {
            id(jss(tedarikciAdi)).click()
        }
        sleep(1500)
        if (xpath(tedarikciAdiSec).isEnabled()) {
            xpath(tedarikciAdiSec).click()
        }

        if (id(jss(donanimAdet)).isEnabled()) {
            id(jss(donanimAdet)).sendKeys("5")
        }
        if (xpath(donanimSec).isEnabled()) {
            xpath(donanimSec).click()
        }
        sleep(1000)
        if (id(jss(statikIP)).isEnabled()) {
            id(jss(statikIP)).sendKeys("11.11.11.11")
        }

        /*    sleep(1000)
            if (id(jss(aramaKabini)).isEnabled()){
                id(jss(aramaKabini)).sendKeys("5")
            }

            if (xpath(aramaKabiniSec).isEnabled()) {
                xpath(aramaKabiniSec).click()
            }
    */
        if (xpath(xdsl).isEnabled()) {
            xpath(xdsl).sendKeys("1234567890")
        }

        sleep(1000)
        if (xpath(sozTarih).isEnabled()) {
            xpath(sozTarih).click()
        }
        sleep(1000)
        if (xpath(sozTarihSec).isEnabled()) {
            xpath(sozTarihSec).click()
        }
        sleep(1000)
        if (xpath(ileri2Btn).isEnabled()) {
            xpath(ileri2Btn).click()
        }
    }


    public void basvurusuzTab1(String partnerType, String anaBayiGir) {


        idload(bayiTipi)
        if ((id(jss(bayiTipi)).isEnabled())) {
            id(jss(bayiTipi)).click()
        }
        sleep(2000)
        if (xpath(partnerType).isEnabled()) {
            xpath(partnerType).click()
        }

        if ((id(jss(bayiAnaKodu)).isEnabled())) {
            id(jss(bayiAnaKodu)).sendKeys(anaBayiGir)
        }
        sleep(1000)
        if ((id(jss(bayiTicUnvan)).isEnabled())) {
            id(jss(bayiTicUnvan)).sendKeys(isim())
        }
        if ((id(jss(bayiTabAdi)).isEnabled())) {
            id(jss(bayiTabAdi)).sendKeys(isim())
        }

        xpathload(bolge)
        if ((xpath(bolge).isEnabled())) {
            xpath(bolge).click()
            sleep(2000)
            list_click(bolgeAlternatifKanal)
        }
        //xpathload(bolgeSec)
        idload(il)
        if ((id(jss(il)).isEnabled())) {
            id(jss(il)).click()
        }
        //xpathload(ilSec)
        sleep(1000)
        list_click(ilArtvin)
        sleep(1000)
        idload(ilce)
        if (id(jss(ilce)).isEnabled()) {
            id(jss(ilce)).click()
        }
        sleep(1000)
        list_click(ilceHopa)
        sleep(1000)
        if ((id(jss(adres)).isEnabled())) {
            id(jss(adres)).sendKeys("EDM Test")
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

        if (xpath(distributorListbox).isEnabled()) {
            xpath(distributorListbox).click()
            sleep(1000)
            xpath(distMobiltel).click()
            sleep(500)
            id(jss(distEkleButon)).click()
        }
        //   xpath(distributorSec).click()

        // xpath(distBtn).click()
        sleep(1000)
        if ((id(jss(bayiKontakTip)).isEnabled())) {
            id(jss(bayiKontakTip)).click()
        }
        sleep(1000)
        xpathload(bayiIletSecTel)
        if (xpath(bayiIletSecTel).isEnabled()) {
            xpath(bayiIletSecTel).click()
        }
        sleep(1000)
        if ((id(jss(bayiKontakNo)).isEnabled())) {
            id(jss(bayiKontakNo)).sendKeys(tel())
        }
        xpathload(bayiIletTelBtn)
        if (xpath(bayiIletTelBtn).isEnabled()) {
            xpath(bayiIletTelBtn).click()
        }
        xpathload(sirketTipi)
        if ((xpath(sirketTipi).isEnabled())) {
            xpath(sirketTipi).click()
            sleep(1000)
            xpath(sirketSahis).click()
        }
        sleep(2000)

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
        try {
            xpathload(popupTamam)
            if (xpath(popupTamam).isEnabled()) {
                xpath(popupTamam).click()
            }
        }
        catch (Exception e)
        {

        }
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

        // xpathload(bayiShbEmailSec)
        if (xpath(bayiShbEmailSec).isEnabled()) {
            xpath(bayiShbEmailSec).click()
        }
        sleep(1000)
        xpathload(bayiSahibiTlkmMail)

            if (xpath(bayiSahibiTlkmMail).isEnabled()) {
                xpath(bayiSahibiTlkmMail).click()
            }

        sleep(2000)
        xpathload(bayiShbEmailSec)
        try {
            if (xpath(bayiShbEmailSec).isEnabled()) {
                xpath(bayiShbEmailSec).click()

            }
        }
        catch (Exception e) {
            xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/button[1]").click()
            sleep(2000)
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
        try {
            if (xpath(bayiEmailTlkm).isEnabled()) {
                xpath(bayiEmailTlkm).click()
                sleep(1000)
                xpath(bayiEmailTlkmVal).sendKeys(emailtt())
                sleep(1000)
                xpath(bayiEmailTlkmBtn).click()
            }
        }
      catch (Exception e) {
          xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/button[1]").click()
          sleep(2000)
      }

      xpathload(bayiEmailSec)
      if (xpath(bayiEmailSec).isEnabled()) {
          xpath(bayiEmailSec).click()
          sleep(1000)
      }
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


    public void basvurusuzTab11(String partnerType,String anaBayiGir) {



        idload(bayiTipi)
        if ((id(jss(bayiTipi)).isEnabled())) {
            id(jss(bayiTipi)).click()
        }
        sleep(2000)
        if (xpath(partnerType).isEnabled()){
            xpath(partnerType).click()

        }
        sleep(1000)
        if ((id(jss(bayiAnaKodu)).isEnabled())) {
            id(jss(bayiAnaKodu)).sendKeys(anaBayiGir)
        }
        if ((id(jss(bayiTicUnvan)).isEnabled())) {
            id(jss(bayiTicUnvan)).sendKeys(isim())
        }

        if ((id(jss(bayiTabAdi)).isEnabled())) {
            id(jss(bayiTabAdi)).sendKeys(isim())
        }

        idload(bolge)
        if ((id(jss(bolge)).isEnabled())) {
            id(jss(bolge)).click()
        }
        //xpathload(bolgeSec)
        xpathload(bolgeIstAvr)
        if (xpath(bolgeIstAvr).isEnabled()) {
            xpath(bolgeIstAvr).click()
        }
        idload(il)
        if ((id(jss(il)).isEnabled())) {
            id(jss(il)).click()
        }
        //xpathload(ilSec)
        sleep(1000)
        if (xpath(ilIstanbul).isEnabled()) {
            xpath(ilIstanbul).click()
        }
        sleep(1000)
        idload(ilce)
        if ((id(jss(ilce)).isEnabled())) {
            id(jss(ilce)).click()
        }
        sleep(1000)
        if (xpath(ilceAvc).isEnabled()) {
            xpath(ilceAvc).click()
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
        }
        //   xpath(distributorSec).click()
        sleep(1000)
        if (xpath(distMobiltel).isEnabled()) {
            xpath(distMobiltel).click()
        }
        sleep(1000)
        if ((id(jss(distEkleButon)).isEnabled())) {
            id(jss(distEkleButon)).click()
        }
        // xpath(distBtn).click()
        sleep(1000)
        if ((id(jss(bayiKontakTip)).isEnabled())) {
            id(jss(bayiKontakTip)).click()
        }
        sleep(1000)
        if (xpath(bayiIletSecTel).isEnabled()) {
            xpath(bayiIletSecTel).click()
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
        if (xpath(sirketSermaye).isEnabled()) {
            xpath(sirketSermaye).click()
        }

        xpathload(popupTamam)
        if (xpath(popupTamam).isEnabled()) {
            xpath(popupTamam).click()
        }

        sleep(2000)

        if (id(jss(vergiNo)).isEnabled()) {
            id(jss(vergiNo)).sendKeys(random_vergi_no())
        }
        sleep(2000)
        xpathload(popupTamam)
        if (xpath(popupTamam).isEnabled()) {
            xpath(popupTamam).click()
        }
        sleep(2000)
        if (xpath(sayfabostikla).isEnabled()) {
            xpath(sayfabostikla).click()
        }

        sleep(2000)
        if ((id(jss(vergiDaire)).isEnabled())) {
            id(jss(vergiDaire)).sendKeys(TcOlustur())
        }
        sleep(1000)
        if ((id(jss(bayiSahibiTC)).isEnabled())) {
            id(jss(bayiSahibiTC)).sendKeys(TcOlustur())
        }
        sleep(1000)
        if (xpath(sayfabostikla).isEnabled()) {
            xpath(sayfabostikla).click()
        }
        try {
            xpathload(popupTamam)
            if (xpath(popupTamam).isEnabled()) {
                xpath(popupTamam).click()
            }
        }
        catch (Exception e)
        {

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
        if (xpath(bayiShbEmailSec).isEnabled()) {
            xpath(bayiShbEmailSec).click()
        }
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


    //BasvurusuzTab4
    public String basvurusuzTab4() {
        idload(tamamButton)
        if (id(jss(tamamButton)).isEnabled()) {
            id(jss(tamamButton)).click()
        }
        sleep(3000)
        xpathload(PopupTamam)
       /* String bayiKodu = xpath(PopupTamam).getText().substring(37, 44).toString()
        xpath(PopupOnayEvet).click()
        return bayiKodu*/
        xpathload("/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/button[1]")
        xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/button[1]").click()
        sleep(10000)
        String txt="/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]"
        // String bayiKodu = xpath(txt).getText().substring(0, 7).toString()
       // System.out.println(xpath(txt).getText().substring(0, 7).toString())

    }


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



    public void basvurusuzTabSube1(String partnerType, String anaBayiGir) {


        idload(bayiTipi)
        if ((id(jss(bayiTipi)).isEnabled())) {
            id(jss(bayiTipi)).click()
        }
        sleep(2000)
        if (xpath(partnerType).isEnabled()) {
            xpath(partnerType).click()
        }

        if ((id(jss(bayiAnaKodu)).isEnabled())) {
            id(jss(bayiAnaKodu)).sendKeys(anaBayiGir)
        }
        sleep(1000)
        if ((id(jss(bayiTicUnvan)).isEnabled())) {
            id(jss(bayiTicUnvan)).sendKeys(isim())
        }
        if ((id(jss(bayiTabAdi)).isEnabled())) {
            id(jss(bayiTabAdi)).sendKeys(isim())
        }

        //xpathload(bolgeSec)
        idload(il)
        if ((id(jss(il)).isEnabled())) {
            id(jss(il)).click()
        }
        //xpathload(ilSec)
        sleep(1000)
        list_click(ilIstanbul)


        sleep(1000)
        idload(ilce)
        if (id(jss(ilce)).isEnabled()) {
            id(jss(ilce)).click()
        }
        sleep(1000)
        list_click(ilceAvc)
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

        if (xpath(distributorListbox).isEnabled()) {
            xpath(distributorListbox).click()
            sleep(1000)
            xpath(distMobiltel).click()
            sleep(500)
            id(jss(distEkleButon)).click()
        }
        //   xpath(distributorSec).click()

        // xpath(distBtn).click()
        sleep(1000)
        if ((id(jss(bayiKontakTip)).isEnabled())) {
            id(jss(bayiKontakTip)).click()
        }
        sleep(1000)
        if (xpath(bayiIletSecTel).isEnabled()) {
            xpath(bayiIletSecTel).click()
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
        /*
        if ((xpath(sirketTipi).isEnabled())) {
            xpath(sirketTipi).click()
            sleep(1000)
            xpath(sirketSahis).click()
        }
        sleep(2000)


        if (xpath(sirketSermaye).isEnabled()) {
            xpath(sirketSermaye).click()
        }

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
        }
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
        */
        // xpathload(bayiShbEmailSec)

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
        sleep(2000)
        xpathload("/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/button[1]")
        sleep(2000)
       xpath("/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/button[1]").click()

    }
}


