package BayiBilgiGuncelleme.Function;


import BayiGoruntuleme.Function.BayiGoruntuleme


class BayiIletisimGuncellemeTTILMudurlugu extends BilgiGuncelleme {
    private HashMap<String, String> hashMap
    void bayiIletisimGuncellemeTTILMudurlugu() {

        login(pozisyonSD)
        anaMenu(bayiIletisim)
        String sql="Select partner_id from (select * from partner_definition where type=114 and status=5765  order by cdate desc ) where rownum=1"
        String tTIlMud=dbconnect(sql)
        bayiIletisimGuncelleme(tTIlMud,'','Düzeltme')
        anaMenu(bayiGoruntuleme)
        BayiGoruntuleme bayiGor = new BayiGoruntuleme()
        bayiGor. bayiGoruntule('','',tTIlMud, '', '','','','','','','')
        bayiIletisimKontrol()

    }

}
