public class Employee {
    public int salary;

}
 class Manager extends Employee{
    public int budget;
}
class Director extends Manager{
    public  int stockOptions;

    public static void main(String[] args) {
        Employee employee=new Employee();
        Manager manager=new Manager();
        Director director=new Director();

        employee.salary=50_000;
       director.salary=80_000;
        // employee.budget=1_000_000;
         manager.budget=500;
         //manager.stockoption=500;
         director.stockOptions=1_000_000;

         // birbirinden extend edilen classlarda alt siniflar ustteki method ve fieldleri gorebilir.
        //Fakat alt siniflar ust siniflardaki method ve fieldleri goremez.

    }
}
