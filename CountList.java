import java.util.ArrayList;

public class CountList<T> extends ArrayList<T> {

    //count
    public int countEqualTo(T arg) {
        int count = 0;
        for (T arr : this) {
            if (arr.equals(arg))  //
                count++;
        }
        return count;
    }
}
