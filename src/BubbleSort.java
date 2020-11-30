import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] list) {
        boolean needPass = true;
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list.length - 1 && needPass; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
                needPass = true;
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {1, -1, 2, 3, 5, 6, 0};
        bubbleSort(list);
            System.out.println(Arrays.toString(list));
    }
}
