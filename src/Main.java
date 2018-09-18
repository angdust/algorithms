import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int array[] = {1, 3, 2, 5, 4};
        Main.print(array);
        MyArray.bubbleSort(array);
        Main.print(array);
    }

    public static void print(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
