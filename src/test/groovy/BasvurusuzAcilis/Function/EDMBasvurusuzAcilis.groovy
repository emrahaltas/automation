package BasvurusuzAcilis.Function
/**
 * Created by murat_PRM on 14.6.2017.
 */
class EDMBasvurusuzAcilis extends BasvurusuzAcilis {
    private HashMap<String, String> hashMap

    void eDMBasvurusuzAcilis() {

       // login(pozisyonSD)
        login(pozisyonSD)

        anaMenu(basvurusuzAcilis)
        //basvurusuzTab1(bayiEDM,'')
        if (sirketSahis)
        {
            basvurusuzTab1(bayiEDM,"")
        }
        else
        {
            basvurusuzTab1(bayiEDM,"")
        }
        basvurusuzTab3()
        basvurusuzTab4()


    }
}