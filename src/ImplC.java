/**
 * @author : Bakhromjon Khasanboyev
 * @since : 05/12/22, Mon
 **/
public class ImplC implements BaseI, BaseC {
    public static void main(String[] args) {
        new ImplC().method();
    }

    @Override
    public void method() {
        System.out.println("Default");
    }
}

interface BaseI {
    default void method() {
        System.out.println("BaseI");
    }
}


interface BaseC {
    default void method() {
        System.out.println("A");
    }
}