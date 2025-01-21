public class SporSalonu {
    private String  ad ;
    private String adres ;

    public SporSalonu(String ad, String adres) {
        this.ad = ad;
        this.adres = adres;
    }
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getAdres() {
        return adres;
    }
    public void setAdres(String adres) {
        this.adres = adres;
    }
    public void salonBilgileri() {
        System.out.println("Spor Salonu Adı: " + ad);
        System.out.println("Adres: " + adres);
    }


    

}