package partten.singleton;

public class Test {

    public static void main(String[] args) {
        Singleton singleton = Singleton.createSingleton();
        System.out.println(singleton);
        Singleton singleton1 = Singleton.createSingleton();
        System.out.println(singleton1);
        System.out.println(singleton == singleton1);
    }
}
