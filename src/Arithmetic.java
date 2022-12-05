/**
 * @author : Bakhromjon Khasanboyev
 * @since : 05/12/22, Mon
 **/
public class Arithmetic {
    public Integer sum(Integer[] ints){
        int sum = 0;
        for (Integer anInt : ints) {
            sum += anInt;
        }
        return sum;
    }

    public String sum(String[] strs){
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : strs) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
