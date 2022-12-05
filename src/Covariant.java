/**
 * @author : Bakhromjon Khasanboyev
 * @since : 05/12/22, Mon
 **/
public class Covariant {

}


interface D {

}

class C implements D {

}

class A {
    D demo() {
        return null;
    }
}

class B extends A {
    C demo() {
        return null;
    }
}