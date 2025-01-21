abstract class Uye implements Spor  {
   private  String üyeadi;
   private String üyesoyadi ;
   private int age ;

public Uye(String üyeadi, String üyesoyadi, int age) {
    this.üyeadi = üyeadi;
    this.üyesoyadi = üyesoyadi;
    this.age = age;
}





public String getÜyeadi() {
    return üyeadi;
}





public void setÜyeadi(String üyeadi) {
    this.üyeadi = üyeadi;
}





public String getÜyesoyadi() {
    return üyesoyadi;
}





public void setÜyesoyadi(String üyesoyadi) {
    this.üyesoyadi = üyesoyadi;
}





public int getAge() {
    return age;
}





public void setAge(int age) {
    this.age = age;
}





// üst sınıf abstract değilse metodlar doldurmak zorunda dğil 
// abstract metod vrsa doldurmak zorunda 
 public abstract double abonelikUcretiHesapla () ;
 public void uyeBilgileriYazdir() {
    System.out.println("Ad: " + üyeadi + ", Soyad: " + üyesoyadi + ", Yaş: " + age);
} 
public void check() {
    System.out.println("Sağlık durumu kontrol edildi.");
}


}
