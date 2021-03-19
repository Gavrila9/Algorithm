public class PrintNumbers extends Thread{
    public int count = 1;
    boolean flag = true;
    public void run(){
        while(flag){
            synchronized(this){
                if(count <= 100){
                    notify();
                    System.out.println(currentThread().getName() + ":" +count);
                    count++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    flag = false;
                }

            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        PrintNumbers pn = new PrintNumbers();
        Thread t1 = new Thread(pn);
        Thread t2 = new Thread(pn);
        t1.start();
        t2.start();
    }
}