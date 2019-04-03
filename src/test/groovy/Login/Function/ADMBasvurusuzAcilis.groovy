package Login.Function

import BasvurusuzAcilis.Function.BasvurusuzAcilis

/**
 * Created by murat_PRM on 14.6.2017.
 */
class ADMBasvurusuzAcilis extends BasvurusuzAcilis {

    private HashMap<String, String> hashMap
    void aDMBasvurusuzAcilis() {

        login(pozisyonSD)
        anaMenu()
        basvurusuzTab1(bayiTTM,bolge)
        basvurusuzTab2()
        basvurusuzTab3()

    }

}