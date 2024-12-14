package pb3;

public class Grade {
    private int[] array;
    public Grade (int[] array) {
        this.array = array;
    }
    public int lenghtArray() {
        return array.length;
    }

    public int getArray(int i) {
        return array[i];
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
