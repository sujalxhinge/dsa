import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {56, 45, 54, 65, 20, 99, 35};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // Change to < for descending order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the last pass, break
            if (!swapped) {
                break;
            }
        }
    }
}
