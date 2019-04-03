package BasvurusuzAcilis.Function
/**
 * Created by EMRAH_PRM on 24.12.2018.
 */
class ESNBasvurusuzAcilis extends BasvurusuzAcilis {

    private HashMap<String, String> hashMap
    void eSNBasvurusuzAcilis() {

        login(pozisyonSD)
        anaMenu(basvurusuzAcilis)
        basvurusuzTab1(bayiESN,'')
        basvurusuzTab3()
        basvurusuzTab4()

    }

}