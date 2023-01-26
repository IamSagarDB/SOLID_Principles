package OODesign.Singleton;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException , ClassNotFoundException{
        LazySingleton singleton = LazySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(singleton);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        LazySingleton deserialized = (LazySingleton) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("Serialized: "+singleton.hashCode());
        System.out.println("DeSerialized: "+deserialized.hashCode());
    }
}
