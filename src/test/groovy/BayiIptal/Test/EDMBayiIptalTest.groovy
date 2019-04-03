package BayiIptal.Test

import BayiIptal.Function.BayiIptal
import org.testng.annotations.Test

class EDMBayiIptalTest extends BayiIptal{
    @Test
    void bayiIptalTest(){

        login()

        anaMenu(iptal)

        //  Satış kodu seçimini altta yer alan 10 bayiden birini random seçecek kod yapısı .Bayi sayısı artırılabilir.

            String randSonuc2 =RandGiris(1,2)
            String satisNoktaDeger2;
            if (randSonuc2=="1")
            {
                satisNoktaDeger2="129477"

            }
            else if (randSonuc2=="2")
            {
                satisNoktaDeger2="129477"
            }
            else if (randSonuc2=="3")
            {
                satisNoktaDeger2="129477"
            }
            else if (randSonuc2=="4")
            {
                satisNoktaDeger2="129477"
            }
            else if (randSonuc2=="5")
            {
                satisNoktaDeger2="129477"
            }
            else if (randSonuc2=="6")
            {
                satisNoktaDeger2="128576"
            }
            else if (randSonuc2=="7")
            {
                satisNoktaDeger2="128844"
            }
            else if (randSonuc2=="8")
            {
                satisNoktaDeger2="129387"
            }
            else if (randSonuc2=="9")
            {
                satisNoktaDeger2="129386"
            }
            else if (randSonuc2=="10")
            {
                satisNoktaDeger2="128896"
            }


        bayiIptal('','',bayiGrubuSecBir,bayiEDM2,satisNoktaDeger2,secimBolge,iptalTipBayi,iptalSecim,KapanisBelgesi2,iptalAciklamaAlani)

    }
}
