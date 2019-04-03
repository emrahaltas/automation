package TakipEttiklerim.Function

import Resources.Resources
import org.openqa.selenium.By
import org.testng.Assert

class TakipEttiklerimMaxSembol extends Resources {



    void takipEttiklerimMaxSembol() {
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
        xpath(tSearchInput).sendKeys("FENER")
        sleep(3000)
        xpath(tSembolSec).click()
        assertText(maxSembolTitle, "İzlediklerim Listesi")
        assertCss(maxSembolTitle, "color", "rgba(40, 40, 40, 1)")
        assertCss(maxSembolTitle, "font-size", "18px")
        assertCss(maxSembolTitle, "font-weight", "500")
        assertCss(maxSembolTitle,"font-family", "\"gesta\",sans-serif")
        assertText(maxSembolAciklama, "Maksimum sembol sayısına ulaştınız. Listenizden bazı sembolleri silerek yeni semboller ekleyebilirsiniz.")
        assertCss(maxSembolAciklama, "color", "rgba(40, 40, 40, 1)")
        assertCss(maxSembolAciklama, "font-size", "13px")
        assertCss(maxSembolAciklama, "font-weight", "300")
        assertCss(maxSembolAciklama,"font-family", "\"gesta\",sans-serif")
        assertText(maxSembolTamam, "Tamam")
        assertCss(maxSembolTamam, "color", "rgba(255, 255, 255, 1)")
        assertCss(maxSembolTamam, "background-image", "linear-gradient(rgb(242, 76, 61) 0%, rgb(236, 42, 33) 100%)")
        assertCss(maxSembolTamam, "font-size", "13px")
        assertCss(maxSembolTamam, "font-weight", "300")
        assertCss(maxSembolTamam,"font-family", "\"gesta\",sans-serif")

        xpath(maxSembolTamam).click()
        xpath(tSembolKapat).click()
        driver.navigate().refresh()
    }

}
