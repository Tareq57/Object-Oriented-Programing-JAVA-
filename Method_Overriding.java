public class Method_Overriding {
    public static  void  main(String[] args){
        subclass sub=new subclass(5,6,7);
        sub.show();
        superclass superclass=sub;
        superclass.show();//will show the overriding method
    }
}

class  superclass{
    int a,b;
    superclass(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void show()
    {
        System.out.println(a*b);
    }
}
class subclass extends superclass{
    int c;
    subclass(int a,int b,int c)
    {
        super(a,b);
        this.c=c;

    }
    @Override//method of overriding
    void show()
    {
        System.out.println(a*b*c);
    }
}