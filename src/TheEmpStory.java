
//Create a parent class Employee and child classes Developer and Tester Demonstrate inheritance and method overriding.


class Employee{

    public void work(){
        System.out.println("Employee is working ");
    }
}
class Developer extends Employee{
    @Override
    public void work() {
        super.work();
        System.out.println("Developer is writing code");
    }

}
class Tester extends Employee{
    @Override
    public void work(){
        super.work();
        System.out.println("Tester is testing");
    }
}




public class TheEmpStory {
    public static void main(String[] args) {
        Employee emp1=new Developer();
        emp1.work();

        Employee emp2=new Tester();
        emp2.work();

    }
}
