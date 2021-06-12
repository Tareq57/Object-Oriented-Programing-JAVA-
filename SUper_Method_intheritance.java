public class SUper_Method_intheritance {
    public  static  void  main(String[] args)
    {
        triangle1 tri=new triangle1();
        triangle1 tri2=new triangle1(5,6,7);
        triangle1 tri3=new triangle1(tri2);
        rectangle1 rect=new rectangle1(4,5,6,8);
        triangle1 tri4=rect;//assign rect reference to tri reference
        System.out.println(tri.area());
        System.out.println(tri3.area());
        System.out.println(tri2.area());
        System.out.println(tri4.area());
        System.out.println(rect.area());//inheritence

    }
}
class triangle1{
    double a,b,c;
    triangle1(double a,double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    triangle1()
    {
        a=b=c=1;
    }
    triangle1(triangle1 obj)
    {
        a=obj.a;b=obj.b;c=obj.c;
    }
    double area()
    {
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
class  rectangle1 extends  triangle1{
    double d;
    rectangle1(double a,double b,double c,double d){
        super(a,b,c);// When construct a super class from base class we should use super key word and this statement should be in first.
        this.d=d;
    }
}
