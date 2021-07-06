class newthread implements Runnable {
    double a,sum=0;
    Thread t;
    newthread(double  a)
    {
        this.a=a;
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        
        for(double i=a+1;i<=a+100000;i++)
        {
            sum+=i;
        }
        
    }
}

public class billion_summation_Multiple_Thread {
    public static void main(String[] args)
    {
        double sum=0,start=0;

        for(int i=0;i<20;i++)
        {
            newthread thread=new newthread(start);
            start+=100000;
            try {
                thread.t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sum+=thread.sum;
            

        } 
        System.out.printf("%12f\n",sum);
    }
    
}
