package hello.core.singletone;

public class SingletoneService {

    // static으로 가짐 -> class 레벨에 올라가게 됨.
    private static final SingletoneService instance = new SingletoneService();

    public static SingletoneService getInstance() {
        return instance;
    }

    private SingletoneService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
