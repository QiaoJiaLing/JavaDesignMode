package partten.singleton;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton createSingleton() {
        if(singleton == null) {
            singleton = new Singleton();
            return singleton;
        }else {
            return singleton;
        }
    }

}
