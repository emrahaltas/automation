package Resources

import Abstract.MainFunctions
import DbConnection.DbConnectTekag

import java.awt.event.ActionEvent
import java.sql.*
import java.text.DateFormat
import java.text.SimpleDateFormat

/**
 * Created by forektest on 5.6.2017.
 */
class Resources extends MainFunctions {

    //Giris
    ArrayList<String> liste = new ArrayList<String>();
    static public String username = '$tbUserName'
    static public String password = '$tbPassword'
    static public String onaylaButon = '$btnValidate'
    static public String pozisyonSec = '$tbPositions'
    static public String loginButon = '$btnLogin'
    static public String pozisyonSD = "//td[contains(text(), 'BİREYSEL') and contains(text(), 'KIDEMLİ') and contains(text(), 'UZMANI_10')]"
    static public String pozisyonKSD = "//td[contains(text(), 'KURUMSAL') and contains(text(), 'KIDEMLİ') and contains(text(), 'UZMANI_10')]"
    static public String pozisyonSYAvrupa = "BİREYSEL KIDEMLİ SATIŞ DESTEK UZMANI_10" //gitten alınan ORTAK
    static public String pozisyonIK =  "//td[contains(text(), 'KANAL') and contains(text(), 'İŞ') and contains(text(), 'GÜCÜ')and contains(text(), 'YÖNETİMİ')]" //KANAL İŞ GÜCÜ YÖNETİMİ
    static public String pozisyonSYAnadolu = "İSTANBUL ANADOLU II BÖLGE SATIŞ YÖNETİCİSİ_12"
    static public String hataliGiris = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]"
    static public String hataliGirisText = "Hatalı şifre girişi!"
    static public String kullaniciBilgBulunamadi = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]"
    static public String kullaniciBilgBulunamadiText = "Kullanıcı bilgileri sistemde bulunamadı!"
    static public String bekleyenIslerXpath = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[1]/div[2]/div[1]/button[1]"


    //Basvurusuz Tab1
    static public String bayiGrubu = '$bayiGrubu'
    static public String bayiTipi = '$bayiTipi'
    static public String bayiEDM = "//td[contains(text(), 'EDM')]"
    static public String bayiTTBN = "//td[contains(text(), 'TTBN')]"
    static public String bayiTTILMudurlugu = "//td[contains(text(), 'TTİL') and contains(text(), 'Müdürlüğü')]"
    static public String bayiESN = "//td[contains(text(), 'ESN')]"
    static public String bayiADM = "//td[contains(text(), 'ADM')]"
    static public String bayiTTM = "//td[text()='TTM']"
    static public String bayiMediaMarkt = "//td[text()='MEDIAMARKT']"
    static public String bayiDDM = "//td[text()='DDM']"
    static public String bayiTTMSube = "//td[contains(text(), 'TTM') and contains(text(), 'Şube')]"
    static public String bayiAnaKodu = '$anaBayiKodu'
    static public String bayiTicUnvan = '$bayiTicariUnvani'
    static public String bayiTabAdi = '$bayiTabelaAdi'
    static public String bolge = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/i[1]/input[1]"
    //'$bolge'
    static public String bolgeIstAvr = "ISTANBUL AVRUPA 1"
    static public String bolgeAlternatifKanal = "ALTERNATIF KANALLAR"
    static public String il = '$il'
    static public String ilIstanbul = "İSTANBUL"
    static public String ilArtvin= "ARTVİN"
    static public String ilIzmir= "İZMİR"
    static public String ilce = '$ilce'
    static public String ilceAvc = "AVCILAR"
    static public String ilceSile = "ŞİLE"
    static public String ilceKml= "KEMALPAŞA"
    static public String ilceHopa = "HOPA"
    static public String adres = '$adres'
    static public String binaNo = '$binaNo'
    static public String kapiNo = '$kapiNo'
    static public String postaKodu = '$postaKodu'
    static public String adresKodu = '$adresKodu'
    static public String normKodu = '$normKodu'
    static public String distributorListbox = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[15]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[1]/div[1]/i[1]/input[1]"
    //'$mevcutDistributorListbox'
    //  static public String teminatMektup='$teminatMektubuVarYok'  default ta geliyor , kullanmadım
    static public String distMobiltel = "//td[contains(text(), 'MOBİLTEL')]"
    static public String distEkleButon = '$distributorAddButton'
    static public String bayiKontakTip = '$bayiContactTipi'
    static public String bayiKontakNo = '$bayiContactNo'
    static public String bayiIletSecTel = "//td[contains(text(), 'Tel') and contains(text(), 'No')]"
    static public String bayiIletTelBtn = "//td[3]/div/div/div/div/img"
    static public String sirketTipi = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/i[1]/input[1]"
//'$sirketTipi'
    static public String sirketSahis = "//td[contains(text(), 'Şahıs') and contains(text(), 'Şirketi')]"
    static public String sirketSermaye = "//td[contains(text(), 'Sermaye')and contains(text(), 'Şirketi')]"
    static public String bayiSahibiTC = '$bayiSahibiTCKimlikNo'
    static public String vergiNo = '$vergiNo' //sermaye şirketi seçilince çıkan alan
    static public String sayfabostikla = "//div[2]/div/div/div/span"
    static public String popupTamam = "//div[4]/div[2]/div/div/div/div"
    static public String vergiDaire = '$vergiDairesi'
    static public String bayiSahibiAd = '$bayiSahibiAdi'
    static public String bayiSahibiSoyad = '$bayiSahibiSoyadi'
    static public String bayiShbEmailSec = "//div[9]/div/div/div[3]/table/tbody[2]/tr/td/div/i/i"
    // static public String bayiShbEmailSec ='$bayiSahibiEmailTipi'
    static public String bayiSahibiTlkmMail = "//body/div[3]/table/tbody/tr[3]/td[2]"
    static public String bayiSahibiDigerMail = "//body/div[3]/table/tbody/tr[2]/td[2]"
    static public String bayiSahibiDigerMailVal = "//div[9]/div/div/div[3]/table/tbody[2]/tr/td[2]/div/input"
    static public String bayiSahibiDigerMailBtn = "//div[9]/div/div/div[3]/table/tbody[2]/tr/td[3]/div/div/div/div/img"
    static public String bayiSahibiTel = '$bayiSahibiGSMNo'
    static public String bayiEmailTip = '$bayiEmailTipi'
    static public String bayiEmailSec = "//div[11]/div/div/div[3]/table/tbody[2]/tr/td/div/i/i"
    static public String bayiEmailTlkm = "//body/div[3]/table/tbody/tr[3]/td[2]"
    static public String bayiEmailTlkmVal = "//div[11]/div/div/div[3]/table/tbody[2]/tr/td[2]/div/input"
    static public String bayiEmailTlkmBtn = "//div[11]/div/div/div[3]/table/tbody[2]/tr/td[3]/div/div/div/div"
    static public String bayiEmailDiger = "//body/div[3]/table/tbody/tr[2]/td[2]"
    static public String bayiEmailDigerVal = "//div[11]/div/div/div[3]/table/tbody[2]/tr/td[2]/div/input"
    static public String bayiEmaildigerBtn = "//div[11]/div/div/div[3]/table/tbody[2]/tr/td[3]/div/div/div/div/img"
    static public String memoID = '$memoIdVal'
    static public String ileriBtn = "//div[3]/button[3]"

    //Basvurusuz Tab2
    static public String segment = '$segment'
    static public String segmentSecStandart = "//td[contains(text(), 'Standart')]"
    static public String segmentBasTarih = "//div[2]/div[2]/div[2]/div/div/div/div/div/div/div[2]/i/i"
    static public String segmentBasTarihSec = "//div[3]/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td[4]"
    static public String segmentKiralayan = '$segmentKiralayan'
    static public String segmentKiralayanSec = "/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr[2]/td[2]"
    static public String segmentBitTarihi = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/i[1]/i[1]"
    static public String segmentBitTarihSec = "/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[4]/td[4]"
    static public String segmentBolgeTipi = '$segmentBolgeTipi'
    //static public String gozat = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]"
    static public String browse = "/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/span[3]/form[1]/input[1]"
    static public String indirButonu = "/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/div[3]/button[1]"
    static public String iptalButonu = "/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/div[3]/button[2]"
    static public String carpiIsareti = "/html[1]/body[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]"
    static public String artiIsareti = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[4]/div[1]/div[1]/div[1]/span[1]"
    static public String ksbkbText = '$kiraSozlesmesiBaslangicKiraBedeli' //Kira Sözleşmesi Başlangıç Kira Bedeli:
    static public String ksbkbCombo = '$kiraSozlesmesiBaslangicKiraBedeliBirim'//
    static public String paraBirimi = "/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr[3]/td[2]"
    static public String kiraSozlesmeSuresi = '$kiraSozlesmeSuresi'//
    static public String kiraSozlesmeSuresiCombo = '$kiraSozlesmeSuresiBirim'
    static public String kiraSozlesmeSuresiSec = "/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr[2]/td[2]"
    static public String lokasyon = '$lokasyon'
    static public String lokasyonSec = "/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr[2]/td[2]"
    static public String avmAcilisTarihi = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[15]/i[1]/i[1]"
    static public String magazaLokasyonTipi = '$magazaLokasyonTipi'
    static public String lokTipSec = "/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr[3]/td[2]"
    static public String expertizRefNo = '$ekspertizReferansNo'
    static public String expertizTarihizul = '$ekspertizTarihi' //datebox
    static public String expertizTarihi = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[9]/i[1]/i[1]"
    static public String tarihSec = "/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[5]/td[5]"
    static public String malSahibiIbanNo = '$malSahibiIbanNo'
    static public String malSahibiHesap = '$malSahibiBankaHesapNo'
    static public String malSahibiTel = '$malSahibiTelefonNo'
    static public String malSahibiVergiNo = '$malSahibiVergiNo'
    static public String malSahibiTC = '$malSahibiTCKimlikNo'
    static public String malSahibiFirmaAdi = '$malSahibiFirma'
    static public String malSahibiTipi = '$malSahibiTipi'
    static public String malSahibiTipiSec = "/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr[3]/td[2]"
    static public String ekspertizDegeri = '$ekspertizDegeri'
    static public String ekspertizDegeriBirim = '$ekspertizDegeriBirim'
    static public String netKiraTutari = '$netKiraTutari'
    static public String netKiraTutariBirim = '$netKiraTutariBirim'
    static public String vergiKategorisi = '$vergiKategorisi'
    static public String vergiKategorisiSec = "/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr[2]/td[2]"
    static public String havaParasi = '$havaParasi'
    static public String havaParasiBirim = '$havaParasiBirim'
    static public String depozito = '$depozito'
    static public String depozitoBirim = '$depozitoBirim'
    static public String emlakciKomisyonu = '$emlakciKomisyonu'
    static public String emlakciKomisyonuBirim = '$emlakciKomisyonuBirim'
    static public String kiraSozlesmeTarihi = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[12]/i[1]/i[1]"
    static public String geriButonu = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[3]/button[1]"
    static public String vazgecButonu = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[3]/button[2]"
    static public String ileriButonu = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[3]/button[3]"

    //Basvurusuz Tab3
    static public String bayiTransfer = "//div[3]/div/div/div/div/div/div/i/input" //'$AIMTransferAcilisBilgisi'
    static public String bayiTransferSec = "//div[3]/table/tbody/tr[6]/td[2]"
    //"//td[contains(text(), 'Tanımlı') and contains(text(), 'değil')]"
    static public String rakipMevcutTipi = "//div[3]/div/div/div/div/div/div/div/i/input"//'$rakiptekiMevcutTipi' //
    static public String rakipMevcutTipiSec = "//div[3]/table/tbody/tr[2]/td[2]" //
    //static public String lokasyon = '$lokasyon'//
    static public String magazaIsim = '$enYakinAveaBayisiIsim'
    static public String magazaUzaklik = '$enYakinAveaBayisiUzaklik'
    static public String magazaBuyukluk = '$magazaBuyuklugu'
    static public String cepheAdi = '$cepheAdi'
    static public String cepheAdiSec = "Arka"
    static public String yukseklikY = '$yukseklikY'
    static public String genislikX = '$genislikX'
    static public String cepheEkle = "//td[4]/div/div/div/div/img"
    static public String dekorasyon = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/i[1]/input[1]"
//'$dekorasyonIstegi'
    static public String dekorasyonSec = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/i[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]"
    static public String dekorasyonMaliyeti = '$dekorasyonMaliyeti'//
    static public String dekorasyonParaBirimi = '$dekorasyonMaliyetiParaBirimi'//
    static public String dekorasyonParaBirimiSec = "/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr[3]/td[2]"//
    static public String tabelaIstegi = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/i[1]/input[1]"
//'$tabelaIstegi'//
    static public String tabelaIstegiSec = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/i[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]"
//
    static public String sektorelTec = '$sektorelTecrube'
    static public String sektorelTecSec = "//body/div[3]/table/tbody/tr[3]/td[2]"
    static public String yakindakiTurkcell = '$yakindakiRakipOperatorTurkcell'
    static public String yakindakiVodafone = '$yakindakiRakipOperatorVodafone'
    static public String yakindakiTTNet = '$yakindakiRakipOperatorTTNet'
    static public String bayiIl = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[12]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[1]/div[1]/i[1]/input[1]"
    //'$bayiIl'
    static public String bayiIlSec = "İSTANBUL"
    static public String bayiIlce = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[12]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[2]/div[1]/i[1]/input[1]"
//'$bayiIlIlceCell'
    static public String bayiIlceSec = "//tr[4]/td/div/span/input"
    static public String bayiIlIlceEkle = "//div[12]/div/div[3]/table/tbody[2]/tr/td[3]/div/div/div/div/img"
    static public String banka = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/i[1]/i[1]"
            //"/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/i[1]/input[1]"

    static public String bankaSec = "//body/div[3]/table/tbody/tr[3]/td[2]"
    static public String bankaAdiSec ="AKBANK T.A.Ş."
    static public String bankaSube = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/i[1]/i[1]"
            //"/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/i[1]/input[1]"
    static public String bankaSubeSec = "//body/div[3]/table/tbody/tr[2]/td[2]"
    static public String bankaSubeAdi ="4.LEVENT ŞUBESİ"
    static public String bankaHspNo = '$hesapNo'
    static public String bankaIBAN = '$ibanNo'
    static public String kordinatX = '$koordinatX'
    static public String kordinatY = '$koordinatY'
    static public String SY = '$satisYoneticisi'
    static public String SYSec = "//body/div[3]/table/tbody/tr/td[2]"
    static public String SYDestek = '$satisDestekYoneticisi'
    static public String SYDestekSec = "//body/div[3]/table/tbody/tr/td[2]"
    static public String kaliteYon = '$bayiKaliteYoneticisi'
    static public String kaliteYonSec = '$bayiKaliteYoneticisi'
    static public String ttnetYetki = '$ttNetYetkiDurumu'
    static public String ttnetYetkiSec = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[12]/i[1]/input[1]"
    static public String donanimAdi = '$donanim'
    static public String donanimAdiSec = "/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr[3]/td[2]"
    static public String tedarikciAdi = '$tedarikci'
    static public String tedarikciAdiSec = "/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr[3]/td[2]"
    static public String donanimAdet = '$donanimAdet'
    static public String donanimSec = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[13]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[4]/div[1]/div[1]/div[1]/div[1]/img[1]"
    static public String statikIP = '$statikIP'
    static public String aramaKabini = '$aramaKabini'
    static public String aramaKabiniSec = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[15]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[3]/div[1]/div[1]/div[1]/div[1]/img[1]"
    static public String xdsl = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[16]/input[1]"
    static public String sozTarih = "//div[17]/i/i"
    static public String sozTarihSec = "//div[3]/div/table/tbody/tr[2]/td/table/tbody/tr[4]/td[5]"
    static public String ileri2Btn = "//div[3]/button[3]"
    static public String tamamBtn = "//div[3]/button[4]"
    static public String bayikodupopup = "//td[5]/div/span"
    static public String loading = "zk_proc-t"
    static public String girisbutton = "//*[text()='Giriş']"

    //Basvurusuz Acilis Tab4
    static public String tamamButton = '$tamam'

    //AnaMenu
    static public String bayiyonetimi = "//div[7]/div[2]/div/div/div/div/div/div[3]/table/tbody[2]/tr/td/div"
    static public String basvurusuzAcilis = "//div[7]/div[2]/div/div/div/div/div/div[3]/table/tbody[2]/tr[3]/td/div/a"
    static public String bayiGoruntuleme = "(//a[contains(text(),'Bayi Görüntüleme')])[2]"
    static public String bayiIletisim = "(//a[contains(text(),'İletişim')])[2]"
    static public String iptal = "(//a[contains(text(),'İptal')])[2]"
    static public String adresSegment = "(//a[contains(text(),'Adres/Segment')])[2]"
    static public String calisanYonetimi = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[22]/td[1]/div[1]"
    static public String Tanimlama = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[23]/td[1]/div[1]/a[1]"

    //BayiGoruntuleme Tab1
    static public String anaBayiKodu = '$anaBayiKoduAra'
    static public String bayiDurumAra = '$bayiDurumuAra'
    static public String bayiDurumSecOp = "(//*[contains(text(),'Operational')])"
    static public String bayiDurumSecDeact = "(//*[contains(text(),'Deactive')])"
    static public String bayiDurumSecBloke = "(//*[contains(text(),'Bloke')])"
    static public String bayiDurumLutfenSec = " //td[contains(text(), 'Lütfen') and contains(text(), 'Seçiniz')]"
    static public String satisNoktasiKodu = '$satisNoktasiKoduAra'
    static public String bayiGrubuAra = '$bayiGrubuAra'
    static public String bayiGrubuSecBir = "(//*[contains(text(),'Bireysel')])[2]"
    static public String bayiGrubuSecKur = "(//*[contains(text(),'Kurumsal')])[2]"
    static public String bayiGrubuSecDist = "(//*[contains(text(),'Distribütör')])[2]"
    static public String bayiTicUnvanAra = '$bayiTicariUnvaniAra'
    static public String bayiVergiNoAra = '$vergiNoAra'
    static public String bayiAnahtarKartNo = '$anahtarkartNoAra'
    static public String bayiTipiAra = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[1]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[4]/td[4]/div[1]/i[1]/i[1]"
    //'$bayiTipiAra'
    static public String bayiGorEDM = "EDM"
    static public String bayiGorTTBN = "TTBN"
    static public String bayiGorESN = "ESN"
    static public String bayiGorTTM = "TTM"
    static public String bayiGorTTMSube = "TTM Şube"
    static public String bayiGorTTILMud = "TTİL Müdürlüğü"
    static public String bayiGorDDM = "DDM"
    static public String bayiGorBolge = '$bolgeAra'
    static public String bayiGorIl = '$ilAra'
    static public String bayiGorIlce = '$ilceAra'
    static public String bayiAraButton = '$ara'
    static public String bayiSonucSatisKodu = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/table[1]/tbody[2]/tr[1]/td[2]/div[1]/span[1]"
    static public String bayiSonucTicUnvan = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/table[1]/tbody[2]/tr[1]/td[3]/div[1]/span[1]"
    static public String bayiSonucBayiTip = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/table[1]/tbody[2]/tr[1]/td[4]/div[1]/span[1]"
    static public String bayiSonucAnaBolge = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/table[1]/tbody[2]/tr[1]/td[5]/div[1]/span[1]"
    static public String bayiSonucBolge = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/table[1]/tbody[2]/tr[1]/td[6]/div[1]/span[1]"
    static public String bayiSonucStatu = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/table[1]/tbody[2]/tr[1]/td[7]/div[1]/span[1]"
    static public String bayiSonucAnahtar = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/table[1]/tbody[2]/tr[1]/td[8]/div[1]/span[1]"
    static public String bayiSonucIl = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/table[1]/tbody[2]/tr[1]/td[9]/div[1]/span[1]"
    static public String bayiSonucIlce = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/table[1]/tbody[2]/tr[1]/td[10]/div[1]/span[1]"

    //Bayi Iletisim Guncelleme
    static public String iletisimSatKodu = '$satisNoktasiKodu'
    static public String iletisimAnahtarNo = '$anahtarkartNo'
    static public String iletisimAraButton = '$ara'
    static public String iletisimGuncNeden = '$guncellemeNedeni'
    static public String iletisimGuncNedenDuzeltme = "Düzeltme"
    static public String iletisimGuncNedenDegisiklik = "İletişim Bilgi Değişikliği"
    static public String iletisimBayiEmail = '$bayiEmail'
    static public String iletisimBayiEmailEkle = '$onBayiEmailAdd'
    static public String iletisimTelSil = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/table[1]/tbody[2]/tr[2]/td[3]/div[1]/div[2]/div[1]/div[1]/img[1]"
    static public String PopupOnayEvet = "/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/button[1]"
    static public String PopupTamam = "/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"

    //gitten alınan
    //Bayiİptal
    static public String anaBayiKodu2 = '$anaBayiKodu'
    static public String bayiTicariUnvani = '$bayiTicariUnvani'
    static public String bayiBireysel = "//td[contains(text(),'Bireysel')]"
    static public String bayiTip2 = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[1]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[8]/div[1]/i[1]/i[1]"
    //bayiTipi
    static public String bayiEDM2 = "EDM"
    static public String satisNoktasiKodu2 = '$satisNoktasiKodu'
    static public String anaBolge2 = '$anaBolge'
    ///html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[1]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[2]/td[6]/div[1]/i[1]/input[1]
    static public String bolge2 = '$bolge'
    static public String secimBolge = "ISTANBUL AVRUPA 1"
    static public String checkBox = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/table[1]/tbody[2]/tr[1]/td[1]/div[1]/span[1]"
    static public String iptalTip = '$iptalTipi'
    static public String iptalTipBayi = "Bayi talebi"
    static public String iptalTipSirket = "Şirket talebi"
    static public String iptalNeden = '$iptalNedeni'
    static public String iptalSecim = "Bayi Tipi Değişikliği"
    static public String devralanSatisNoktasiKodu = '$devralanSatisNoktasiKodu'
    static public String iptalCheckBox = '$ASNIseAltBayiOlarakDevamEtsin'
    static public String iptalAciklama = '$aciklama'
    static public String iptalAciklamaAlani = "Deneme hakan Test"
    static public String vazgec = '$vazgec'
    static public String tamam = '$iptalEt'
    static public String kapanisBelgesiSec = '$belgeTipi'
    static public String KapanisBelgesi1 = "Başvuru Noktası Geçiş Protokolü"
    static public String KapanisBelgesi2 = "İhtarname"
    static public String KapanisBelgesi3 = "Sonlandırma Protokolü"
    static public String dosyaSec = '$gozatKapanisBelgesi'
    static public String gozat = '$gozatKapanisBelgesi'
    static public String gozat2 = "file"
    static public String file = "C:\\ProjeIsmi\\Dosyalar\\RabbitMQ.pdf"
    //static public String Gozat="/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/table[1]/tbody[2]/tr[1]/td[9]/div[1]/div[1]/span[1]"

    //Bilgi Güncelleme  : ADRES/SEGMENT
    static public String degisiklikTip = '$degisiklikTipi'
    static public String degisiklikTip1 = "Adres Değişikliği"
    static public String degisiklikTip2 = "Adres/Segment Değişikliği"
    static public String degisiklikTip3 = "Merkez/Şube Adres Değişikliği"
    static public String degisiklikTip4 = "Segment Değişikliği"
    static public String guncellemeNedeni = '$guncellemeNedeni'
    static public String güncellemeNeden1 = "Bayi talebi ile"
    static public String güncellemeNeden2 = "Daha iyi lokasyon"
    static public String güncellemeNeden3 = "Diğer"
    static public String guncellemeNeden4 = "Doğal afetler"
    static public String guncellemeNeden5 = "Düzeltme"
    static public String guncellemeNeden6 = "İl/İlçe Değişikliği"
    static public String guncellemeNeden7 = "Kira sözleşmesinin sona ermesi"
    static public String guncellemeNeden8 = "Mal sahibi ile anlaşmazlık"
    static public String guncellemeNeden9 = "Merkez/şube adres değişikliği"
    static public String guncellemeNeden10 = "Satış/ Yönetim talebi ile"
    static public String guncellemeNeden11 = "Segment değişikliği"
    static public String subeKoordinatX = '$subeKoordinatX'
    static public String subeKoordinatY = '$subeKoordinatY'
    static public String enYakinAveaBayiIsim = '$enYakinAveaBayiIsim'
    static public String enYakinAveaBayisiUzaklik = '$enYakinAveaBayisiUzaklik'
    static public String magazaBuyuklugu = '$magazaBuyuklugu'
    static public String dekorasyonMaliyeti2 = '$dekorasyonMaliyeti'
    static public String dekorasyonMaliyetiBirim = '$dekorasyonMaliyetiParaBirimi'
    static public String euro = "EUR"
    static public String tL = "TRY"
    static public String usd = "USD"
    static public String cepheBilgi1 = "Arka"
    static public String cepheBilgi2 = "Ön"
    static public String cepheBilgi3 = "Sağ Yan"
    static public String cepheBilgi4 = "Sol Yan"
    static public String cepheBilgi5 = "Yan"
    static public String iptal2 = '$iptal'
    static public String tamam2 = '$tamam'
    static public String popUpEvet = "/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/button[1]"
    static public String txt2 = "/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/button[1]"
    static public String adresadres = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/textarea[1]"

    //KullaniciTanimlama Tab1
    //String sorgu = "SELECT * FROM (SELECT DISTINCT first_name, last_name FROM USER_IDENTITY_INFO WHERE INTL_USER_ID IN ( SELECT INTL_USER_ID FROM USER_POSITION_LIST WHERE POSITION_ID IN (SELECT POSITION_ID FROM POSITION WHERE POSITION_ID IN (SELECT SALES_MNG_POSITION_ID FROM PARTNER_MAIN_COMPANY_MNG WHERE INTL_PARTNER_ID IN (SELECT INTL_PARTNER_ID FROM PARTNER_DEFINITION)))) ORDER BY DBMS_RANDOM.VALUE () )WHERE ROWNUM < 2";
    String sorgu2 = "SELECT partner_id FROM ( SELECT * FROM PARTNER_DEFINITION WHERE TYPE = 182 and status=5765 ORDER BY CDATE DESC) WHERE ROWNUM < 2";
    String sorgu = "SELECT PARTNER_ID FROM ( SELECT P.*, ROW_NUMBER() OVER ( ORDER BY CDATE DESC) RN FROM PARTNER_DEFINITION P  WHERE TYPE = 182 AND STATUS=5765) WHERE RN =15";
    String tcMernisSorgu = "SELECT DISTINCT TC_ID FROM MERNIS WHERE ROWNUM <5";
    public static String ibanNoSorgu = "SELECT DISTINCT BANK_ACCOUNT_IBAN FROM (SELECT P.*, ROW_NUMBER() OVER ( ORDER BY DBMS_RANDOM.VALUE DESC) RN FROM PARTNER_COMMERCIAL P) WHERE RN=1";
    public static String hesapNoSorgu = "SELECT DISTINCT BANK_ACCOUNT_ID FROM (SELECT P.*, ROW_NUMBER() OVER ( ORDER BY DBMS_RANDOM.VALUE DESC) RN FROM PARTNER_COMMERCIAL P WHERE BANK_ACCOUNT_ID IS NOT NULL) WHERE RN=1";
    static public String satisNoktasiKoduTextbox = '$satisNoktasiKoduTextbox'
    static public String araButon = '$ara'
    static public String TCKimlikNoTextbox = '$TCKimlikNoTextbox'
    static public String pozisyonTipiCombobox = '$pozisyonTipiCombobox'
    static public String pozisyonTipi = "Saha Satis Sorumlusu - EDM"
    static public String pozisyonCombobox = '$pozisyonCombobox'
    static public String pozisyon = "SahaSatisSorumlusuEDM"
    static public String pozisyonTipi2 = "Stand Personeli - EDM"
    static public String pozisyon2 = "StandPersoneliEDM"

    static public String bIleri = '$ileri'
    //static public String butonOk= '$tamam'
    static public String uyariMesajiText = "Kullanıcı bilgileri Merniste bulunamamıştır. Lütfen bu bilgileri giriniz."
    static public String uyariMesajiXpath = "/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"
    static public String butonCarpi = "/html[1]/body[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]"
    static public String pUyariMesajiText = "Atanmaya çalışılan pozisyon, başka bir kullanıcı tarafından aktif biçimde kullanılmaktadır. Kullanıcıya yeni pozisyon atayarak işlemi tekrarlamanız gerekmektedir."
    static public String pUyariMesajiTamam = "html[1]/body[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]"
    ///html[1]/body[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]
    static public String pButonCarpi = "/html[1]/body[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]"
    public static String isimSorgu = "SELECT ISIM,SOYISIM,CINSIYET FROM ( SELECT P.*, ROW_NUMBER() OVER ( ORDER BY DBMS_RANDOM.VALUE DESC) RN FROM TESTORTAMI_ISIMLER P) WHERE RN =1";
    public static String soyisimSorgu = "SELECT SOYISIM FROM ( SELECT P.*, ROW_NUMBER() OVER ( ORDER BY DBMS_RANDOM.VALUE DESC) RN FROM TESTORTAMI_ISIMLER P) WHERE RN =1";
    public static String IlAdiSorgu = "SELECT UPPER(IL_ADI) IL_ADI FROM (SELECT P.IL_ADI, ROW_NUMBER () OVER (ORDER BY DBMS_RANDOM.VALUE DESC) RN FROM TESTORTAMI_SEHIRLER P) WHERE RN = 1";
    //Kullanici Tanimlama Tab2

    //fdss

    static public String adiTextbox = '$adiTextbox'
    static public String soyadiTextbox = '$soyadiTextbox'
    static public String dogumTarihi = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/i[1]/i[1]"
    static public String dogumYeriTextbox = '$dogumYeriTextbox'
    static public String adresTextbox = '$adresTextbox'
    static public String postaKoduTextbox = '$postaKoduTextbox'
    static public String binaNoTextbox = '$binaNoTextbox'
    static public String kapiNoTextbox = '$kapiNoTextbox'
    static public String browseButton = "/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/span[3]/form[1]/input[1]"
    static public String iseGirTarID ='$iseBaslamaTarihiDatebox'
    static public String cinsiyet = '$gender'
    static public String cinsiyetSecKadin = "Kadın"
    static public String cinsiyetSecErkek = "Erkek"
    static public String iletisimBilgisiCombo = '$contactTipi'
    static public String iletisimBilgisiCep = "Cep"
    static public String iletisimNo = '$contactNoCep'
    static public String isletisimEkle = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[3]/div[1]/div[1]/div[1]/div[1]/img[1]"
    static public String cyEmailTlkm = "/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr[3]/td[2]" //cy=calısan yonetımı
    static public String cyCombo = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[1]/div[1]/i[1]/i[1]"
    static public String cyEmailDiger = "/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr[2]/td[2]"
    static public String cyEmailDigerVal = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[2]/div[1]/input[1]"
    static public String cyEmailBtn = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[3]/div[1]/div[1]/div[1]/div[1]/img[1]"
    static public String sgkGirisTarihi = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[13]/i[1]/input[1]"
    static public String calisanEmail = '$calisanEmail'
    static public String surucuBelgesiSinifi = '$surucuBelgesiSinifi'
    static public String sgkNoTextbox = '$sgkNoTextbox'
    static public String surucuBelgesi = '$surucuBelgesi'
    static public String sigara = '$sigara'
    static public String iseBaslamaTarihi ="/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[12]/i[1]/input[1]"
    static public String gozatAcikRizaMetni = '$gozatAcikRizaMetni'
    static public String iletisimBilgisiComboXpath = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[1]/div[1]/i[1]/input[1]"
    static public String iletisimNoXpath = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[2]/div[1]"
    static public String iletisimNoBtn = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[3]/div[1]/div[1]/div[1]/div[1]/img[1]"
    static public String tarihOncekiSayfa = "/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]"
    static public String downloadForAcikRizaMetni = "/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/div[3]/button[1]"
    static public String pdfFile = "C:\\Users\\emrah.altas\\Desktop\\aa.pdf"
    static public String pdfXpath = "/html[1]/body[1]/div[7]/div[3]/div[11]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/h3[1]"
    static public String bileri2 = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[3]/button[3]"
    static public String adliSicilKaydiCheckBox = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[18]/span[2]/input[1]"

    //Kullanici Tanimlama Tab3

    static public String eduSeviye = '$eduSeviye'
    static public String eduOkul = '$eduOkul'
    static public String eduBolumu = '$eduBolumu'
    static public String eduTarih = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[4]/div[1]/i[1]/i[1]"
    //'$eduTarih'
    static public String eduButon = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[5]/div[1]/div[1]/div[1]/div[1]/img[1]"
    static public String eduSeviyeSec = "Yüksekögretim"
    static public String tamamButonXpath = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[3]/button[4]"
    static public String islemKodu = "/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]"
    static public String islemKoduAl="/html[1]/body[1]/div[4]/div[3]"

    static public String txn_id_Ok_Buton = "/html[1]/body[1]/div[4]/div[3]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/button[1]"

    //KULLANICI GORUNTULEME BIREYSEL

    static public String kgSorguBireyseledm = "SELECT DISTINCT USER_NAME FROM ( SELECT DISTINCT X.*, ROW_NUMBER () OVER (ORDER BY X.CDATE DESC) RN FROM USER_IDENTITY_INFO A, USER_POSITION_LIST B, POSITION C, PARTNER_DEFINITION D, USER_DEFINITION X WHERE X.USER_NAME IN (SELECT USER_NAME FROM USER_DEFINITION WHERE X.INTL_USER_ID = A.INTL_USER_ID) AND A.INTL_USER_ID = B.INTL_USER_ID AND B.POSITION_ID = C.POSITION_ID AND C.INTL_PARTNER_ID = D.INTL_PARTNER_ID AND D.TYPE = 182 AND X.USER_NAME IS NOT NULL) WHERE RN =1"
    static public String kullaniciKoduTextbox2 = '$kullaniciKoduFilterTextbox'
    static public String kullaniciKoduTextbox = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[1]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[3]/td[2]/div[1]/input[1]"
    static public String cyAraButon = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]/td[2]/div[1]/button[1]"
    static public String getirButon = '$getirButton'
    static public String filtreleButton = '$filtreleButton'
    static public String Goruntuleme = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[26]/td[1]/div[1]/a[1]"
    static public String secim = "/html[1]/body[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/fieldset[3]/div[1]/div[1]/div[3]/table[1]/tbody[2]/tr[1]"
    static public String onLinkIleri = '$ileri'
    static public String tamamButon = '$tamam'


    //pozisyon Değiştir
    static public String pdXpath = "/html[1]/body[1]/div[1]/div[7]/div[1]/div[1]/div[2]/div[2]/button[3]"
    static public String btnDevam='$btnDevam'

    //kanal is gucu
    static public String islemNo = '$islemNo'
    static public String araButonu= '$ara'


    /*  //VKN Uret
      def generate_vergi_kimlik_numarasi
      vkn = rand(100000000..999999999).to_s
      sum = 0
      j = 9
      for i in 0..9
      i1 = ((vkn.chars[i]).to_i + j) % 10
      i2 = (i1 * (2 ** j)) % 9
      sum += (i1 != 0 && i2 == 0) ? 9 : i2
      j = j - 1
      end
      lastdigit = ((sum % 10) == 0) ? 0 : (10 - (sum % 10)).to_s
      return vkn.to_s + lastdigit.to_s
      end */

    //public String simdikiZaman () {
        //String DateFormat;
       //String SimpleDateFormat;
      //  Date simdikiZaman = new Date();
        //DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    //}
    //public static String simdikiZaman(){
      //  DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy")
      //  Date date = new Date()
      //  return dateFormat.format(date).toString()
    //}


    public String randomSayi() {
        Random rad = new Random();
        int Low = 1;
        int High = 13;
        int Result = rad.nextInt(High - Low) + Low;
        return Result.toString();
    }

    //VKNNN
    public String vknNoUret() {
        long vkn;
        String vknStr;
        long sum;
        long j;
        long i1;
        long i2;
        String lastDigit;
        vkn = (new Random().nextInt(999999999 - 100000000) + 100000000);
        sum = 0;
        j = 9;
        vknStr = String.valueOf(vkn);
        for (int i = 0; i <= 9; i++) {
            i1 = (Long.valueOf(vknStr) + 9) % 10;
            i2 = (i1 * (2 ^ j)) % 9;
            sum += (i1 != 0 && i2 == 0) ? 9 : i2;
            j = j - 1;
        }
        lastDigit = String.valueOf((((sum % 10) == 0) ? 0 : (10 - (sum % 10))));
        return lastDigit + vknStr;

    }

    //TCKN Uret
    public String TcOlustur() {
        Vector<Integer> array = new Vector<Integer>();
        Random randomGenerator = new Random();
        array.add(new Integer(1 + randomGenerator.nextInt(9)));
        for (int i = 1; i < 9; i++) array.add(randomGenerator.nextInt(10));
        int t1 = 0;
        for (int i = 0; i < 9; i += 2) t1 += array.elementAt(i);
        int t2 = 0;
        for (int i = 1; i < 8; i += 2) t2 += array.elementAt(i);
        int x = (t1 * 7 - t2) % 10;
        array.add(new Integer(x));
        x = 0;
        for (int i = 0; i < 10; i++) x += array.elementAt(i);
        x = x % 10;
        array.add(new Integer(x));
        String tckn = "";
        for (int i = 0; i < 11; i++) tckn = tckn + Integer.toString(array.elementAt(i));
        return tckn;
    }

    //Email
    public String email() {
        Random rad = new Random();
        String a;
        a = ("usename" + rad.nextInt(5000000) + "@seleniumoto22.com");
        return a;
    }

    //Email Turktelekom
    public String emailtt() {
        Random rad = new Random();
        String a;
        a = ("username" + rad.nextInt(5000000) + "@turktelekomisortagim.com.tr");
        return a;
    }

    //İsim
    final String lexicon = "ABCStringGHIJKLMNOPQRSTUVWXYZ";
    final java.util.Random rand = new java.util.Random();
// consider using a Map<String,Boolean> to say whether the identifier is being used or not
    final Set<String> identifiers = new HashSet<String>();

    public String isim() {
        StringBuilder builder = new StringBuilder();
        while (builder.toString().length() == 0) {
            int length = rand.nextInt(5) + 5;
            for (int i = 0; i < length; i++) {
                builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
            }
            if (identifiers.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        return builder.toString();
    }

//Tel
    public String tel() {
        Random rad = new Random();
        int Low = 500;
        int High = 560;
        int Result = rad.nextInt(High - Low) + Low;
        Random rad2 = new Random();
        int Low2 = 1000001;
        int High2 = 9999999;
        int Result2 = rad2.nextInt(High2 - Low2) + Low2;
        return Result.toString() + Result2.toString();
    }

    public static String dbconnect(String sql) { //secil nur sucu - mert aydın - 22.11.2018 -- db bağlantı metodu
        // Creating the connection
        String serverName = "10.248.67.16";
        String portNumber = "1521";
        String sid = "PRMDBT04";
        @SuppressWarnings("unused")
        String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;
        String user = "PRMADM";
        String pass = "prmadm123";
        //String eDMBayiBul= "Select partner_id from partner_definition where type=182 and status=5765 and rownum=1 "

        //String sql = "SELECT * FROM (SELECT DISTINCT first_name, last_name FROM USER_IDENTITY_INFO WHERE INTL_USER_ID IN ( SELECT INTL_USER_ID FROM USER_POSITION_LIST WHERE POSITION_ID IN (SELECT POSITION_ID FROM POSITION WHERE POSITION_ID IN (SELECT SALES_MNG_POSITION_ID FROM PARTNER_MAIN_COMPANY_MNG WHERE INTL_PARTNER_ID IN (SELECT INTL_PARTNER_ID FROM PARTNER_DEFINITION)))) ORDER BY DBMS_RANDOM.VALUE () )WHERE ROWNUM < 2";
        Connection con = null;
        try {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            con = DriverManager.getConnection(url, user, pass);
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet m = st.executeQuery();
            while (m.next()) {
                return m.getString(1)
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //VKN Uret
    public String random_vergi_no() {

        int a;
        double calc, sonrakam, toplam = 0;
        double[] dizi = new double[9];
        double[] dizi2 = new double[9];
        Random rand = new Random();
        String number = String.valueOf(rand.nextInt(900000000) + 100000000);
        for (int i = 0; i < 9; i++) {
            a = Integer.parseInt(number.substring(i, (i + 1)));
            calc = a + 9 - i;
            dizi[i] = calc % 10;
            if (dizi[i] == 9) dizi2[i] = dizi[i];
            else dizi2[i] = (dizi[i] * Math.pow(2, 9 - i)) % 9;
            toplam += dizi2[i];
        }
        sonrakam = (10 - (toplam % 10)) % 10;
        return (number + String.valueOf((int) sonrakam));
    }

    public String adres() {
        Random rad = new Random();
        String a;
        a = ("adres " + rad.nextInt(5000000))
        return a;
    }

    public String RandGiris(int min, int max) {
        Random rand = new Random();

        int n = rand.nextInt(max) + min;

        return n;
    }

    public String CepheSecim(int min, int max) {
        Random rand = new Random();

        int n = rand.nextInt(max) + min;

        return n;
    }

    public String sorguSonucu(String sql) {

        String isim = new String(dbconnect(sql));
        return isim;
    }




    public void sorguSonucu3(String sql) {


        DbConnectTekag dbConnectTekag = new DbConnectTekag()
        try {
            if (dbConnectTekag.getConnection()) {
                dbConnectTekag.rset = dbConnectTekag.getStatement().executeQuery(sql);
                while (dbConnectTekag.rset.next()) {

                    String isimm = dbConnectTekag.rset.getString("ISIM");
                    String soyisimm = dbConnectTekag.rset.getString("SOYISIM");
                    String cinsiyet = dbConnectTekag.rset.getString("cinsiyet");
                    liste.add(isimm)
                    liste.add(soyisimm)
                    liste.add(cinsiyet)
                }
            }


        } catch (Exception e1) {

            e1.printStackTrace();
        } finally {
            dbConnectTekag.closeConnection();
        }
    }

    public static String sgkNo() {

        Vector<Integer> array = new Vector<Integer>();
        Random randomGenerator = new Random();
        array.add(new Integer(1 + randomGenerator.nextInt(9)));
        for (int i = 1; i < 13; i++)
            array.add(randomGenerator.nextInt(10));
        int t1 = 0;
        for (int i = 0; i < 13; i += 2)
            t1 += array.elementAt(i);
        int t2 = 0;
        for (int i = 1; i < 13; i += 2)
            t2 += array.elementAt(i);
        int x = (t1 * 7 - t2) % 10;
        array.add(new Integer(x));
        x = 0;
        for (int i = 0; i < 13; i++)
            x += array.elementAt(i);
        x = x % 10;
        array.add(new Integer(x));
        String tckn = "";
        for (int i = 0; i < 13; i++)
            tckn = tckn + Integer.toString(array.elementAt(i));
        return tckn;

    }


}

;


