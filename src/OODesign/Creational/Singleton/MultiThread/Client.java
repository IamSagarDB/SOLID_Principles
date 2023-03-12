package OODesign.Creational.Singleton.MultiThread;

public class Client {
    public static void main(String[] args) {
        System.out.println("If you see same value, then singleton was using same instance \nIf you see different vale then 2 singleton instance were created\n");

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonMultiThread singletonMultiThread = SingletonMultiThread.getInstance("FOO");
            System.out.println(singletonMultiThread.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonMultiThread singletonMultiThread = SingletonMultiThread.getInstance("BAR");
            System.out.println(singletonMultiThread.value);
        }
    }
}
