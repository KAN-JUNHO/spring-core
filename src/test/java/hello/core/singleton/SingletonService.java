package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance =new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }
    private SingletonService(){

    }

    public static void main(String[] args) {
        SingletonService singletonService1 = new SingletonService();
        SingletonService singletonService2 = new SingletonService();

        System.out.println("singletonService2 = " + singletonService1);
        System.out.println("singletonService2 = " + singletonService2);
    }
}
