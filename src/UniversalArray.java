import java.util.ArrayList;
import java.util.List;

public class UniversalArray<T> {

    private final List<T> arrayList;

    public UniversalArray() {
        arrayList = null;
    }

    public T getItem(int index) {
        return arrayList != null ? arrayList.get(index) : null;
    }

    public void setItem(int index, T item) {
        if (arrayList != null) {
            arrayList.add(index, item);
        }
    }

}
