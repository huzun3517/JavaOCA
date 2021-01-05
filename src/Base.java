public class Base {

    public void test(){
        System.out.println("Base ");
    }
}
class DerivedA extends Base{

    public void test(){
        System.out.println("DerivedA ");
    }
}
class DeriveedB extends DerivedA{
    public void deneme(){};
    public void test() {
        System.out.println("DerivedB");
    }

    public static void main(String[] args) {
        Base b1=new DeriveedB();
        Base b2=new DerivedA();
        Base b3=new DeriveedB();
        b1=(Base) b3;
        Base b4=(DerivedA) b3;
//        b1.test();
//        b4.test();
        b2.test();
        //b3=(DeriveedB)b2;   // exception verir

        /* -ust siniflara cast yapabiliriz fakat alt siniflara cast yapildiginda class cast exception verir.
            -polymorphism yapildiginda sadece super classin method ve fieldlarini gorebiliriz.
            sinifin kendine ozel method ve fieldlerini goremeyiz. Gorebilmek icin direk classi cagiracak bir obje olusturmaliyiz.
            -sadece override yapilmis methodlarin override yapildigi hallerini gorebiliriz.

         */

    }
}