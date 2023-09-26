public class TwoDimArray<T> {


    private final T[][] matrix;
    private int i = 0;
    private int k = 0;

    public TwoDimArray(T[][] matrix) {
            this.matrix = matrix;
        }

    public boolean hasNext() {

        return k < matrix[i].length && i < matrix.length;
    }

    public T next() {
        T item = matrix[i][k++];
        if (k >= matrix[i].length) {
            if (i < matrix.length - 1) {
                i++;
                k = 0;
            }
        }
        return item;
    }
//    private Integer[][] m;
//    private int i, j;
//    public ArrayIterator(Integer[][] m) {
//        this.m = m;
//    }
//
//    public boolean hasNext() {
//        return i < m.length && j < m[i].length;
//    }
//
//    public Integer next() {
//        Integer r = m[i][j++];
//        if (j >= m[i].length) {
//            i++;
//            j = 0;
//        }
//        return r;
//    }

}
