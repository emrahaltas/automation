package TakipEttiklerim.Function

import Resources.Resources
import org.testng.Assert

class TakipEttiklerimSutunEkleCikar extends Resources {

    void takipEttiklerimSutunEkleCikar() {
            assertText(sembol,"Sembol")
            assertCss(sembol,"color","rgba(40, 40, 40, 1)")
            assertCss(sembol,"font-size","11px")
            assertCss(sembol,"font-family", "\"gesta\",sans-serif")
            assertText(son,"Son")
            assertCss(son,"color","rgba(40, 40, 40, 1)")
            assertCss(son,"font-size","11px")
            assertCss(son,"font-family", "\"gesta\",sans-serif")
            assertText(fark,"% Fark")
            assertCss(fark,"color","rgba(40, 40, 40, 1)")
            assertCss(fark,"font-size","11px")
            assertCss(fark,"font-family", "\"gesta\",sans-serif")
            assertText(saat,"Saat")
            assertCss(saat,"color","rgba(40, 40, 40, 1)")
            assertCss(saat,"font-size","11px")
            assertCss(saat,"font-family", "\"gesta\",sans-serif")



            xpath(tSutunEkle).click()
       /* Assert.assertEquals(id(sutunDuzenleText).getText(), "Sütunları Düzenle")
        Assert.assertEquals(id(sutunDuzenleText).getCssValue("color"),"rgba(0, 0, 0, 1)")
        Assert.assertEquals(id(sutunDuzenleText).getCssValue("font-size"), "19.3833px")
        Assert.assertEquals(id(sutunDuzenleText).getCssValue("font-family"), "\"gesta\",sans-serif")  */
        Assert.assertEquals(xpath(sutunInput).getAttribute("placeholder"), "Sütun Ekle")
        assertText(sutSembol, "Sembol")
        assertCss(sutSembol,"color","rgba(40, 40, 40, 1)")
        assertCss(sutSembol,"font-size", "13px")
        assertCss(sutSembol,"font-weight", "500")
        assertCss(sutSembol,"font-family", "\"gesta\",sans-serif")
        assertText(sutSembolDetay, "Sembol Bilgisi")
        assertCss(sutSembolDetay,"color","rgba(40, 40, 40, 1)")
        assertCss(sutSembolDetay,"font-size", "13px")
        assertCss(sutSembolDetay,"font-weight", "300")
        assertCss(sutSembolDetay,"font-family", "\"gesta\",sans-serif")
        assertText(sutSon, "Son")
        assertCss(sutSon,"color","rgba(40, 40, 40, 1)")
        assertCss(sutSon,"font-size", "13px")
        assertCss(sutSon,"font-weight", "500")
        assertCss(sutSon,"font-family", "\"gesta\",sans-serif")
        assertText(sutSonDetay, "Son Fiyat")
        assertCss(sutSonDetay,"color","rgba(40, 40, 40, 1)")
        assertCss(sutSonDetay,"font-size", "13px")
        assertCss(sutSonDetay,"font-weight", "300")
        assertCss(sutSonDetay,"font-family", "\"gesta\",sans-serif")
        Assert.assertEquals(xpath(sutSonSil).isDisplayed(), true)
        assertText(sutFark, "% Fark")
        assertCss(sutFark,"color","rgba(40, 40, 40, 1)")
        assertCss(sutFark,"font-size", "13px")
        assertCss(sutFark,"font-weight", "500")
        assertCss(sutFark,"font-family", "\"gesta\",sans-serif")
        assertText(sutFarkDetay, "Günlük Değişim Farkı Yüzdesi")
        assertCss(sutFarkDetay,"color","rgba(40, 40, 40, 1)")
        assertCss(sutFarkDetay,"font-size", "13px")
        assertCss(sutFarkDetay,"font-weight", "300")
        assertCss(sutFarkDetay,"font-family", "\"gesta\",sans-serif")
        Assert.assertEquals(xpath(sutFarkSil).isDisplayed(), true)
        assertText(sutSaat, "Saat")
        assertCss(sutSaat,"color","rgba(40, 40, 40, 1)")
        assertCss(sutSaat,"font-size", "13px")
        assertCss(sutSaat,"font-weight", "500")
        assertCss(sutSaat,"font-family", "\"gesta\",sans-serif")
        assertText(sutSaatDetay, "Güncellenme Saati")
        assertCss(sutSaatDetay,"color","rgba(40, 40, 40, 1)")
        assertCss(sutSaatDetay,"font-size", "13px")
        assertCss(sutSaatDetay,"font-weight", "300")
        assertCss(sutSaatDetay,"font-family", "\"gesta\",sans-serif")
        Assert.assertEquals(xpath(sutSaatSil).isDisplayed(), true)
        xpath(sutunInput).click()
        xpath(sutunInput).sendKeys("Alış")
        sleep(500)
        xpath(sutSutunEkle).click()
        sleep(500)
        xpath(sutSutunSecKapat).click()
        scrollPageDown(xpath(sutSembol))
        assertText(sutAlis, "Alış")
        assertCss(sutAlis,"color","rgba(40, 40, 40, 1)")
        assertCss(sutAlis,"font-size", "13px")
        assertCss(sutAlis,"font-weight", "500")
        assertCss(sutAlis,"font-family", "\"gesta\",sans-serif")

        assertText(sutAlisDetay, "Alış Fiyatı")
        assertCss(sutAlisDetay,"color","rgba(40, 40, 40, 1)")
        assertCss(sutAlisDetay,"font-size", "13px")
        assertCss(sutAlisDetay,"font-weight", "300")
        assertCss(sutAlisDetay,"font-family", "\"gesta\",sans-serif")
        Assert.assertEquals(xpath(sutAlisSil).isDisplayed(), true)

        xpath(sutDuzenleKapat).click()
        assertText(alis, "Alış")
        assertCss(alis,"color", "rgba(40, 40, 40, 1)")
        assertCss(alis,"font-size", "11px")
        assertCss(alis,"font-family", "\"gesta\",sans-serif")

        driver.navigate().refresh()




    }

}
