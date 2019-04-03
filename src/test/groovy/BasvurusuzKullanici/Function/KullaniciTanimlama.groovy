package BasvurusuzKullanici.Function

import Login.Function.GirisBasarili
import DbConnection.DbConnectTekag
import Resources.Resources

import java.text.DateFormat
import java.text.SimpleDateFormat

class KullaniciTanimlama extends Resources {

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

    public void kullaniciTanimlamaTab1(String dbBayiKodu) {

        sleep(1000)
        if (id(jss(satisNoktasiKoduTextbox)).isEnabled()) {
            id(jss(satisNoktasiKoduTextbox)).sendKeys(dbBayiKodu)
        }
        sleep(3000)
        if (id(jss(araButon)).isEnabled()) {
            id(jss(araButon)).click()
        }
        sleep(3000)
        idload(TCKimlikNoTextbox)
        if (id(jss(TCKimlikNoTextbox)).isEnabled()) {
            //id(jss(TCKimlikNoTextbox)).sendKeys("13561030058")
            id(jss(TCKimlikNoTextbox)).sendKeys(TcOlustur())
        }
        sleep(3000)
        idload(pozisyonTipiCombobox)
        if (id(jss(pozisyonTipiCombobox)).isEnabled()) {
            id(jss(pozisyonTipiCombobox)).click()
        }

        sleep(1000)
        idload(bIleri)
        //sleep(1000)
        list_click(pozisyonTipi)
        sleep(1000)
        idload(pozisyonCombobox)
        if (id(jss(pozisyonCombobox)).isEnabled()) {
            id(jss(pozisyonCombobox)).click()
        }

        sleep(1000)
        list_clickContains(pozisyon)
        sleep(3000)
        if (id(jss(bIleri)).isEnabled()){
            id(jss(bIleri)).click()
        }
        try {
            xpathload(butonCarpi)
            if (xpath(butonCarpi).isEnabled()) {
                xpath(butonCarpi).click()
            }
        }
        catch (Exception ex) {
            /sleep(3000)
        xpathload(butonCarpi)
        if (xpath(butonCarpi).isEnabled()){
            xpath(butonCarpi).click()
        }
        sleep(1000)
        if (id(jss(bIleri)).isEnabled()){
            id(jss(bIleri)).click()
        }/
            id(jss(bIleri)).isEnabled()
            sleep(3000)
        }

        try {
            xpath(pUyariMesajiTamam).isEnabled()
            xpath(pUyariMesajiTamam).click()
            sleep(1000)
            id(jss(pozisyonTipiCombobox)).click()

            sleep(1000)
            list_click(pozisyonTipi2)
            sleep(1000)
            id(jss(pozisyonCombobox)).click()
            sleep(1000)
            list_clickContains(pozisyon2)
            sleep(1000)
            (id(jss(bIleri)).isEnabled())
            id(jss(bIleri)).click()

        }
        catch (Exception e)
         {

             id(jss(bIleri)).isEnabled()
             sleep(3000)

          }

    }

    public void kullaniciTanimlamaTab2() {
        sleep(7000)
        try {
            xpathload(pUyariMesajiTamam)
            if (xpath(pUyariMesajiTamam).isEnabled()) {
                xpath(pUyariMesajiTamam).click()
            }
        }
        catch (Exception e)
        {
            sleep(3000)
            sorguSonucu3(isimSorgu)
            if (id(jss(adiTextbox)).isEnabled()){
                id(jss(adiTextbox)).click()
                id(jss(adiTextbox)).sendKeys(liste.get(0))
            }

            if (id(jss(soyadiTextbox)).isEnabled()){
                id(jss(soyadiTextbox)).click()
                id(jss(soyadiTextbox)).sendKeys(liste.get(1))
            }
            //id(jss(adiTextbox)).sendKeys(liste.get(0))
            //id(jss(soyadiTextbox)).sendKeys(liste.get(1))
        }
       / if (xpath(pUyariMesajiTamam).isEnabled()){
            xpath(pUyariMesajiTamam).click()
        }
        sleep(3000)
        sorguSonucu3(isimSorgu)
        id(jss(adiTextbox)).sendKeys(liste.get(0))
        id(jss(soyadiTextbox)).sendKeys(liste.get(1))
/
       if (xpath(dogumTarihi).isEnabled()) {
            xpath(dogumTarihi).click()
            xpathload(tarihOncekiSayfa)
            xpath(tarihOncekiSayfa).click()
            xpath(tarihSec).click()
        }

        sleep(1000)
        idload(dogumYeriTextbox)
        if (id(jss(dogumYeriTextbox)).isEnabled()) {
            id(jss(dogumYeriTextbox)).sendKeys(sorguSonucu(IlAdiSorgu))
        }


        sleep(2000)
        idload(cinsiyet)
        id(jss(cinsiyet)).click()
        if (liste.get(2) == 'K') {
            sleep(2000)
            list_click(cinsiyetSecKadin)
        } else {
            sleep(1000)
            list_click(cinsiyetSecErkek)
        }
        sleep(1000)
        if (id(jss(iletisimBilgisiCombo)).isEnabled()){
            id(jss(iletisimBilgisiCombo)).click()
            sleep(1000)
            list_click(iletisimBilgisiCep)
        }


        sleep(1000)
        if (id(jss(iletisimNo)).isEnabled()){
          //  id(jss(iletisimNo)).click()
            sleep(1000)
            id(jss(iletisimNo)).sendKeys(tel())
        }
        sleep(1000)
        if (xpath(isletisimEkle).isEnabled()){
            xpath(isletisimEkle).click()
        }

        sleep(2000)
        if (xpath(cyCombo).isEnabled()) {
            xpath(cyCombo).click()
        }

        sleep(2000)
        if (xpath(cyEmailDiger).isEnabled()) {
            xpath(cyEmailDiger).click()
        }

        sleep(2000)
        if (xpath(cyEmailDigerVal).isEnabled()) {
            xpath(cyEmailDigerVal).click()
            xpath(cyEmailDigerVal).sendKeys(email())
        }

        sleep(2000)
        if (xpath(cyEmailBtn).isEnabled()) {
            //xpathload(cyEmailBtn)
            xpath(cyEmailBtn).click()
        }
        sleep(2000)
        if (xpath(cyCombo).isEnabled()) {
            xpath(cyCombo).click()
        }

        sleep(2000)
        xpathload(cyEmailTlkm)
        if (xpath(cyEmailTlkm).isEnabled()){
            xpath(cyEmailTlkm).click()
        }

        sleep(2000)
        xpathload(cyEmailBtn)
        if (xpath(cyEmailBtn).isEnabled()){
            xpath(cyEmailBtn).click()
        }

        sleep(6000)
        if (id(jss(sgkNoTextbox)).isEnabled()) {
            id(jss(sgkNoTextbox)).sendKeys(sgkNo())
        }

        sleep(2000)
       / if (xpath(iseBaslamaTarihi).isEnabled()){
            xpath(iseBaslamaTarihi).click()
        }/

        if (xpath(iseBaslamaTarihi).isEnabled()){
            xpath(iseBaslamaTarihi).sendKeys(simdikiZaman())
        }

        sleep(2000)
        xpathload(sgkGirisTarihi)
        if (xpath(sgkGirisTarihi).isEnabled()) {
            xpath(sgkGirisTarihi).click()
        }
            sleep(1000)
        if (xpath(sgkGirisTarihi).isEnabled()){
            xpath(sgkGirisTarihi).sendKeys(simdikiZaman())
        }

        sleep(6000)
        if ((id(jss(gozatAcikRizaMetni)).isEnabled())) {
            id(jss(gozatAcikRizaMetni)).click()
        }
        xpath(browseButton)
        if (xpath(browseButton).isEnabled()) {
            //https://www.youtube.com/watch?v=L0iEJv0xiz0
            xpath(browseButton).sendKeys(pdfFile)


        }
        sleep(2000)
        if (xpath(downloadForAcikRizaMetni).isEnabled()) {
            xpath(downloadForAcikRizaMetni).click()
        }

        sleep(2000)
        if (xpath(adliSicilKaydiCheckBox).isEnabled()) {
            xpath(adliSicilKaydiCheckBox).click()
        }
        sleep(1000)
        if (xpath(bayiIletTelBtn).isEnabled()) {
            xpath(bayiIletTelBtn).click()
        }
        sleep(2000)
        if (xpath(bileri2).isEnabled()) {
            xpath(bileri2).click()
        }
    }
    public static String simdikiZaman(){

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy")
        Date date = new Date()
        return dateFormat.format(date)
        }

    public String kullaniciTanimlamaTab3() {


        idload(eduSeviye)
        if (id(jss(eduSeviye)).isEnabled()){
            id(jss(eduSeviye)).click()
        }

        sleep(2000)
        list_click(eduSeviyeSec)

        idload(eduOkul)
        if (id(jss(eduOkul)).isEnabled()){
             id(jss(eduOkul)).sendKeys("KTU")
        }


        idload(eduBolumu)
        if (id(jss(eduBolumu)).isEnabled()) {
            id(jss(eduBolumu)).sendKeys("CENG")
        }

        xpathload(eduTarih)
        if (xpath(eduTarih).isEnabled()) {
            xpath(eduTarih).click()
        }
        if (xpath(tarihSec).isEnabled()) {
            xpath(tarihSec).click()
        }
        sleep(2000)
        if (xpath(eduButon).isEnabled()) {
            xpath(eduButon).click()
        }
        sleep(2000)
        xpath(tamamButonXpath)
        if (xpath(tamamButonXpath).isEnabled()){
            xpath(tamamButonXpath).click()
        }

        sleep(4000)
        String takipNo = xpath("/html[1]/body[1]/div[4]/div[3]").getText().substring(0,8).toString()
        //xpathload(islemKodu)
        sleep(2000)
        if (xpath(txn_id_Ok_Buton).isEnabled()){
            xpath(txn_id_Ok_Buton).click()

        }

        return takipNo

    }

    public void kanalIsGucuOnay(String takNo) {

        sleep(1000)
        if (xpath(bekleyenIslerXpath).isEnabled()) {
            xpath(bekleyenIslerXpath).click()
        }
        sleep(1000)
        /if (xpath(bayiIletTelBtn).isEnabled()) {
            xpath(bayiIletTelBtn).click()
        }

        if (id(jss(islemNo)).isEnabled()){
            id(jss(islemNo)).click()
        }/

        sleep(2000)
        if (id(jss(islemNo)).isEnabled()) {
            id(jss(islemNo)).sendKeys(takNo)
        }

        if (id(jss(araButonu)).isEnabled()){
            id(jss(araButonu)).click()
        }
    }

}