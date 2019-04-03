package BayiBilgiGuncelleme.Function;


import BayiGoruntuleme.Function.BayiGoruntuleme


class BayiIletisimGuncellemeEDM extends BilgiGuncelleme {
    private HashMap<String, String> hashMap
    void bayiIletisimGuncellemeEDM() {

        login(pozisyonSD)
        anaMenu(bayiIletisim)
        String sql="Select partner_id from (select * from partner_definition where type=182 and status=5765  order by cdate desc ) where rownum=1"
        String eDMbayi=dbconnect(sql)
        bayiIletisimGuncelleme(eDMbayi,'','Düzeltme')
        anaMenu(bayiGoruntuleme)
        BayiGoruntuleme bayiGor = new BayiGoruntuleme()
        bayiGor. bayiGoruntule('','',eDMbayi, '', '','','','','','','')
        bayiIletisimKontrol()

    }

}
