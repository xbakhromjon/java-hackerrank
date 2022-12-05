/**
 * @author : Bakhromjon Khasanboyev
 * @since : 05/12/22, Mon
 **/

public abstract class Shape {
    int length;
    int breadth;

    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public abstract int area();
}
