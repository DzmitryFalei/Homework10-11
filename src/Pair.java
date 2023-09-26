public class Pair <T>{

    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }


    public T first() {
        return first;
    }

    public T last() {
        return second;
    }

    public void swap() {
        T temp = first;
        first = second;
        second = temp;
    }

    public void replaceFirst(T first) {
        this.first = first;
    }

    public void replaceLast(T second) {
        this.second = second;
    }
}
