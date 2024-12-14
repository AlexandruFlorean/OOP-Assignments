package pb2;

public class CustomArray {
    int[] array;
    CustomArray(int[] array) {
        this.array = array;
    }
    public int addition() {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }
    public int substraction() {
        int dif = 0;
        for (int i : array) {
            if (i == 0) {
                dif = array[i];
            } else {
                dif -= i;
            }
        }
            return dif;
    }
    public void equality() {
        int sum1 = 0;
        int sum2 = 0;
        if(array.length / 2 == 0) {
            for(int i = 0; i < array.length; i++){
                if(i < array.length / 2) {
                    sum1 += array[i];
                } else {
                    sum2 += array[i];
                }
            }
            if(sum1 == sum2) {
                System.out.println("Equality");
            } else {
                System.out.println("Unequality");
            }
        } else {
            for(int i = 0; i < array.length; i++){
                if(i == array.length / 2){
                    i++;
                }
                if(i < array.length / 2) {
                    sum1 += array[i];
                } else {
                    sum2 += array[i];
                }
            }
        }
    }
}
