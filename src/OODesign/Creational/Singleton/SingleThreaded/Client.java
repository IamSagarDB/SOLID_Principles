package OODesign.Creational.Singleton.SingleThreaded;

public class Client {
    public static void main(String[] args) {
        System.out.println("If you see same value, then singleton was using same instance \nIf you see different vale then 2 singleton instance were created\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);

    }
}
