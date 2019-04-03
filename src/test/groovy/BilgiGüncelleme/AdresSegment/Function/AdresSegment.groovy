package BilgiGüncelleme.AdresSegment.Function

import Resources.Resources
import org.openqa.selenium.WebElement
import org.testng.Assert

/**
 * Created by murat_PRM on 14.6.2017.
 */
class AdresSegment extends Resources {

    public String adresGuncel = adres()

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
            sleep(5000)
            String randSonuc = RandGiris(1, 2)
              if (randSonuc == "1") {
                list_click(pozisyonSYAvrupa)
            } else if (randSonuc == "2") {
                list_click(pozisyonSYAvrupa)
            }
        }

        if ((id(jss(loginButon)).isEnabled())) {
            id(jss(loginButon)).click()
        }
    }

    public void anaMenu(String menuSec) {

        xpathload(bayiyonetimi)
        if (xpath(bayiyonetimi).isEnabled()) {
            xpath(bayiyonetimi).click()

        }
        if (xpath(menuSec).isEnabled()) {
            xpath(menuSec).click()
        }
    }


    public void bayiAdresSegment(String satisNoktaDeger,String degisiklikSecim,String guncellemeNedenSecim,String ilSec2,String ilceSec2,String binaNoGir,String kapıNoGir,String postaKoduGir,String adresKoduGir,String normKoduGir,String koordinatBilgiX,String koordinatBilgiY,String bayiIsimGir,String bayiUzaklıkGir,String magazaBilgi,String maliyetGir,String birim,String cepheSecim,String yukGir,String genGir) {

        idload(satisNoktasiKodu2)
        if ((id(jss(satisNoktasiKodu2)).isEnabled())) {
            id(jss(satisNoktasiKodu2)).sendKeys(satisNoktaDeger)
        }
        sleep(2000)
        if ((id(jss(bayiAraButton))).isEnabled()){
            id(jss(bayiAraButton)).click()
        }
        idload(degisiklikTip)
        if ((id(jss(degisiklikTip))).isEnabled()) {
            id(jss(degisiklikTip)).click()
        }
        sleep(2000)
        list_click(degisiklikSecim)
        idload(guncellemeNedeni)
        if ((id(jss(guncellemeNedeni))).isEnabled()) {
            id(jss(guncellemeNedeni)).click()
        }
        sleep(2000)
        list_click(guncellemeNedenSecim)


        if ((id(jss(anaBolge2))).isEnabled()) {
            id(jss(anaBolge2)).click()
        }
        sleep(2000)
        if ((id(jss(bolge2))).isEnabled()) {
            id(jss(bolge2)).click()
        }
        sleep(2000)
        idload(il)
        if ((id(jss(il))).isEnabled()) {
            id(jss(il)).click()
        }
        sleep(2000)
        list_click(ilSec2)
        idload(ilce)
        if ((id(jss(ilce))).isEnabled()) {
            id(jss(ilce)).click()
        }
        sleep(2000)
        list_click(ilceSec2)

        if ((id(jss(adres))).isEnabled()) {
        id(jss(adres)).clear()
        id(jss(adres)).sendKeys(adresGuncel)
        }
        if ((id(jss(binaNo))).isEnabled()) {
            id(jss(binaNo)).clear()
            id(jss(binaNo)).sendKeys(binaNoGir)
        }
        if ((id(jss(kapiNo))).isEnabled()) {
            id(jss(kapiNo)).clear()
            id(jss(kapiNo)).sendKeys(kapıNoGir)
        }
        if ((id(jss(postaKodu))).isEnabled()) {
            id(jss(postaKodu)).clear()
            id(jss(postaKodu)).sendKeys(postaKoduGir)
        }
        if ((id(jss(adresKodu))).isEnabled()) {
            id(jss(adresKodu)).clear()
            id(jss(adresKodu)).sendKeys(adresKoduGir)
        }
        if ((id(jss(normKodu))).isEnabled()) {
            id(jss(normKodu)).clear()
            id(jss(normKodu)).sendKeys(normKoduGir)
        }
        if ((id(jss(subeKoordinatX))).isEnabled()) {
            id(jss(subeKoordinatX)).clear()
            id(jss(subeKoordinatX)).sendKeys(koordinatGirX)
        }
        if ((id(jss(subeKoordinatY))).isEnabled()) {
            id(jss(subeKoordinatY)).clear()
            id(jss(subeKoordinatY)).sendKeys(koordinatGirY)
        }
        if ((id(jss(enYakinAveaBayiIsim))).isEnabled()) {
            id(jss(enYakinAveaBayiIsim)).clear()
            id(jss(enYakinAveaBayiIsim)).sendKeys(bayiIsimGir)
        }
        if ((id(jss(enYakinAveaBayisiUzaklik))).isEnabled()) {
            id(jss(enYakinAveaBayisiUzaklik)).clear()
            id(jss(enYakinAveaBayisiUzaklik)).sendKeys(bayiUzaklıkGir)
        }
        if ((id(jss(magazaBuyuklugu))).isEnabled()) {
            id(jss(magazaBuyuklugu)).clear()
            id(jss(magazaBuyuklugu)).sendKeys(magazaBilgi)
        }
        if ((id(jss(dekorasyonMaliyeti2))).isEnabled()) {
            id(jss(dekorasyonMaliyeti2)).clear()
            id(jss(dekorasyonMaliyeti2)).sendKeys(maliyetGir)
        }
        idload(dekorasyonMaliyetiBirim)
        if ((id(jss(dekorasyonMaliyetiBirim))).isEnabled()) {
            id(jss(dekorasyonMaliyetiBirim)).click()
        }
        sleep(2000)
        list_click(birim)


        String cepheArka=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[3]/td[1]/div[1]/i[1]/input[1]").getAttribute("value").toString()
        String cepheOn=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[1]/div[1]/i[1]/input[1]").getAttribute("value").toString()
        String cepheSagYan=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[1]/div[1]/i[1]/input[1]").getAttribute("value").toString()
        String cepheSolYan=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[1]/div[1]/i[1]/input[1]").getAttribute("value").toString()
        String cepheYan=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[1]/div[1]/i[1]/input[1]").getAttribute("value").toString()



            if ( cepheBilgi1==cepheArka){}
            else {
                    idload(cepheAdi)
                    if ((id(jss(cepheAdi))).isEnabled()) {
                    id(jss(cepheAdi)).click()
                    sleep(2000)
                    list_click(cepheSecim)
                }
            }
            /*if ( cepheBilgi2==cepheOn){}
            else {
                idload(cepheAdi)
                if ((id(jss(cepheAdi))).isEnabled()) {
                    id(jss(cepheAdi)).click()
                    sleep(2000)
                    list_click(cepheSecim)
                }
            }
            if ( cepheBilgi3==cepheSagYan){}
            else {
                idload(cepheAdi)
                if ((id(jss(cepheAdi))).isEnabled()) {
                    id(jss(cepheAdi)).click()
                    sleep(2000)
                    list_click(cepheSecim)
                }
            }
            if ( cepheBilgi4==cepheSolYan){}
            else {
                idload(cepheAdi)
                if ((id(jss(cepheAdi))).isEnabled()) {
                    id(jss(cepheAdi)).click()
                    sleep(2000)
                    list_click(cepheSecim)
                }
            }
            if ( cepheBilgi5==cepheYan){}
            else {
                idload(cepheAdi)
                if ((id(jss(cepheAdi))).isEnabled()) {
                    id(jss(cepheAdi)).click()
                    sleep(2000)
                    list_click(cepheSecim)
                }
            }
            */
            if ((id(jss(yukseklikY))).isEnabled()) {
               id(jss(yukseklikY)).clear()
               id(jss(yukseklikY)).sendKeys(yukGir)
            }
            if ((id(jss(genislikX))).isEnabled()) {
               id(jss(genislikX)).clear()
               id(jss(genislikX)).sendKeys(genGir)
            }
            sleep(3000)
            if (xpath(cepheEkle).isEnabled()) {
               xpath(cepheEkle).click()
            }
            sleep(1000)
            if ((id(jss(tamam2))).isEnabled()) {
               id(jss(tamam2)).click()
            }

            sleep(3000)
            if (xpath(popUpEvet).isEnabled()) {
               xpath(popUpEvet).click()
            }
            xpathload(popUpEvet)
            sleep(1000)
            //class =z-window-modal-cnt     xpath=/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/button[1]    --xpath çerceve=/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]
            //txn pop up çereve xpath=/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]    buton xpath=/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/button[1]

            //xpath(txt2).click()
            String txt = "/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]"
            // String bayiKodu = xpath(txt).getText().substring(0, 7).toString()
            System.out.println(xpath(txt).getText().substring(0, 7).toString())

            if (xpath(txt2).isEnabled()) {
               xpath(txt2).click()
            }
            sleep(3000)


            }

            public String adresKontrol() {

            String adres1 = xpath(adresadres).getAttribute( "value").toString()
            Assert.assertEquals(adresGuncel, adres1)
            System.out.println("true")
            String adres2=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/i[1]/input[1]").getAttribute("value").toString()

            Assert.assertEquals(ilIstanbul,adres2)

            }

           }
