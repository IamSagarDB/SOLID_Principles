package OODesign.Singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable {
    private static LazySingleton instance;

    private LazySingleton() {

    }

    public static LazySingleton getInstance(){
        if (instance == null){
            synchronized (LazySingleton.class){
                if (instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("Do Something");
    }

    protected Object readResolve(){
        return getInstance();
    }
}
