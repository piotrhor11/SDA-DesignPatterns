package SingletonPattern;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void printSingletonUsage() {
        System.out.println("A singleton is used when you do want an actual object (with its own internal state and everything), and you want to limit your system to exactly one instance of that object.\n " +
                "This might be useful if you have some kind of shared resource, such as a database, an in-memory cache, or maybe some specialized piece of hardware like a robotic arm.\n" +
                " Many parts of your program might want to use this resource and you might want to have all access to the resource go through a single point.\n " +
                "A singleton isn't always the only way to handle these situations, but it's one of the few places I think a singleton might be a good choice.");
    }

}
