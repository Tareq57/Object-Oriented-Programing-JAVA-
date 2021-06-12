public class Dinamic_Method_Dsipatch {
    public static void main(String[] args) {
        P p=new  P();
        Q q=new  Q();
        R r= new R();
        P x;
        x=p;
        x.call();
        x=q;
        x.call();
        x=r;
        x.call();

    }
}
class  P{
    void call(){
        System.out.println("Class P");
    }
}
class  Q extends  P{
    void  call()
    {
        System.out.println("Class Q");
    }
}
class  R extends  Q{
    void call(){
        System.out.println("class R");
    }
}

