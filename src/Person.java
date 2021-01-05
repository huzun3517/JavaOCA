public class Person {
    String name;
    int age=25;

    public Person(String name){
       //this();   //line n1     //bos constructori cagirdigi icin hata verir. bos constructor tanimlarsak calisir.yada this() i hic cagirmayadabilirdik.
        setName(name);
    }
    public Person(String name,int age){
     //Person (name);      //line n2  //ayni sinifin icinde bu sekilde cagrilamaz. this(name) yada setName(name) yazilabilir
        setAge(age);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String show(){
        return name+" "+age;
    }

    public static void main(String[] args) {
        Person p1=new Person("Jesse");
        Person p2=new Person("Walter",52);
        System.out.println(p1.show());
        System.out.println(p2.show());

        /*
        this() ve super() herzaman ilk satirda yazilmali ikinci satirda yazilamaz.


         */
    }
}
