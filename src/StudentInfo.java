//Create a Student class with name, rollNo, marks, parameterized constructor and displayStudent() method.

class Student{
    String name;
    int rollno;
    double marks;


       Student(String name,int rollno,double marks){
           this.name=name;
           this.rollno=rollno;
           this.marks=marks;
       }


       public void displayStudent(){
           System.out.println("Student name   :"+name);
           System.out.println("Student roll_no:"+rollno);
           System.out.println("Student Marks  :"+marks);
       }
}


public class StudentInfo {
    public static void main(String[] args) {

        Student obj=new Student("Ranveer",23087,500.0);
        Student obj1=new Student("Ranjeet",23089,150.0);
        Student obj2=new Student("Rohan",23080,130.0);

        obj.displayStudent();


    }
}
