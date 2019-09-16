import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class TestLock {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(ticket,"1号窗口").start();
        new Thread(ticket,"2号窗口").start();
        new Thread(ticket,"3号窗口").start();
    }
}
class Ticket implements Runnable{

    private int tick = 20;

    private Lock lock = new ReentrantLock();

    @Override
    public void run() {

        while(true){
            lock.lock();//如果被其它资源锁定，会在此等待锁释放，达到暂停的效果
            if(tick > 0){
                try {
                    try {
                        Thread.sleep(200);
                    } catch (Exception e) {
                    }
                    System.out.println(Thread.currentThread().getName() + "完成售票，余票为：" + --tick);
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}