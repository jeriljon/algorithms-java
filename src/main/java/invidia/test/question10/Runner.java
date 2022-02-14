package invidia.test.question10;

public class Runner {

    public static void main(String[] args) {
        final String x = "a";
        Runnable r = () -> System.out.println(x);
//        x = "b";
        r.run();
    }
}
