package BasvurusuzAcilis.Function
/**
 * Created by murat_PRM on 14.6.2017.
 */
class MediaMarktBasvurusuzAcilis extends BasvurusuzAcilis {
    private HashMap<String, String> hashMap

    void mediaMarktBasvurusuzAcilis() {

        login(pozisyonSD)
        anaMenu(basvurusuzAcilis)
        basvurusuzTab1(bayiMediaMarkt,'')
        basvurusuzTab3()
        basvurusuzTab4()

    }
}