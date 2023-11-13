/**
 * 无限睡眠（阻塞程序执行）
 */
public class Main {

    public static void main(String[] args) throws InterruptedException{
        long ONS_HOUR = 60 * 60 * 1000L;
        Thread.sleep(ONS_HOUR);
        System.out.println("睡完了");
    }
}
