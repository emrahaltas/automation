package TakipEttiklerim.Function

import Resources.Resources
import org.openqa.selenium.By
import org.testng.Assert

class TakipEttiklerimZdenA extends Resources {

    def list = [
            "YKBNK",
            "VAKBN",
            "ULKER",
            "TUPRS",
            "TTKOM",
            "TOASO",
            "TKFEN",
            "THYAO",
            "TCELL",
            "TAVHL",
            "SODA",
            "SISE",
            "SAHOL",
            "PETKM",
            "OTKAR",
            "KRDMD",
            "KOZAL",
            "KCHOL",
            "ISCTR",
            "HALKB",
            "GARAN",
            "FROTO",
            "EREGL",
            "ENKAI",
            "EKGYO",
            "DOHOL",
            "BIMAS",
            "ASELS",
            "ARCLK",
            "AKBNK",
    ]

    void takipEttiklerimZdenA() {
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
        xpath(sembol).click()
        for (int i = 0; i < list.size(); i++) {
            Assert.assertEquals(driver.findElements(By.className("live-security-price-symbol-direction")).get(i).findElement(By.tagName("span")).getAttribute("security-name"), list.get(i))
        }
        driver.navigate().refresh()
    }

}
