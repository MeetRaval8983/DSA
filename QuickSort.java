public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        sort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    static void sort(int[] a, int low, int high) {
        if(low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = a[m];
        while(s <= e) {
            while(a[s] < pivot) {
                s++;
            }
            while(a[e] > pivot) {
                e--;
            }
            if(s <= e) {
                int temp = a[s];
                a[s] = a[e];
                a[e] = temp;
                s++;
                e--;
            }
        }
        sort(a, low, e);
        sort(a, s, high);
    }
}
