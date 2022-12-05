/**
 * @author : Bakhromjon Khasanboyev
 * @since : 05/12/22, Mon
 **/
class T implements Runnable {
    private Thread t;
    private String name;

    public T(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("HI");
    }

    public void start() {
        if (t == null) {
            t = new Thread(this, name);
            t.start();
        }
    }
}

public class Test {
    public static void main(String[] args) {
        T t = new T("A");
        t.start();
    }
}