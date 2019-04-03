package TakipEttiklerim.Function

import Resources.Resources
import org.openqa.selenium.By
import org.testng.Assert

class TakipEttiklerimSembolDetay extends Resources {

    void takipEttiklerimSembolDetay() {
        classname(takipsembollist).click()
        assertText(sDetayText,"AKBNK - AKBANK (A)")
        assertCss(sDetayText,"color","rgba(40, 40, 40, 1)")
        assertCss(sDetayText,"font-size","13px")
        assertCss(sDetayText,"font-weight","500")
        assertCss(sDetayText,"font-family", "\"gesta\",sans-serif")
        assertText(sDetayAciklama,"- AKBANK")
        assertCss(sDetayAciklama,"color","rgba(40, 40, 40, 1)")
        assertCss(sDetayAciklama,"font-size","11.7px")
        assertCss(sDetayAciklama,"font-weight","300")
        assertCss(sDetayAciklama,"font-family", "\"gesta\",sans-serif")
        assertText(sDetayGrup,"(A)")
        assertCss(sDetayGrup,"color","rgba(40, 40, 40, 1)")
        assertCss(sDetayGrup,"font-size","11.7px")
        assertCss(sDetayGrup,"font-weight","300")
        assertCss(sDetayGrup,"font-family", "\"gesta\",sans-serif")
        assertText(sdAl,"AL")
        assertCss(sdAl,"color","rgba(255, 255, 255, 1)")
        assertCss(sdAl,"background-image","linear-gradient(rgb(98, 217, 0) 0%, rgb(74, 165, 0) 100%)")
        assertCss(sdAl,"font-size","13px")
        assertCss(sdAl,"font-weight","400")
        assertCss(sdAl,"font-family", "\"gesta\",sans-serif")
        assertText(sdSat,"SAT")
        assertCss(sdSat,"color","rgba(255, 255, 255, 1)")
        assertCss(sdSat,"background-image","linear-gradient(rgb(240, 64, 53) 0%, rgb(233, 38, 31) 100%)")
        assertCss(sdSat,"font-size","13px")
        assertCss(sdSat,"font-weight","400")
        assertCss(sdSat,"font-family", "\"gesta\",sans-serif")
        assertAttribute(sdHaber,"title","Haberler")
        assertCss(sdHaber,"color","rgba(40, 40, 40, 1)")
        assertCss(sdHaber,"background-image","linear-gradient(rgb(255, 255, 255) 0%, rgb(246, 246, 248) 100%)")
        assertCss(sdHaber,"font-size","13px")
        assertCss(sdHaber,"font-weight","400")
        assertCss(sdHaber,"font-family", "\"gesta\",sans-serif")
        assertAttribute(sdKademeAnaliz,"title","Kademe Analizi")
        assertCss(sdKademeAnaliz,"color","rgba(40, 40, 40, 1)")
        assertCss(sdKademeAnaliz,"background-image","linear-gradient(rgb(255, 255, 255) 0%, rgb(246, 246, 248) 100%)")
        assertCss(sdKademeAnaliz,"font-size","13px")
        assertCss(sdKademeAnaliz,"font-weight","400")
        assertCss(sdKademeAnaliz,"font-family", "\"gesta\",sans-serif")
        assertAttribute(sdTeknikAnaliz,"title","Teknik Analiz")
        assertCss(sdTeknikAnaliz,"color","rgba(40, 40, 40, 1)")
        assertCss(sdTeknikAnaliz,"background-image","linear-gradient(rgb(255, 255, 255) 0%, rgb(246, 246, 248) 100%)")
        assertCss(sdTeknikAnaliz,"font-size","13px")
        assertCss(sdTeknikAnaliz,"font-weight","400")
        assertCss(sdTeknikAnaliz,"font-family", "\"gesta\",sans-serif")
        assertAttribute(sdDerinlik,"title","Derinlik")
        assertCss(sdDerinlik,"color","rgba(40, 40, 40, 1)")
        assertCss(sdDerinlik,"background-image","linear-gradient(rgb(255, 255, 255) 0%, rgb(246, 246, 248) 100%)")
        assertCss(sdDerinlik,"font-size","13px")
        assertCss(sdDerinlik,"font-weight","400")
        assertCss(sdDerinlik,"font-family", "\"gesta\",sans-serif")
        assertAttribute(sdAlarm,"title","Alarm Ekle")
        assertCss(sdAlarm,"color","rgba(40, 40, 40, 1)")
        assertCss(sdAlarm,"background-image","linear-gradient(rgb(255, 255, 255) 0%, rgb(246, 246, 248) 100%)")
        assertCss(sdAlarm,"font-size","13px")
        assertCss(sdAlarm,"font-weight","400")
        assertCss(sdAlarm,"font-family", "\"gesta\",sans-serif")
        assertAttribute(sdSirketProfil,"title","Şirket Profili")
        assertCss(sdSirketProfil,"color","rgba(40, 40, 40, 1)")
        assertCss(sdSirketProfil,"background-image","linear-gradient(rgb(255, 255, 255) 0%, rgb(246, 246, 248) 100%)")
        assertCss(sdSirketProfil,"font-size","13px")
        assertCss(sdSirketProfil,"font-weight","400")
        assertCss(sdSirketProfil,"font-family", "\"gesta\",sans-serif")
        assertAttribute(sdBilanco,"title","Bilanço")
        assertCss(sdBilanco,"color","rgba(40, 40, 40, 1)")
        assertCss(sdBilanco,"background-image","linear-gradient(rgb(255, 255, 255) 0%, rgb(246, 246, 248) 100%)")
        assertCss(sdBilanco,"font-size","13px")
        assertCss(sdBilanco,"font-weight","400")
        assertCss(sdBilanco,"font-family", "\"gesta\",sans-serif")
        assertText(sdGDusuk,"G.Düşük")
        assertCss(sdGDusuk,"color","rgba(40, 40, 40, 1)")
        assertCss(sdGDusuk,"font-size","13px")
        assertCss(sdGDusuk,"font-weight","500")
        assertCss(sdGDusuk,"font-family", "\"gesta\",sans-serif")
        assertText(sdGYuksek,"G.Yüksek")
        assertCss(sdGYuksek,"color","rgba(40, 40, 40, 1)")
        assertCss(sdGYuksek,"font-size","13px")
        assertCss(sdGYuksek,"font-weight","500")
        assertCss(sdGYuksek,"font-family", "\"gesta\",sans-serif")
        assertText(sdAlis,"Alış")
        assertCss(sdAlis,"color","rgba(40, 40, 40, 1)")
        assertCss(sdAlis,"font-size","13px")
        assertCss(sdAlis,"font-weight","500")
        assertCss(sdAlis,"font-family", "\"gesta\",sans-serif")
        assertText(sdSatis,"Satış")
        assertCss(sdSatis,"color","rgba(40, 40, 40, 1)")
        assertCss(sdSatis,"font-size","13px")
        assertCss(sdSatis,"font-weight","500")
        assertCss(sdSatis,"font-family", "\"gesta\",sans-serif")
        assertText(sdTavan,"Tavan")
        assertCss(sdTavan,"color","rgba(40, 40, 40, 1)")
        assertCss(sdTavan,"font-size","13px")
        assertCss(sdTavan,"font-weight","500")
        assertCss(sdTavan,"font-family", "\"gesta\",sans-serif")
        assertText(sdTaban,"Taban")
        assertCss(sdTaban,"color","rgba(40, 40, 40, 1)")
        assertCss(sdTaban,"font-size","13px")
        assertCss(sdTaban,"font-weight","500")
        assertCss(sdTaban,"font-family", "\"gesta\",sans-serif")
        assertText(sdSon,"Son")
        assertCss(sdSon,"color","rgba(40, 40, 40, 1)")
        assertCss(sdSon,"font-size","13px")
        assertCss(sdSon,"font-weight","500")
        assertCss(sdSon,"font-family", "\"gesta\",sans-serif")
        assertText(sdFark,"% G.Fark")
        assertCss(sdFark,"color","rgba(40, 40, 40, 1)")
        assertCss(sdFark,"font-size","13px")
        assertCss(sdFark,"font-weight","500")
        assertCss(sdFark,"font-family", "\"gesta\",sans-serif")
        assertText(sdOGKapanis,"Önc. G.Kap.")
        assertCss(sdOGKapanis,"color","rgba(40, 40, 40, 1)")
        assertCss(sdOGKapanis,"font-size","13px")
        assertCss(sdOGKapanis,"font-weight","500")
        assertCss(sdOGKapanis,"font-family", "\"gesta\",sans-serif")
        assertText(sdAOF,"AOF (Periyodik)")
        assertCss(sdAOF,"color","rgba(40, 40, 40, 1)")
        assertCss(sdAOF,"font-size","13px")
        assertCss(sdAOF,"font-weight","500")
        assertCss(sdAOF,"font-family", "\"gesta\",sans-serif")
        Assert.assertNotNull(sdGDusukData)
        assertCss(sdGDusukData,"color","rgba(40, 40, 40, 1)")
        assertCss(sdGDusukData,"font-size","13px")
        assertCss(sdGDusukData,"font-weight","400")
        assertCss(sdGDusukData,"font-family", "\"gesta\",sans-serif")
        Assert.assertNotNull(sdGYuksekData)
        assertCss(sdGYuksekData,"color","rgba(40, 40, 40, 1)")
        assertCss(sdGYuksekData,"font-size","13px")
        assertCss(sdGYuksekData,"font-weight","400")
        assertCss(sdGYuksekData,"font-family", "\"gesta\",sans-serif")
        Assert.assertNotNull(sdAlisData)
        assertCss(sdAlisData,"color","rgba(40, 40, 40, 1)")
        assertCss(sdAlisData,"font-size","13px")
        assertCss(sdAlisData,"font-weight","400")
        assertCss(sdAlisData,"font-family", "\"gesta\",sans-serif")
        Assert.assertNotNull(sdSatisData)
        assertCss(sdSatisData,"color","rgba(40, 40, 40, 1)")
        assertCss(sdSatisData,"font-size","13px")
        assertCss(sdSatisData,"font-weight","400")
        assertCss(sdSatisData,"font-family", "\"gesta\",sans-serif")
        Assert.assertNotNull(sdTavanData)
        assertCss(sdTavanData,"color","rgba(40, 40, 40, 1)")
        assertCss(sdTavanData,"font-size","13px")
        assertCss(sdTavanData,"font-weight","400")
        assertCss(sdTavanData,"font-family", "\"gesta\",sans-serif")
        Assert.assertNotNull(sdTabanData)
        assertCss(sdTabanData,"color","rgba(40, 40, 40, 1)")
        assertCss(sdTabanData,"font-size","13px")
        assertCss(sdTabanData,"font-weight","400")
        assertCss(sdTabanData,"font-family", "\"gesta\",sans-serif")
        Assert.assertNotNull(sdSonData)
        assertCss(sdSonData,"color","rgba(40, 40, 40, 1)")
        assertCss(sdSonData,"font-size","13px")
        assertCss(sdSonData,"font-weight","400")
        assertCss(sdSonData,"font-family", "\"gesta\",sans-serif")
        Assert.assertNotNull(sdFarkData)
        assertCss(sdFarkData,"color","rgba(40, 40, 40, 1)")
        assertCss(sdFarkData,"font-size","13px")
        assertCss(sdFarkData,"font-weight","400")
        assertCss(sdFarkData,"font-family", "\"gesta\",sans-serif")
        Assert.assertNotNull(sdOGKapanisData)
        assertCss(sdOGKapanisData,"color","rgba(40, 40, 40, 1)")
        assertCss(sdOGKapanisData,"font-size","13px")
        assertCss(sdOGKapanisData,"font-weight","400")
        assertCss(sdOGKapanisData,"font-family", "\"gesta\",sans-serif")
        Assert.assertNotNull(sdAOFData)
        assertCss(sdAOFData,"color","rgba(40, 40, 40, 1)")
        assertCss(sdAOFData,"font-size","13px")
        assertCss(sdAOFData,"font-weight","400")
        assertCss(sdAOFData,"font-family", "\"gesta\",sans-serif")
        assertText(sdHizliAl,"AL")
        assertCss(sdHizliAl,"color","rgba(255, 255, 255, 1)")
        assertCss(sdHizliAl,"background-image","linear-gradient(rgb(29, 199, 0) 0%, rgb(27, 184, 0) 100%)")
        assertCss(sdHizliAl,"font-size","13px")
        assertCss(sdHizliAl,"font-weight","300")
        assertCss(sdHizliAl,"font-family", "\"gesta\",sans-serif")
        assertText(sdHizliSat,"SAT")
        assertCss(sdHizliSat,"color","rgba(255, 255, 255, 1)")
        assertCss(sdHizliSat,"background-image","linear-gradient(rgb(250, 0, 0) 0%, rgb(200, 0, 0) 100%)")
        assertCss(sdHizliSat,"font-size","13px")
        assertCss(sdHizliSat,"font-weight","300")
        assertCss(sdHizliSat,"font-family", "\"gesta\",sans-serif")
        Assert.assertNotNull(sdDetayKapat)
        Assert.assertNotNull(sdDetayPopup)
        xpath(sdHizliGizle).click()
        assertText(sdHizliAl,"")
        assertText(sdHizliSat,"")
        xpath(sdHizliGizle).click()
        assertText(sdHizliAl,"AL")
        assertText(sdHizliSat,"SAT")
        driver.navigate().refresh()
    }

}
