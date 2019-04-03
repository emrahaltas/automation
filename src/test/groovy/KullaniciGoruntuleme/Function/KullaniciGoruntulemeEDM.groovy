package KullaniciGoruntuleme.Function

class KullaniciGoruntulemeEDM extends KullaniciGoruntuleme {

    private HashMap<String, String> hashMap
    void kullGoruntulemeEDM() {

        login(pozisyonSD)
        anaMenu(Goruntuleme)
        kullGoruntule(dbconnect(kgSorguBireyseledm))


    }
}
