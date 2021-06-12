public class Multilevel_Inheritance {
    public  static  void  main(String[] args){
        z obj=new z();
        obj.a=5;
        obj.b=2;
        obj.c=4;
    }

}
class x{
    int a;
    x(){
        System.out.println("X's Constructor");
    }
}
class  y extends  x{
    int b;
    y(){
        System.out.println("Y's Constructor");
    }
}
class  z extends  y{
    int c;
    z(){
        System.out.println("Z's Constructor");
    }
}
