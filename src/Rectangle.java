/**
 * @author : Bakhromjon Khasanboyev
 * @since : 05/12/22, Mon
 **/
public class Rectangle extends Shape {
    public Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    public int area() {
        return length * breadth;
    }
}
