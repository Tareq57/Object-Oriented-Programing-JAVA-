abstract  class  abss{
    abstract void call();//anbstruct method can not have a body
    void show(){
        System.out.println("Abstruct class can carry conctrete method");
    }
}
class T extends  abss{
    //must be declare or impliment the abstruct method of abstruct class
@Override
    void call(){
        System.out.println("It is a abstruct method");
    }
}

public  class Abstruct_Class {
    public static void main(String[] args) {
        T cnn=new T();
        cnn.call();
    }
}