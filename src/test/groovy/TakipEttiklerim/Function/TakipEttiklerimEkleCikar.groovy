package TakipEttiklerim.Function

import Resources.Resources
import org.openqa.selenium.By
import org.testng.Assert

class TakipEttiklerimEkleCikar extends Resources {

    def list = [
            "AKBNK",
            "ARCLK",
            "ASELS",
            "BIMAS",
            "DOHOL",
            "EKGYO",
            "ENKAI",
            "EREGL",
            "FENER",
            "FROTO",
            "GARAN",
            "HALKB",
            "ISCTR",
            "KCHOL",
            "KOZAL",
            "KRDMD",
            "OTKAR",
            "PETKM",
            "SAHOL",
            "SISE",
            "SODA",
            "TAVHL",
            "TCELL",
            "THYAO",
            "TOASO",
            "TTKOM",
            "TUPRS",
            "ULKER",
            "VAKBN",
            "YKBNK",
    ]

    void takipEttiklerimEkleCikar() {
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
        xpath(sembol).click()

        xpath(tSembolEkle).click()
        Assert.assertEquals(xpath(tSearchInput).getAttribute("placeholder"), "Sembol kodu veya sembol adı giriniz")
        xpath(tSearchInput).sendKeys("TKFEN")
        sleep(3000)
        xpath(tSembolSec).click()
        xpath(tSearchKapat).click()
        xpath(tSearchInput).clear()
        xpath(tSearchInput).sendKeys("FENER")
        sleep(3000)
        xpath(tSembolSec).click()
        xpath(tSearchKapat).click()
        xpath(tSembolKapat).click()

        for (int i = 0; i < list.size(); i++) {
            Assert.assertEquals(driver.findElements(By.className("live-security-price-symbol-direction")).get(i).findElement(By.tagName("span")).getAttribute("security-name"), list.get(i))
        }
        driver.navigate().refresh()
    }

}
