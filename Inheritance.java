public class Inheritance {
    public  static  void  main(String[] args)
    {
        triangle tri=new triangle();
        triangle tri2=new triangle(5,6,7);
        triangle tri3=new triangle(tri2);
        rectangle rect=new rectangle(4,5,6,8);
        triangle tri4=rect;//assign rect reference to tri reference
        System.out.println(tri.area());
        System.out.println(tri3.area());
        System.out.println(tri2.area());
        System.out.println(tri4.area());
        System.out.println(rect.area());//inheritence

    }

}
class triangle{
    double a,b,c;
    triangle(double a,double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    triangle()
    {
        a=b=c=1;
    }
    triangle(triangle obj)
    {
        a=obj.a;b=obj.b;c=obj.c;
    }
    double area()
    {
       double s=(a+b+c)/2;
       return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
class  rectangle extends  triangle{
    double d;
    rectangle(double a,double b,double c,double d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
}
