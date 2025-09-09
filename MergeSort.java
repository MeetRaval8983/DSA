import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.err.println("Original array:");
        printArray(arr);
        mergeSort(arr);
        System.err.println("Sorted array:");
        printArray(arr);
    }
    static int[] mergeSort(int[] arr) {
        if(arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
    static int[] merge(int[] left, int[] right) {
        int[] r = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length) {
            if(left[i] <= right[j]) {
                r[k++] = left[i++];
            } else {
                r[k++] = right[j++];
            }
        }
        while(i < left.length) {
            r[k++] = left[i++];
        }
        while(j < right.length) {
            r[k++] = right[j++];
        }
        return r;
    }
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
