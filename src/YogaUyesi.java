public class YogaUyesi extends Uye  {
    private int seviye ;

    public YogaUyesi(String üyeadi, String üyesoyadi, int age, int seviye) {
        super(üyeadi, üyesoyadi, age);
        this.seviye = seviye;
    }

    public int getSeviye() {
        return seviye;
    }

    public void setSeviye(int seviye) {
        this.seviye = seviye;
    }
public double abonelikUcretiHesapla() {
    return 150 + (seviye * 50); }

    public void sporYap() {
        System.out.println("Yoga yapılıyor.") ;
    }

}
