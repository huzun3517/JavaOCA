//public interface Downloadable {
//    public void download();
//}
//interface Readable extends Downloadable{
//    public void readBook();
//}
//abstract class Book implements Readable{
//    public void readBook(){
//        System.out.println("Read Book");
//    }
//}
// class EBook extends Book{
//    public void readBook(){
//        System.out.println("Read E-Book");
//    }

    //}

//    public static void main(String[] args) {
//        Book book1= new EBook();
//        book1.readBook();
//   }
//}

/* interfacedeki methodlar kendisine bagli olusturulan ilk interface yada abstract olmayan classda implement edilmek zorundadir.
-burada download methodu imlement edilmedigi icin hata verir.
-abstract classlar interfacedeki methodlari imlement etmek zorunda degildir fakat implement edersede hata ortadan kalkar.
*/