public class Menü {
    public static void  main (String[] args ) {

        SporSalonu ss = new SporSalonu("elit","bağcilar") ;
ss.salonBilgileri ();

Uye f = new FitnessUyesi("ebrar","ozturk",20,174);
Uye y = new YogaUyesi("busra", "ozturk", 20, 00) ;

System.out.println("Fitness Üyesi:");
f.uyeBilgileriYazdir();
f.sporYap();
f.check();


System.out.println("Yoga Üyesi:");
y.uyeBilgileriYazdir();
y.sporYap();
y.check();

islemler(f) ;
islemler (y);
    }
public static void islemler (Uye uye ) {
    if (uye instanceof FitnessUyesi) {
        System.out.println("Bu bir Fitness Üyesidir.");
    } else if  (uye instanceof YogaUyesi) {
        System.out.println("Bu bir Yoga Üyesidir.");
}

    }
}
