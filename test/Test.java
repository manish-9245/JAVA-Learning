package test;
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        int man=455;
        System.out.println(man);
//        int b=System.in.read();
Scanner mann=new Scanner(System.in);
String user;
System.out.println("Enter man");
user=mann.nextLine();
System.out.println("Man is:"+user);
char [] a=new char[5];
a[0]='a';
        a[1]='a';
        a[2]='a';
        a[3]='a';
        a[4]='a';
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
        ran(4,5);
        Test obj=new Test();

        System.out.println( obj.bro(77,3));
    }
    public static void ran(int num1,int num2){
        System.out.println(num1+num2);
    }
    public int bro(int i,int j){
        return i+j;
    }
}
