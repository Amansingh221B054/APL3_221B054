public class LazySingleton {
   
    private static LazySingleton instance;
    private static boolean isCalled = false;

   
    private LazySingleton() {
        if (isCalled) {
            throw new IllegalStateException("Instance already created");
        }
        isCalled = true;
    }

   
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}


class  {
    public static void main(String[] args) {
        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();
        
        System.out.println(singleton1 == singleton2);
    }
}
