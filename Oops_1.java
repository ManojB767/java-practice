//class Pen{
//    String color;
//    String type;
//    public void detailsAboutpen( ) {
//        System.out.println(" here are the details about the pen");
//    }
//    public void printColor(){
//        System.out.println(this.color);
//    }
//    public void printType(){
//        System.out.println(this.type);
//    }
//}
//public class Oops_1 {
//    public static void main(String[] args) {
//        Pen pen1 = new Pen();
//        Pen pen2 = new Pen();
//        pen1.color= "blue";
//        pen2.color="blaco";
//        pen1.type="ball";
//        pen2.type="gel";
//        pen1.detailsAboutpen();
//        pen1.printType();
//        pen2.printColor();
//    }
//}


import java.util.Scanner;
class Student1{
    String studentName;
    String studentDepartment;
    int studentAge ;
    public void studentAgeSquare(){
        System.out.println(this.studentAge*this.studentAge);
    }
    public void printName(){
        System.out.println(this.studentName+this.studentDepartment);
    }
    Student1(String studentName,String studentDepartment, int studentAge){
        this.studentName=studentName;
        this.studentAge=studentAge;
        this.studentDepartment=studentDepartment;
        System.out.println(this.studentName+ " was called , so heres the data ");
    }
}
public class Oops_1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Student1 s1= new Student1(sc.next(),sc.next(),sc.nextInt());
        s1.studentAgeSquare();
        s1.printName();

    }
}
