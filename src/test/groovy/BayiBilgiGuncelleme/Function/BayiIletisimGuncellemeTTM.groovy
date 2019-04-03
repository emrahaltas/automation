package BayiBilgiGuncelleme.Function;


import BayiGoruntuleme.Function.BayiGoruntuleme


class BayiIletisimGuncellemeTTM extends BilgiGuncelleme {
    private HashMap<String, String> hashMap
    void bayiIletisimGuncellemeTTM() {

        login(pozisyonSD)
        anaMenu(bayiIletisim)
        String sql="Select partner_id from (select * from partner_definition where type=164 and status=5765  order by cdate desc ) where rownum=1"
        String tTMbayi=dbconnect(sql)
        bayiIletisimGuncelleme(tTMbayi,'','Düzeltme')
        anaMenu(bayiGoruntuleme)
        BayiGoruntuleme bayiGor = new BayiGoruntuleme()
        bayiGor. bayiGoruntule('','',tTMbayi, '', '','','','','','','')
        bayiIletisimKontrol()

    }

}
