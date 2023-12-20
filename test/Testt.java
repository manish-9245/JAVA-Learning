package test;

class Pen{
    String color;
    String type;
public void write (){
    System.out.println("Write something");
}
public void Colour(){
    System.out.println(this.color);
}
}
class Student{
String name;
int age;
public void printAge(){
    System.out.println(age+" "+name);
}
//Parameterized constructor
    Student(String name,int age){
    this.name=name;
    this.age=age;
//        System.out.println(this.name);
//        System.out.println(this.age);
        //Non Parameterized constructor
    }
//Student(){
//    System.out.println("Constructor Called");
//    //Non Parameterized constructor
//}
}
public class Testt {
    public static void main(String args[]){
        Pen pen1=new Pen();
        pen1.color="red";
        pen1.type="ball pen";
        pen1.write();
        Pen pen2=new Pen();
    pen2.color="black";
    pen2.type="gel";
    pen1.Colour();
    pen2.Colour();
    Student s1=new Student("Manish",22);
//    s1.age=23;
//    s1.name="ravi";
    s1.printAge();
    }
}
