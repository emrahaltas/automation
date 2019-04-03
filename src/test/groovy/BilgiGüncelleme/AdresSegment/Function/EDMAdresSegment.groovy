package BilgiGüncelleme.AdresSegment.Function

import BayiGoruntuleme.Function.BayiGoruntuleme

class EDMAdresSegment extends AdresSegment {
    void eDMAdresSegment(){
        login()
        anaMenu(adresSegment)
       /* String randCephe =RandGiris(1,5)
        String cepheDeger;
        if (randCephe=="1")
        {
            cepheDeger=cepheBilgi1
        }
        else if (randCephe=="2")
        {
            cepheDeger=cepheBilgi2
        }
        else if (randCephe=="3")
        {
            cepheDeger=cepheBilgi3
        }
        else if (randCephe=="4")
        {
            cepheDeger=cepheBilgi4
        }
        else if (randCephe=="5")
        {
            cepheDeger=cepheBilgi5
        }*/
        bayiAdresSegment("129603",degisiklikTip1,güncellemeNeden1,ilIstanbul,ilceAvc,"1","11","34310","123","1234","1","2","Reşitpaşa","8","","1",tL,cepheBilgi1,"10","11")
        anaMenu(bayiGoruntuleme)
        BayiGoruntuleme bayiGor = new BayiGoruntuleme()
        bayiGor.bayiGoruntule('',bayiDurumSecOp,'129603', bayiGrubuSecBir, '','','','','','','')


           }
}
