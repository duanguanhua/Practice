package JavaSE.day26.demo;

/**
 * Created by Duan Guanhua on 2017/10/22.
 */
public class SubTread extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("run......" + i);
        }
    }
}
