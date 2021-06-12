import java.util.Scanner;

public class Simple_Inheritance {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        B subclass=new B();
        A superclass=new A();
        System.out.println(subclass.Show_Sum(a, b));
        System.out.println(subclass.show_sum_all(a, b, c));
        System.out.println(subclass.show_sumc(a));
        System.out.println(superclass.Show_Sum(b, c));

    }
}
class A{

    int Show_Sum(int i,int j)
    {
        return i+j;
    }
}
// B is a subclass and A is a superclass.Here B inherits A.
class B extends A{
    int show_sumc(int k)
    {
        return k;
    }
    int show_sum_all(int i,int j,int k)
    {
        return i+j+k;
    }
}
