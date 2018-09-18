public class MyArray {
    public static void bubbleSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            boolean swapFlag = false;
            for (int j = a.length - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    int x = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = x;
                    swapFlag = true;
                }
            }
            if (!swapFlag) break;
        }
    }

}
