package BasvurusuzAcilis.Function
/**
 * Created by murat_PRM on 14.6.2017.
 */
class TTMSubeBasvurusuzAcilis extends BasvurusuzAcilis {
    private HashMap<String, String> hashMap

    void tTMSubeBasvurusuzAcilis() {
        
        login(pozisyonSD)
        anaMenu(basvurusuzAcilis)
        basvurusuzTab1(bayiTTM,'')
        basvurusuzTab2()
        basvurusuzTab3()
        String bayiKodu=basvurusuzTab4()
        sleep(2000)
        anasayfa()
        anaMenu(basvurusuzAcilis)
        basvurusuzTabSube1(bayiTTMSube, bayiKodu)
        basvurusuzTab2()
        basvurusuzTab3()
        basvurusuzTab4()

    }
}