package OODesign.Creational.Singleton.MultiThread;

public class SingletonMultiThread {
    private static volatile SingletonMultiThread instance;
    public String value;

    private SingletonMultiThread(String value) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    // Singleton instance for multi-threaded application

    public static SingletonMultiThread getInstance(String value) {
        // The approach taken here is called double-checked locking (DCL). It
        // exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate
        // instances as a result.
        //
        // It may seem that having the `result` variable here is completely
        // pointless. There is, however, a very important caveat when
        // implementing double-checked locking in Java, which is solved by
        // introducing this local variable.
        //
        SingletonMultiThread result = instance;
        if (result != null) {
            return result;
        }

        synchronized (SingletonMultiThread.class) {
            if (instance == null) {
                instance = new SingletonMultiThread(value);
            }

            return instance;
        }
    }
}
