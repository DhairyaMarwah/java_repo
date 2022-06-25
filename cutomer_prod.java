class Mythread1 implements Runnable{
    Customer2 c;
    public void run(){
        c.withdraw(15000);
    }
    Mythread1(Customer2 c){
        this.c=c;
    }
}
class Mythread2 implements Runnable{
    Customer2 c;
    public void run(){
        c.deposit(110000);
    }
    Mythread2(Customer2 c){
        this.c=c;
    }
}
class Customer2{
    int amount =10000;
    synchronized  void withdraw(int amount){
        System.out.println("going to withdraw");
        if(this.amount<amount){
            System.out.println("less balance");
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            this.amount-=amount;
            System.out.println("withdraw complete");
        }
    }
        synchronized  void deposit(int amount){
            System.out.println("going to deposit");
             
                System.out.println("less balance");
                 
                this.amount+=amount;
                System.out.println("deposit complete");
             
            notify();
    }
}
 public class oop{
    public static void main(String[] args) {
        Customer2 c=new Customer2();
        Thread t1=new Thread(new Mythread1(c));
        Thread t2=new Thread(new Mythread2(c));
        // Mythread1 t2=new Mythread2(c);
        t1.start();
        t2.start();
    }
}