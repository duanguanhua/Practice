package JavaSE.day26.demo;

/**
 * Created by Duan Guanhua on 2017/10/22.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        SubTread st = new SubTread();
        st.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("main......" + i);
        }
    }
}
