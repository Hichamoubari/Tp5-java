public class Computer extends Thread{
    int number;
    public Computer(int number){
        this.number = number;}
    void num(){
        number = number +1;}
    int getNumber(){
        return number;}
    public static void main(String[] args){
        Computer c1 = new Computer(12);
        Computer c2 = new Computer(14);
        Computer c3 = new Computer(15);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        t1.start();
        t2.start();
        t3.start();}
    @Override
    public void run() {
        num();
        System.out.println(getNumber());

    }
}


