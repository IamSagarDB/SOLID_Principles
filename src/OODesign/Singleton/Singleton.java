package OODesign.Singleton;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static Singleton instance;

    private Singleton(){

    }
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Do Something");
    }

    protected Object readResolve(){
        return getInstance();
    }
}
