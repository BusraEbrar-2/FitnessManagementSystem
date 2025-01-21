public class FitnessUyesi extends Uye {
    private double height ;

    public FitnessUyesi(String üyeadi, String üyesoyadi, int age, double height) {
        super(üyeadi, üyesoyadi, age);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
@Override
public double abonelikUcretiHesapla() {
    return 200+ ( getAge() * 2) ;
}
    
// age private ve farklı sınıftan erişilmeye çalışılıyor 
// get kullnamalısın 


@Override
    public void sporYap() {
        System.out.println("Fitness yapılıyor.");
    }
    


}
