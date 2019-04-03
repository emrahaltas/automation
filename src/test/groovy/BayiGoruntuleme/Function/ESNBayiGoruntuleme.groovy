package BayiGoruntuleme.Function


import org.testng.Assert

/**
 * Created by murat_PRM on 14.6.2017.
 */
class ESNBayiGoruntuleme extends BayiGoruntuleme{
    void eDMBayiGoruntuleme(){
        login()
        anaMenu(bayiGoruntuleme)


        bayiGoruntule('',bayiDurumSecOp,'128439', bayiGrubuSecBir, '','','',bayiEDM,'','','')

        xpathload(bayiSonucSatisKodu)
        String baySon1= xpath(bayiSonucSatisKodu).getText()
        String baySon2= xpath(bayiSonucTicUnvan).getText()
        String baySon3= xpath(bayiSonucBayiTip).getText()
        String baySon4= xpath(bayiSonucAnaBolge).getText()
        String baySon5= xpath(bayiSonucBolge).getText()
        String baySon6= xpath(bayiSonucStatu).getText()
        String baySon7= xpath(bayiSonucAnahtar).getText()
        String baySon8= xpath(bayiSonucIl).getText()
        String baySon9= xpath(bayiSonucIlce).getText()

        sleep(1000)
        xpath(bayiSonucSatisKodu).click()
        xpathload("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
        sleep(2000)
        String bay1=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]").getAttribute( "value").toString()
        String bay2=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]").getAttribute("value").toString()
        String bay3=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/i[1]/input[1]").getAttribute("value").toString()
        String bay4=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/i[1]/input[1]").getAttribute("value").toString()
        String bay5=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/i[1]/input[1]").getAttribute("value").toString()
        String bay6=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/i[1]/input[1]").getAttribute("value").toString()
        String bay7=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/input[1]").getAttribute("value").toString()
        String bay8=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/i[1]/input[1]").getAttribute("value").toString()
        String bay9=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/i[1]/input[1]").getAttribute("value").toString()
        String bay10=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[4]/div[1]/input[1]").getAttribute("value").toString()
        String bay11=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[4]/div[1]/input[2]").getAttribute("value").toString()
        String bay12=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[5]/input[1]").getAttribute("value").toString()
        //String bay13=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[6]/input[1]").getAttribute("value").toString()
        String bay14=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/input[1]").getAttribute("value").toString()
        String bay15=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]").getAttribute("value").toString()
        String bay16=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/input[1]").getAttribute("value").toString()
        String bay17=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/input[1]").getAttribute("value").toString()
        String bay18=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/input[2]").getAttribute("value").toString()
        String bay19=xpath("/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/textarea[1]").getAttribute("value").toString()
        Assert.assertEquals(baySon1,bay1)
        System.out.println("true satış kodu")
        Assert.assertEquals(baySon2,bay2)
        System.out.println("true ticari ünvan")
        //Assert.assertEquals(baySon3,bay3)
       //Assert.assertEquals(baySon4,bay4)
        Assert.assertEquals(baySon5,bay5)
        Assert.assertEquals(baySon6,bay6)
        Assert.assertEquals(baySon7,bay7)
        Assert.assertEquals(baySon8,bay8)
        Assert.assertEquals(baySon9,bay9)
        Assert.assertEquals("33",bay10)
        System.out.println("true bina no")
        Assert.assertEquals("5",bay11)
        System.out.println("true kapı no")
        Assert.assertEquals("34444",bay12)
        System.out.println("true posta kodu")
        Assert.assertEquals("EDM Testttt adress",bay19)
        System.out.println("true adres kodu")
        Assert.assertEquals("",bay14)
        System.out.println("true norm kodu")
        Assert.assertEquals("",bay15)
        System.out.println("true koordinat x")
        Assert.assertEquals("",bay16)
        System.out.println("true koordinat y")
        Assert.assertEquals("we",bay17)
        System.out.println("true en yakın bayi isim")
        Assert.assertEquals("3",bay18)
        System.out.println("true bayi uzaklık")
    }
}

